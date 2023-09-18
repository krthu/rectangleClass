public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,3,4,5);
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle(7,8);


        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);


        System.out.println(r1.calculateArea());
        System.out.println(r2.calculateArea());
        System.out.println(r3.calculateArea());

        System.out.println(r1.calculatePerimeter());
        System.out.println(r2.calculatePerimeter());
        System.out.println(r3.calculatePerimeter());


    }
}