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
            Object currentString = iteratorModel.current();
            System.out.println(currentString);
            iteratorModel.next();
        }

    }
}
