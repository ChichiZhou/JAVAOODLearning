package GoF.decorator;

public class Main {
    public static void main(String[] args) {

        storeCreditCard(new EncryptedCloudStream(new CloudStream())); // 套娃
    }

    // 从这里开始 data直接传递给最外面一层
    public static void storeCreditCard(Stream stream){
        stream.write("1234-1234-1234");
    }
}
