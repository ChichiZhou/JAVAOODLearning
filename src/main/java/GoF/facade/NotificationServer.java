package GoF.facade;

public class NotificationServer {
    public Connection connection(String ipAddress){
        return new Connection();
    }

    public AuthToken authenticate(String appID, String key){
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target){
        System.out.println("Sending a message");
    }

}
