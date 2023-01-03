package command.demo1.service.impl;

import command.demo1.service.Command;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.un();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
