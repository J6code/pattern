package command.demo1.main;

import command.demo1.service.impl.Light;
import command.demo1.service.impl.LightOnCommand;

public class RemoteControlTest {
    public static void main(String[] args) {
        // 遥控器-算法调用者
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 算法接收者
        Light light = new Light();
        // 算法对象
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        // 算法调用者
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
    }
}
