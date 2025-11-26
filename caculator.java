import java.util.Scanner;

class calculator {

    public static void performOperation(int n1, int n2) {
        System.out.println("sum:" + (n1 + n2));
        System.out.println("DIFFERENCE :" + (n1 - n2));
        System.out.println("MUL:" + (n1 * n2));
        if (n2 != 0) {
            System.out.println("QUOTIENT:" + n1 / n2);
        } else {
            System.out.println("error  division by zero is not allowd");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A 1 NUM");
        int a = sc.nextInt();
        System.out.println("ENTER A 2 NUM");
        int b = sc.nextInt();
        performOperation(a, b);
    }
}