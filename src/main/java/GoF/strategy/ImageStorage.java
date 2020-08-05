package GoF.strategy;

public class ImageStorage {
    private Compressor compressor;     // composition
    private Filter filter;             // composition

    // 构造器
    public ImageStorage(Compressor compressor, Filter filter){
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName){
        compressor.compress(fileName);
        filter.apply(fileName);

    }

}
