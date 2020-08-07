package GoF.adapter;

import GoF.adapter.avaFilters.Caramel;

/**
 * 使用 compostion 目的是用来将 Caramel 包装成 Filter 这个类
 */

public class CaramelFilter implements Filter{
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
