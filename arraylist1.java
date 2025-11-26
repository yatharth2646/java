import java.util.*;

class text {
    public static void main(String args[]) {
        ArrayList<String> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a.add(sc.next());
        }
        System.out.println(a);
    }
}