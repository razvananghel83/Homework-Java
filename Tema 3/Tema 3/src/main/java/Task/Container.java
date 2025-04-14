package Task;

public interface Container {

    void addTask(Task task);
    Task removeTask();
    boolean isEmpty();
    int size();
}