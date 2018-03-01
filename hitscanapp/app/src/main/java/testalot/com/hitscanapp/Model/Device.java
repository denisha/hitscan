package testalot.com.hitscanapp.Model;

/**
 * Created by yongama.dilima on 2018/03/01.
 */

public class Device {


    private String IMEI;
    private String deviceModel;
    private String description;
    private String serialNumber;


    public Device(String imei,  String deviceModel , String description , String serialNumber){

        this.IMEI = imei;
        this.deviceModel = deviceModel;
        this.description = description;
        this.serialNumber = serialNumber;
    }

    public Device(){

    }

    public String getImei()
    {
        return this.IMEI;
    }

    public String getDeviceModel()
    {
        return this.deviceModel;
    }
    public String getDescription()
    {
        return this.description;
    }
    public String getserialNumber()
    {
        return this.serialNumber;
    }

}
