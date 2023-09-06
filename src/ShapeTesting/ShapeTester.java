import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
        boolean runtime = true;
        Scanner beans = new Scanner(System.in);
        Cuboid rect = new Cuboid();
        Prism trig = new Prism();
        Sphere circ = new Sphere();
        System.out.println("Welcome to the Shape Solver! (We solve all of your shape problems!)");
        while (runtime) {
            System.out.println(
                    "Please, pick a shape from the following list:" + "\n" + "\n" + "Cube-Like Shape (Cuboid)" + "\n"
                            + "Prism of Triangle (Triangular Prism)" + "\n" + "Big Circle (Sphere)");
            System.out.println();
            System.out.println(
                    "|Hint: You can type the full name of the shape, or 'C' for Cuboid, 'T' for Triangular Prism, and 'S' for Sphere!|");
            String options = beans.nextLine();
            if (options.toLowerCase().equals("cuboid") || options.toLowerCase().equals("c")) {
                System.out.println("\n" + "I love Cube-Like Shapes! Let's get some dimensions for your Cuboid!");
                System.out.println("What is the length of your cuboid?");
                float cLength = beans.nextFloat();
                // while (!isFloat(Float.toString(cLength))){}
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
                    beans.close();
                }
            } else if (options.toLowerCase().equals("triangular prism") || options.toLowerCase().equals("t")
                    || options.toLowerCase().equals("triangularprism")) {
                System.out.println(
                        "\n" + "I love triangles! However, I need to know what triangle your prism is based on.");
                System.out.println("Is the triangle of your prism equilateral or not? (Y/N)");
                String ep = beans.nextLine();
                if (ep.toLowerCase().equals("yes") || ep.toLowerCase().equals("y")) {
                    System.out.println("What is the length of your prism?");
                    double tLength = beans.nextFloat();
                    System.out.println("What is the base-distance of your prism?");
                    double tWidth = beans.nextFloat();
                    trig.setRegVals(tLength, tWidth);
                    System.out.println("Great! Just crunched some numbers:" + "\n"
                            + "The volume of your triangular prism (rounded to .00) is: "
                            + Math.round(trig.getVolume() * 100) / 100
                            + "\n" + "The surface area of your cuboid (rounded to .00) is: "
                            + Math.round(trig.getSA() * 100) / 100);
                    System.out.println("\n" + "Start a new calculation? (Y/N)");
                    beans.nextLine();
                    String res = beans.nextLine();
                    if (res.toLowerCase().equals("y")) {
                        runtime = true;
                    } else {
                        System.out.println("Goodbye!");

                        runtime = false;
                        beans.close();
                    }
                } else if (ep.toLowerCase().equals("no") || ep.toLowerCase().equals("n")) {
                    System.out.println("What is the length of your prism?");
                    double tLength = beans.nextFloat();
                    System.out.println("What is the base-distance of your prism?");
                    double tWidth = beans.nextFloat();
                    System.out.println("Finally, what is the height of your prism?");
                    double tHeight = beans.nextFloat();
                    trig.setIsoVals(tLength, tWidth, tHeight);
                    System.out.println("Awesome! Just crunched some numbers:" + "\n"
                            + "The volume of your cuboid (rounded to .00) is: "
                            + Math.round(trig.getVolume() * 100) / 100
                            + "\n" + "The surface area of your cuboid (rounded to .00) is: "
                            + Math.round(trig.getSA() * 100) / 100);
                    System.out.println("\n" + "Start a new calculation? (Y/N)");
                    beans.nextLine();
                    String res = beans.nextLine();
                    if (res.toLowerCase().equals("y")) {
                        runtime = true;
                    } else {
                        System.out.println("Goodbye!");

                        runtime = false;
                        beans.close();
                    }
                }
            } else if (options.toLowerCase().equals("sphere") || options.toLowerCase().equals("s")) {
                System.out.println("\n" + "I love Spheres! Let's get some dimensions for your Sphere!");
                System.out.println("What is the radius of your sphere?");
                double sRad = beans.nextFloat();
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
                    System.out.println("Goodbye!");

                    runtime = false;
                    beans.close();
                }
            } else {
                System.out.println("\n" + "Please try again." + "\n");
                runtime = true;
            }
        }
    }
}
