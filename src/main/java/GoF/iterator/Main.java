package GoF.iterator;

public class Main {
    public static void main(String[] args) {
        BrowseHistory browseHistory = new BrowseHistory();
        IteratorModel iteratorModel = browseHistory.createIterator();

        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");

        while (iteratorModel.hasNext()){
            // 这里为什么是 Object ？？？？
            // 因为上面生成的是 IteratorModel，所以下面是按照 interface 的类型来返回的
            String currentString = (String)iteratorModel.current();
            System.out.println(currentString);
            iteratorModel.next();
        }

    }
}
