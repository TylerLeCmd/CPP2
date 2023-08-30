import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
        Cuboid rect = new Cuboid();
        rect.setVals(10,10,10);
        System.out.println("Your cuboid's volume is " + rect.getVolume() + ".");
    }
}