package testalot.com.hitscanapp.datalayer;

/**
 * Created by yongama.dilima on 2018/03/01.
 */

import com.google.firebase.database.*;
import testalot.com.hitscanapp.Model.*;
import testalot.com.hitscanapp.Model.Device;
import android.util.Log;

import java.util.UUID;

public class databasehelper {


    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRefDeviceCheckOut = database.getReference("DEVICE_STATUS");
    DatabaseReference myRefDevice = database.getReference("DEVICE");

    private static final String TAG = "PostDetailActivity";


    public void checkoutDevice(Device_Status ds)
    {

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        myRefDeviceCheckOut.child(randomUUIDString + "/").setValue(ds);

    }

    public void setUser(User user){

        myRefDeviceCheckOut.child(user.getName() + "/").setValue(user);
    }




}
