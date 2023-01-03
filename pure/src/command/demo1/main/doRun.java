package command.demo1.main;

import command.demo1.service.Command;
import command.demo1.service.impl.*;

public class doRun {
    // 组合算法
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);
        Command[] onCommand = {lightOnCommand, garageDoorOpenCommand};
        Command[] offCommand = {lightOffCommand, garageDoorOffCommand};
        for (Command command : offCommand) {
            command.execute();
        }
        for (Command command : onCommand) {
            command.execute();
        }
    }
}
