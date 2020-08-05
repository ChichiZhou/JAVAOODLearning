package GoF.iterator;

/**
 * 这里用到了 泛型
 * 泛型的意义是将类型作为一个参数传递进去
 * IteratorModel<String>
 * IteratorModel<User>
 */
public interface IteratorModel<T> {
    boolean hasNext();
    T current();
    void next();
}

