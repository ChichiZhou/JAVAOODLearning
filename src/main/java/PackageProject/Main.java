package PackageProject;

public class Main {
    public static void main(String[] args) {
        /**
         * 把请求包装成对象
         *
         * 这里最终要的一点是，面向对象编程是 靠对象之间的不断调用 来实现逻辑的
         */
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteControl.setCommand(0, lightOnCommand, new NoCommand());

        remoteControl.onButtonWasPressed(0);

    }
}
