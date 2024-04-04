import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the three numbers : ");
        System.out.print("Enter first number : ");
        double a = number.nextDouble();
        System.out.print("Enter second number : ");
        double b = number.nextDouble();
        System.out.print("Enter third number : ");
        double c = number.nextDouble();

      if (a > b && a > c) {
        if (b > c) {
            System.out.println("increasing numbers are : " + c + " " + b + " " + a);
        } else {
            System.out.println("increasing numbers are : " + b + " " + c + " " + a);
        }
      } else if (b > a && b > c) {
        if (a > c) {
            System.out.println("increasing numbers are : " + c + " " + a + " " + b);
        } else {
            System.out.println("increasing numbers are : " + a + " " + c + " " + b);
        }
      } else if (c > a && c > b) {
        if (a > b) {
            System.out.println("increasing numbers are : " + b + " " + a + " " + c);
        } else {
            System.out.println("increasing numbers are : " + a + " " + b + " " + c);