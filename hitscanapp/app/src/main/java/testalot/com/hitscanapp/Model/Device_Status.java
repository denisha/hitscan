package testalot.com.hitscanapp.Model;

/**
 * Created by yongama.dilima on 2018/03/01.
 */

public class Device_Status {

    private String ds_id;
    private String IMEI;
    private String date_of_Event;
    private String status;


    public Device_Status(String ds_id,  String IMEI , String date_of_Event, String status){

        this.ds_id = ds_id;
        this.IMEI = IMEI;
        this.date_of_Event = date_of_Event;
        this.status = status;
    }

    public Device_Status(){

    }

    public String getDs_id()
    {
        return this.ds_id;
    }

    public String getIMEI()
    {
        return this.IMEI;
    }
    public String getDescription()
    {
        return this.date_of_Event;
    }

}
