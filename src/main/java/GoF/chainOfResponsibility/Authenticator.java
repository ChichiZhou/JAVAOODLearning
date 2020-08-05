package GoF.chainOfResponsibility;

public class Authenticator extends Handler{
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        Boolean isValid = (request.getUsername() == "admin" && request.getPassowrd() == "1234");

        System.out.println("Authentication");

        return !isValid;
    }
}
