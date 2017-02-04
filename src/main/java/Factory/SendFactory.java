package Factory;

/**
 * Created by my on 2017/1/1.
 */
public class SendFactory {



    public Factory send (String s ){

        if (s.equals("mail")){
            return new Factory_mail();
        }else if (s.equals("phone")){
            return new Factory_Phone();
        }
        return null;
    }
}
