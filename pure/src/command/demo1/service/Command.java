package command.demo1.service;

/**
 * 定义命令对象行为
 */
public interface Command {
    void execute();

    void undo();
}
