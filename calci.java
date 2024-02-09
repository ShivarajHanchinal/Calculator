// Java Program to Perform Arithmetic Operations using Methods
import java.util.Scanner;

class calci  extends branch1 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--::BASIC ARITHMETIC OPARATIONS::--");
        System.out.println("Enter first number:");
        int p = in.nextInt();
        System.out.println("Enter second number");
        int q = in.nextInt();

        System.out.println("\nSUM         " + p + " + " + q + " = " + Sum(p, q));
        System.out.println("DIFFERENCE  " + p + " - " + q + " = " + Sub(p, q));
        System.out.println("PRODUCT     " + p + " * " + q + " = " + Mul(p, q));
        System.out.println("QUOTIENT    " + p + " / " + q + " = " + Div(p, q));

        System.out.println("\n\nArithmetic operation like \nSQUARE CUBE POWER ");
        System.out.print("Enter one number for finding Square and cube : ");
        int a=in.nextInt();
        mySquare(a);
        myCube(a);
        System.out.println("Square of "+a+"is :"+mySquare(a));
        System.out.println("Cube of "+a+"is :"+myCube(a));
        System.out.println("Enter two number for finding power : ");
        int x=in.nextInt();
        int y=in.nextInt();
        myPower(x, y);
        System.out.println("Power of "+x+" and "+y+"is :"+myPower(x,y));
     }
    // To make sum of two numbers
    public static int Sum(int x, int y) {
        return x + y;
    }

    // To make subtraction of two numbers
    public static int Sub(int x, int y) {
        return x - y;
    }

    // To make multilication of two numbers
    public static int Mul(int x, int y) {
        return x * y;
    }

    // To make division of two numbers
    public static float Div(int x, int y) {
        return x / y;
    }

     
}