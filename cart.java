import java.util.*;

class cart {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(sc.next());
        }

        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(1, "Running Shoes");
        System.out.println(list);
        System.out.println(list.size());
    }
}
