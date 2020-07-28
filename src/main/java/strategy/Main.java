package strategy;

public class Main {
    /**
     * strategy 目的是增加 extension
     * 如果有更多的 class 加进去，不需要改动 main 中的code（这里指的是不需要改变logic）
     *
     * Change behavior of an object
     * 与 state pattern 的区别是，这里没有 state。
     */
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a");
    }
}
