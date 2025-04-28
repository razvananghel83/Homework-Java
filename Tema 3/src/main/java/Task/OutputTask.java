package Task;

public class OutputTask implements Task {
    private final String message;

    public OutputTask(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message);
    }
}