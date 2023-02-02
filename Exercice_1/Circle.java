/**
 * Circle
 */
public class Circle {

    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {

        return radius;

    }

    public void setRadius(double radius) {

        this.radius = radius;

    }

    @Override
    public String toString() {

        return "Circle [radius=" + radius + "]";

    }

    public double getArea() {

        double aire = ((this.radius * this.radius * Math.PI) / 2);

        return aire;

    }

    public static void main(String[] args) {

        Circle circle1 = new Circle();

        Circle circle2 = new Circle();

        Circle circle3 = new Circle();

        circle1.setRadius(2.0);

        circle2.setRadius(12);

        circle3.setRadius(24);

        double aire1 = ((circle1.getRadius() * circle1.getRadius() * Math.PI) / 2);

        double aire2 = ((circle2.getRadius() * circle1.getRadius() * Math.PI) / 2);

        double aire3 = ((circle3.getRadius() * circle1.getRadius() * Math.PI) / 2);

        System.out.println("Afficher le rayon  " + circle1.toString() + " Aire du cercle est  :  " + aire1);

        System.out.println("Afficher le rayon  " + circle2.toString() + " Aire du cercle est  :  " + aire2);

        System.out.println("Afficher le rayon  " + circle3.toString() + " Aire du cercle est  :  " + aire3);

        Circle circle = new Circle();

        System.out.println("Aire du cercle  " + circle.getArea());

    }

}