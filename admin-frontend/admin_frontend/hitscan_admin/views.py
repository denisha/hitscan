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



def index(request):
    template = loader.get_template('hitscan_admin/index.html')
    context = {
        'latest_question_list': 'latest_question_list',
    }
    return HttpResponse(template.render(context, request))

def __fb_test__():
    auth = firebase.auth()
    user = auth.sign_in_with_email_and_password('khayelihle.tshuma@takealot.com', 'password')
    db = firebase.database()

    data = {
        'IMEI': 123456,
        'deviceModel': 'ks360',
        'discription': 'its a phone',
        'serialNumber': 12345}

    # Pass the user's idToken to the push method
    results = db.child("DEVICE").push(data, user['idToken'])

    # Pass the user's idToken to the push method
    results = db.child("DEVICE").get(user['idToken'])
