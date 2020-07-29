package bridge;

public class AdvancedRemoteControl extends RemoteControl{
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(Integer number){
        device.setChannel(number);
    };
}
