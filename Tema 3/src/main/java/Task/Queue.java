package Task;

public class Queue extends ArrayContainer {

    private int front = 0;

    @Override
    public void addTask(Task task) {

        ensureCapacity();
        tasks[capacity++] = task;
    }

    @Override
    public Task removeTask() {

        if(isEmpty()) {
            throw new IllegalStateException("Coada este goală");
        }

        Task task = tasks[front];
        System.arraycopy(tasks, 1, tasks, 0, --capacity);
        return task;
    }
}
