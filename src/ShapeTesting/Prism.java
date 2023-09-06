import java.lang.Math;

public class Prism {
    private double l;
    private double b;
    private double h;

    public void setRegVals(double length, double base) {
        this.l = length;
        this.b = base;
        this.h = Math.sqrt(Math.pow(base, 2) - Math.pow(0.5 * base, 2));
    };

    public void setIsoVals(double length, double base, double height) {
        this.l = length;
        this.b = base;
        this.h = height;
    };

    public double getVolume() {
        return (l * b * h / 2);
    }

    public double getSA() {
        return ((b * h) + (b * l) + ((Math.sqrt(Math.pow(b / 2, 2) + Math.pow(h, 2))) * l * 2));
    }

    public double testValue() {
        return h;
    }
}
