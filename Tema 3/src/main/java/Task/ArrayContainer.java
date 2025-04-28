package Task;

public abstract class ArrayContainer implements Container {

    protected Task[] tasks;
    protected int capacity;
    protected static final int INITIAL_CAPACITY = 4;

    public ArrayContainer() {
        tasks = new Task[INITIAL_CAPACITY];
        capacity = 0;
    }

    protected void ensureCapacity() {

        if(capacity == tasks.length) {

            Task[] newArray = new Task[tasks.length * 2];
            System.arraycopy(tasks, 0, newArray, 0, tasks.length);
            tasks = newArray;
        }
    }

    @Override
    public boolean isEmpty() {
        return capacity == 0;
    }

    @Override
    public int size() {
        return capacity;
    }
}