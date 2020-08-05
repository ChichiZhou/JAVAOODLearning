package GoF.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    // 如何这里换成一个 Array，则只需改变这里的代码，不需要改变 Main 里的代码
    // 但是我觉着还是可以再进一步改变的
    private List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        Integer lastIndex = urls.size() - 1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);

        return lastUrl;
    }

    public IteratorModel createIterator(){
        return new ListIterator(this);
    }

    // nested class because this is inside BrowseHistory
    // 这里使用了 内部类
    public class ListIterator implements IteratorModel<String> {
        private BrowseHistory history;
        private Integer index;

        public ListIterator(BrowseHistory history){
            this.history = history;
        }
        @Override
        public boolean hasNext() {
            // 因为是内部类，所以能够知道 private 变量
            return (index < history.urls.size());
        }

        // 泛型 这里返回的数据类型和最开始 IteratorModel<T> 中的 T 是一致的
        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
