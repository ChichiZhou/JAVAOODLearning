package decorator;

public class Main {
    /**
     * decorator 用来给某一个 object 加上某些操作
     *
     */
    public static void main(String[] args) {
       storeCreditCard(new EncryptedCloudStream(new CloudStream()));
    }

    public static void storeCreditCard(Stream stream){
        stream.write("1234-1234-1234");
    }
}
