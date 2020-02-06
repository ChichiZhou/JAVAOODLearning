package PackageProject;

public class LightOnCommand implements Command{
    /**
     * 命令中包含调用对象进行操作
     */
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute() {       // 这部分就是调用对象实现命令！！！！！！！！
        light.on();;
    }
}
