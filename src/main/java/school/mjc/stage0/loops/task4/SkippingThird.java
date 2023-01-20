package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int count = 1;
        while (count < lastPrinted + 1) {
            if (count % 3 != 0) {
                System.out.println(count);
            }
            count++;
        }
    }
}
