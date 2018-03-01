package testalot.com.hitscanapp.Model;

/**
 * Created by yongama.dilima on 2018/03/01.
 */

public class User {

    private String userId;
    private String name;


    public User(String userId, String name){

        this.userId = userId;
        this.name = name;
    }

    public String getUserID()
    {

        return this.userId;
    }

    public String getName()
    {

        return this.name;
    }
}
