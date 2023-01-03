package command.demo1.service.impl;

import command.demo1.service.Command;

public class GarageDoorOffCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.un();
    }
}
