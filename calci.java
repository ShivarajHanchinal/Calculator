import java.util.Scanner;

class Calculator3 {
    float a = 10, b = 50;

    void add() {
        System.out.println("Sum: " + (a + b));
    }

    void sub() {
        System.out.println("Diff: " + (a - b));
    }

    void div() {
        System.out.println("Quotient: " + (a / b));
    }

    void mul() {
        System.out.println("Product: " + (a * b));
    }
}

class A extends Calculator3 {
    public static void main(String[] args) {
        A calculatorI = new A();
        
        System.out.println("Enter the choice:");
        Scanner in = new Scanner(System.in);
        int ch = in.nextInt();

        switch (ch) {
            case 1:
                calculatorI.add();
                break;
            case 2:
                calculatorI.sub();
                break;
            case 3:
                calculatorI.div();
                break;
            case 4:
                calculatorI.mul();
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
