public class Cuboid {
    private float l;
    private float w;
    private float h;

    public void setVals(float length, float width, float height) {
        this.l = length;
        this.w = width;
        this.h = height;
    };

    public float getVolume() {
        return (l * w * h);
    }

    public float getSA() {
        return ((2 * l * w) + (2 * w * h) + (2 * l * h));
    }
}
