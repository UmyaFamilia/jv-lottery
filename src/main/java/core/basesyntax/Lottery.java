package core.basesyntax;

import java.util.Random;
public class Lottery {
    public final static int BORDER=100;
    public Ball getRandomBall() {
        Random random = new Random();
        return new Ball(new ColorSupplier().getRandomColor(),random.nextInt(BORDER));
    }
}
