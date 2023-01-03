package command.demo1.service.impl;

import command.demo1.service.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("NoCommand");
    }

    @Override
    public void undo() {

    }
}
