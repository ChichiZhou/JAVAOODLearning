package GoF.adapter;

import GoF.adapter.avaFilters.Caramel;

/**
 * 使用继承。目的是用来将 Caramel 包装成 Filter 这个类
 */
public class CaramelAdapter extends Caramel implements Filter{


    @Override
    public void apply(Image image) {
        // 效果是一样的
        init();
        render(image);
    }
}
