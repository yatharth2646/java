import java.util.Scanner;

class evenodd {
    public static String checkEvenOdd(int n) {
        if (n % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUM");
        int a = sc.nextInt();
        System.out.println(checkEvenOdd(a));

    }
}