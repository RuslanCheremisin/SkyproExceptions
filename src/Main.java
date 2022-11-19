public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println(LoginPasswordUtil.checkData("1asd234567890", "123_", "123_"));
    }
}