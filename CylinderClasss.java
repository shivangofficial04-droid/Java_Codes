class Cylinder {

    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class CylinderClasss {
    public static void main(String[] args) {

        Cylinder myCylinder = new Cylinder();

        myCylinder.setRadius(9);
        myCylinder.setHeight(12);

        System.out.println("Radius = " + myCylinder.getRadius());
        System.out.println("Height = " + myCylinder.getHeight());
    }
}
