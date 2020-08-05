package GoF.adapter;

import GoF.adapter.avaFilters.Caramel;

public class Main {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
