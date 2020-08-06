package GoF.bridge;

public  class RemoteControl {
    protected Device device;

    // 构造器
    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn(){
        device.turnOn();
    };

    public void turnOff(){
        device.turnOff();
    };


}
