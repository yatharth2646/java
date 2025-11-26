import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rem;
        int sum = 0;
        while (temp > 0) {
            rem = temp % 10;
            sum = sum * 10 + rem;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
        sc.close();
    }

}
