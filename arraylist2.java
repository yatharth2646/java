import java.util.*;

class arraylist2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        int target = sc.nextInt();
        int index = list.indexOf(target);
        System.out.println(index);
    }
}