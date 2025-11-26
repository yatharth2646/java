import java.util.*;

class maximum {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                System.out.println(list.get(i));
            }
        }
    }
}