package command.demo1.main;

import command.demo1.service.impl.GarageDoor;
import command.demo1.service.impl.GarageDoorOpenCommand;
import command.demo1.service.impl.Light;
import command.demo1.service.impl.LightOnCommand;

public class RemoteControlTest1 {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 接收者们
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        // 算法对象们
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        // 调用者
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
