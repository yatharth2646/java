import java.util.*;

class duplicate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] nums = { 1, 2, 3, 1 };
        Set<Integer> set = new HashSet<>();
        boolean duplocate = false;
        for (int ele : nums) {
            if (set.contains(ele)) {
                duplocate = true;
                break;
            }
            set.add(ele);
        }
        System.out.println(duplocate);
    }
}