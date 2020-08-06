package GoF.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        // 创建的顺序是逆序

        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        WebServer webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "1234"));
    }
}
