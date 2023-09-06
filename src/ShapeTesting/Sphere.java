import java.lang.Math;

public class Sphere {
    private double r;

    public void setVals(double rad) {
        this.r = rad;
    };

    public double getVolume() {
        return (4 * Math.PI * Math.pow(r,3) / 3);
    }

    public double getSA() {
        return (4 * Math.PI * Math.pow(r,2));
    }

}
