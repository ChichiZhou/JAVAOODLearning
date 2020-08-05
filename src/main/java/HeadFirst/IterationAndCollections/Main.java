package HeadFirst.IterationAndCollections;

public class Main {
    public static void main(String[] args) {
        /**
         * Iterator 的用法就是用在 while 循环中
         * GoF.iterator.hasnext() 用来进行循环的判断
         * GoF.iterator.next() 用来返回下一个元素
         *
         * 凡是实现 collection 接口的，都有一个 GoF.iterator
         * 可以用 collection.GoF.iterator() 来返回这个 GoF.iterator
         *
         */
        MenuItem menuItem = new MenuItem("Ass", "Shilin's ass", 1.2);

        /**
         * 使用 Iterator 的方法
         *
         * 生成这个对象的 GoF.iterator 然后迭代这个 GoF.iterator
         */
        DinerMenu dinerMenu = new DinerMenu();
        MenuIterator menuIterator = dinerMenu.createIterator();

        while(menuIterator.hasNext()){
            MenuItem nextMenuItem = menuIterator.next();
            System.out.println(nextMenuItem.name);
        }

    }
}
