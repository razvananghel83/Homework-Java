package Task;

import java.util.Random;

public class RandomOutTask implements Task {
    private final int randomNumber;
    private static final Random random = new Random();

    public RandomOutTask() {
        this.randomNumber = random.nextInt();
    }

    @Override
    public void execute() {
        System.out.println("Numărul aleator generat este: " + randomNumber);
    }
}
