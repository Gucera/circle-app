public class circleTester {
    public static void main(String[] args) {
        circle myCircle = new circle(32);
        System.out.println("PI is: " + myCircle.pi);
        System.out.println("Radius is: " + myCircle.getRadius());
        System.out.println("Area of Circle is: " + myCircle.calculateArea());
        System.out.println("Circumference of the Circle: " + myCircle.calculateCircumference());
    }
}