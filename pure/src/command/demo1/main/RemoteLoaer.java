package command.demo1.main;

import command.demo1.service.impl.*;

public class RemoteLoaer {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);
        remoteControl.setCommand(1, garageDoorOpenCommand, garageDoorOffCommand);

        System.out.println(remoteControl.toString());
    }
}
