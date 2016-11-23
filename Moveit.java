package moveit;
import java.awt.Robot;
import java.util.Random;

public class Moveit {
    public static final int FIVE_SECONDS = 60000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;

    public static void main(String... args) throws Exception {
    	int count=0;
        Robot robot = new Robot();
        Random random = new Random();
        while (true) {
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            Thread.sleep(FIVE_SECONDS);
            System.out.println("Count is "+ count++);
        }
    }
}
