from django.http import HttpResponse
import pyrebase
from django.template import loader

 # Initialize Firebase
config = {
    'apiKey': 'AIzaSyCWi_KKa2NyJ2mDH7xjiU0RZK4fFOcbq-w',
    'authDomain': 'hitscan-25b2a.firebaseapp.com',
    'databaseURL': 'https://hitscan-25b2a.firebaseio.com',
    'projectId': 'hitscan-25b2a',
    'storageBucket': 'hitscan-25b2a.appspot.com',
    'messagingSenderId': '988111583129'
  }

firebase = pyrebase.initialize_app(config)
auth = firebase.auth()
db = firebase.database()



def index(request):


    # get all devices
    user = auth.sign_in_with_email_and_password('khayelihle.tshuma@takealot.com', 'password')
    # Pass the user's idToken to the push method
    devices = db.child('device').get(user['idToken']).val()
    users = db.child('user').get(user['idToken']).val()
    device_status = db.child('device_status').get(user['idToken']).val()

    from IPython import embed

    all_users = []
    for user in list(users.items()):
        all_users.append(user[1])

    all_devices = []
    for device in list(devices.items()):
        all_devices.append(device[1])


    landing_row = []
    for i, (key, value) in enumerate(device_status.items()):

        value['user'] = next((item for item in all_users if item["user_id"] == value['user_id']), None)
        value['device'] = next((item for item in all_devices if item["IMEI"] == value['IMEI']), None)
        landing_row.append(value)

    template = loader.get_template('hitscan_admin/index.html')
    print(landing_row)
    context = {
        'log_items': landing_row,
    }
    return HttpResponse(template.render(context, request))
