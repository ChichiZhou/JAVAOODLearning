package proxy;

public class RealEbook implements Ebook {
    private String fileName;

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
