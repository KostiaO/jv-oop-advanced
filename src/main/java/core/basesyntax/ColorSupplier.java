package core.basesyntax;

import enums.Color;
import java.util.Random;

public class ColorSupplier {
    private static final Color[] colors = Color.values();
    private final Random random = new Random();

    public Color getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
