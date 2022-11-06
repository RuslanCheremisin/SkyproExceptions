public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        LoginPasswordUtil loginPasswordUtil = new LoginPasswordUtil("1asd234567890","123_","123_");
        loginPasswordUtil.getLoginPasswordInfo();
    }
}