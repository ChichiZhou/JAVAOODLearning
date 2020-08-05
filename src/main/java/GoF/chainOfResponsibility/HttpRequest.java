package GoF.chainOfResponsibility;

public class HttpRequest {
    private String username;
    private String passowrd;

    public HttpRequest(String username, String passowrd) {
        this.username = username;
        this.passowrd = passowrd;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }
}
