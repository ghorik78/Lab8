package Classes;

import java.io.Serializable;

public class ObjectColor implements Serializable {
    double red;
    double green;
    double blue;

    public double getRed() {
        return red;
    }
    public void setRed(double red) {
        this.red = red;
    }

    public double getGreen() {
        return green;
    }
    public void setGreen(double green) {
        this.green = green;
    }

    public double getBlue() {
        return blue;
    }
    public void setBlue(double blue) {
        this.blue = blue;
    }
}
