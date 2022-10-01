import java.util.Random;

public class Car {

    private int currentPosition;
    private final CarMoveCondition carMoveCondition;

    public int getCurrentPosition() {
        return currentPosition;
    }

    public Car() {
        this.currentPosition = 0;
        this.carMoveCondition = new CarMoveCondition(new RandomIntegerGenerator());
    }

    public void move() {
        if (carMoveCondition.checkMoveCondition()) return;
        currentPosition++;
    }
}
