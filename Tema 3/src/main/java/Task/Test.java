package Task;

public class Test {
    public static void main(String[] args) {

        System.out.println("Testarea OutputTask:");
        Task outTask = new OutputTask("Test rulat de OutputTask");
        outTask.execute();

        Task helloworld = new OutputTask("Hello world (scris prin OutputTask)");
        helloworld.execute();

        System.out.println("\nTestarea RandomOutClass:");
        Task randomTask1 = new RandomOutTask();
        Task randomTask2 = new RandomOutTask();
        Task randomTask3 = new RandomOutTask();

        randomTask1.execute();
        randomTask2.execute();
        randomTask3.execute();

        System.out.println("\nTestarea CounterOutClass:");
        Task counterTask1 = new CounterOutTask();
        Task counterTask2 = new CounterOutTask();

        counterTask1.execute();
        counterTask2.execute();
        new CounterOutTask().execute();

        System.out.println("\n\nTestare Stack:");
        Container stack = new Stack();

        stack.addTask(new OutputTask("Task 1"));
        stack.addTask(new OutputTask("Task 2"));
        stack.addTask(new OutputTask("Task 3"));

        while(!stack.isEmpty()) {
            stack.removeTask().execute();
        }

        System.out.println("\nTestare Queue:");
        Container queue = new Queue();

        queue.addTask(new OutputTask("Task A"));
        queue.addTask(new OutputTask("Task B"));
        queue.addTask(new OutputTask("Task C"));

        while(!queue.isEmpty()) {
            queue.removeTask().execute();
        }

    }
}
