package testalot.com.hitscanapp.datalayer;

import com.google.firebase.database.*;
import testalot.com.hitscanapp.Model.*;
import testalot.com.hitscanapp.Model.Device;
import android.util.Log;

import java.util.UUID;

public class databasehelper {


    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRefDeviceCheckOut = database.getReference("DEVICE_STATUS");
    DatabaseReference myRefDevice = database.getReference("DEVICE");
    DatabaseReference myRefUser = database.getReference("User");

    private static final String TAG = "PostDetailActivity";


    public void checkoutDevice(Device_Status ds)
    {

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        myRefDeviceCheckOut.child(randomUUIDString + "/").setValue(ds);

    }

    public void setUser(User user){

        myRefUser.child(user.getUserID() + "/").child("Name").setValue(user.getName());
    }


}
