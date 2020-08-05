package GoF.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    // 这里有一点质疑？？？？？？？？？？
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

    public Iterator createIterator(){
        return new ListIterator(this);
    }

    // nested class because this is inside BrowseHistory
    public class ListIterator implements Iterator{
        private BrowseHistory history;
        private Integer index;

        public ListIterator(BrowseHistory history){
            this.history = history;
        }
        @Override
        public boolean hasNext() {
            // because this class is the nested class, it can see all the member of this class even if they are private
            return (index < history.urls.size());
        }

        @Override
        public Object current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
