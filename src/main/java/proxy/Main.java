package proxy;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        String[] fileNames = {"f", "u", "c"};
        for (String filename: fileNames){
            library.add(new EbookProxy(filename));
        }

        library.openEbook("a");
    }
}
