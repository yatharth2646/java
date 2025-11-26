import java.util.Scanner;

class first {
    public static void displayUserInfo(String name, int age) {
        System.out.println("HELLO " + name + ",YOU ARE " + age + " years old");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        displayUserInfo(name, age);
    }
}