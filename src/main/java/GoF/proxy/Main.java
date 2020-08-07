package GoF.proxy;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        String[] fileNames = {"f", "u", "c", "k", "y", "o", "u"};
        // 这里 library 存储的就是 proxy，而不是 Ebook
        for (String filename: fileNames){
            library.add(new EbookProxy(filename));
        }

        library.openEbook("u");
    }
}
