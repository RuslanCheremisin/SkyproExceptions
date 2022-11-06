import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginPasswordUtil {
    private final String login;
    private final String password;
    private final String confirmPassword;


    public LoginPasswordUtil (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{

        Pattern pt = Pattern.compile("\\w{1,20}");
        Matcher mt=pt.matcher(login);

        if(!mt.matches()){
            throw new WrongLoginException("Wrong Login Exception");
        }else {
            this.login = login;
        }
        mt=pt.matcher(password);
        if(!mt.matches()){
            throw new WrongPasswordException("Wrong Password Exception");
        }else {
            this.password = password;}
        mt=pt.matcher(confirmPassword);
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Wrong Password Exception: Confirming password doesn't match");
        }else {
            this.confirmPassword = confirmPassword;}

    }

    public void checkPassword(String text){

    }

    public void getLoginPasswordInfo() {
        System.out.println(login + "\n"+password);
    }
}

