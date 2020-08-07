package GoF.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        // 创建的顺序是逆序，而且层层包裹，类似于 decorator 结构

        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        WebServer webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "1234"));
    }
}
