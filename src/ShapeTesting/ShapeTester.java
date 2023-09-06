import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
        boolean runtime = true;
        Scanner beans = new Scanner(System.in);
        Cuboid rect = new Cuboid();
        Prism trig = new Prism();
        Sphere circ = new Sphere();
        while (runtime) {
            System.out.println("Welcome to the Shape Solver! (We solve all of your shape problems!)" + "\n"
                    + "Please, pick a shape from the following list:" + "\n" + "\n" + "Cube-Like Shape (Cuboid)" + "\n"
                    + "Prism of Triangle (Triangular Prism)" + "\n" + "Big Circle (Sphere)");
            System.out.println();
            System.out.println(
                    "|Hint: You can type the full name of the shape, or 'C' for Cuboid, 'T' for Triangular Prism, and 'S' for Sphere!|");
            String options = beans.nextLine();
            if (options.toLowerCase().equals("cuboid") || options.toLowerCase().equals("c")) {
                System.out.println("\n" + "I love Cube-Like Shapes! Let's get some dimensions for your Cuboid!");
                System.out.println("What is the length of your cuboid?");
                float cLength = beans.nextFloat();
                System.out.println("What is the width of your cuboid?");
                float cWidth = beans.nextFloat();
                System.out.println("Finally, what is the height of your cuboid?");
                float cHeight = beans.nextFloat();
                rect.setVals(cLength, cWidth, cHeight);
                System.out.println("Awesome! Just crunched some numbers:" + "\n"
                        + "The volume of your cuboid (rounded to .00) is: " + Math.round(rect.getVolume() * 100) / 100
                        + "\n" + "The surface area of your cuboid (rounded to .00) is: "
                        + Math.round(rect.getSA() * 100) / 100);
                System.out.println("\n" + "Start a new calculation? (Y/N)");
                beans.nextLine();
                String res = beans.nextLine();
                if (res.toLowerCase().equals("y") || res.toLowerCase().equals("yes")) {
                    runtime = true;
                } else {
                    System.out.println("Goodbye!");
                    runtime = false;
                }
            } else if (options.toLowerCase().equals("triangular prism") || options.toLowerCase().equals("t")
                    || options.toLowerCase().equals("triangularprism")) {
                System.out.println(
                        "\n" + "I love triangles! However, I need to know what triangle your prism is based on.");
                System.out.println("Is the triangle of your prism equilateral or not? (Y/N)");
                if (beans.nextLine().toLowerCase().equals("yes") || beans.nextLine().toLowerCase().equals("y")) {
                    System.out.println("What is the length of your prism?");
                    float tLength = beans.nextFloat();
                    System.out.println("What is the base-distance of your prism?");
                    float tWidth = beans.nextFloat();
                    trig.setRegVals(tLength, tWidth);
                }
                System.out.println("What is the length of your prism?");
                float tLength = beans.nextFloat();
                System.out.println("What is the base-distance of your prism?");
                float tWidth = beans.nextFloat();
                System.out.println("Finally, what is the height of your cuboid?");
                float tHeight = beans.nextFloat();
                trig.setVals(tLength, tWidth, tHeight);
                System.out.println("Awesome! Just crunched some numbers:" + "\n"
                        + "The volume of your cuboid (rounded to .00) is: " + Math.round(rect.getVolume() * 100) / 100
                        + "\n" + "The surface area of your cuboid (rounded to .00) is: "
                        + Math.round(rect.getSA() * 100) / 100);
                System.out.println("\n" + "Start a new calculation? (Y/N)");
                beans.nextLine();
                String res = beans.nextLine();
                if (res.toLowerCase().equals("y")) {
                    runtime = true;
                } else {
                    runtime = false;
                }
            } else if (options.toLowerCase().equals("sphere") || options.toLowerCase().equals("s")) {
                System.out.println("\n" + "I love Spheres! Let's get some dimensions for your Sphere!");
                System.out.println("What is the radius of your sphere?");
                float sRad = beans.nextFloat();
                circ.setVals(sRad);
                System.out.println("Awesome! Just crunched some numbers:" + "\n"
                        + "The volume of your cuboid (rounded to .00) is: " + Math.round(circ.getVolume() * 100) / 100
                        + "\n" + "The surface area of your cuboid (rounded to .00) is: "
                        + Math.round(circ.getSA() * 100) / 100);
                System.out.println("\n" + "Start a new calculation? (Y/N)");
                beans.nextLine();
                String res = beans.nextLine();
                if (res.toLowerCase().equals("y")) {
                    runtime = true;
                } else {
                    runtime = false;
                }
            } else {
            }
            beans.close();
        }
    }
}
