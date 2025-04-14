package Task;

public class Stack extends ArrayContainer {

    @Override
    public void addTask(Task task) {

        ensureCapacity();
        tasks[capacity++] = task;
    }

    @Override
    public Task removeTask() {

        if(isEmpty()) {

            throw new IllegalStateException("Stiva este goală");
        }
        return tasks[--capacity];
    }
}