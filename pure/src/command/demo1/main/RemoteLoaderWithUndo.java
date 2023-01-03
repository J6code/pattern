package command.demo1.main;

import command.demo1.service.impl.*;

public class RemoteLoaderWithUndo {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteControlWithUndo.setCommand(0, lightOnCommand, lightOffCommand);

//        GarageDoor garageDoor = new GarageDoor();
//        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
//        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);
//        remoteControlWithUndo.setCommand(1, garageDoorOpenCommand, garageDoorOffCommand);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.onButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();
    }
}
