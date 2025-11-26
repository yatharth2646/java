public class frequency {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 1, 5, 1, 2 };
        int n = arr.length;

        boolean[] visited = new boolean[n];

        System.out.println("Frequency of each element:");

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }       

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " → " + count);
        }
    }
}
