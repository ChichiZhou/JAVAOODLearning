package GoF.proxy;

public class RealEbook implements Ebook {
    private String fileName;

    // 要生成新的 ebook 就需要 load
    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load(){
        System.out.println("Loaidng the Ebook");
    }

    @Override
    public void show(){
        System.out.println("Showing Ebook");
    }

    @Override
    public String getFileName(){
        return fileName;
    }
}
