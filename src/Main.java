import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Här skapar vi rektanglar");

        System.out.println("Ange höjden:");
        double height = sc.nextDouble();

        System.out.println("Ange bredden:");
        double width = sc.nextDouble();

        Rectangle r1 = new Rectangle(width, height);

        print(r1)


    }
}