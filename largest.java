import java.util.*;

class largest {
    public static int findLargest(int a, int b, int c) {
        int max = a;
        if (max > b) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        largest g = new largest();
        System.out.println(g.findLargest(n1, n2, n3));
    }
}