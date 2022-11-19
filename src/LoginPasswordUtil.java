import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginPasswordUtil {
    private String login;
    private String password;
    private String confirmPassword;


    private LoginPasswordUtil(String login, String password, String confirmPassword) {


    }

    public static boolean checkData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        LoginPasswordUtil loginPasswordUtil = new LoginPasswordUtil(login, password, confirmPassword);

        Pattern pt = Pattern.compile("\\w{1,20}");
        Matcher mt = pt.matcher(login);

        if (mt.matches()) {
            loginPasswordUtil.login = login;
            mt = pt.matcher(password);
        } else {
            throw new WrongLoginException("Wrong Login Exception");
        }
        if (mt.matches()) {
            loginPasswordUtil.password = password;
            mt = pt.matcher(confirmPassword);

        } else {
            throw new WrongPasswordException("Wrong Password Exception");

        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong Password Exception: Confirming password doesn't match");
        } else {
            loginPasswordUtil.confirmPassword = confirmPassword;
            return true;
        }
    }


}

