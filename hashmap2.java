import java.util.HashMap;

class hashmap2 {

    static {
        System.out.println("🔥 Hlo Class Loaded Successfully!");
    }

    private String name;

    Hlo(String name) {
        this.name = name;
        System.out.println("🚀 Object Created for: " + name);
    }

    void greet() {
        System.out.println("👋 Hello " + name + ", Welcome to Java!");
    }

    void greet(String message) {
        System.out.println("💬 " + name + ": " + message);
    }

    static void info() {
        System.out.println("📘 This is the Hlo class – Ready to Rock!");
    }
}

public class Main {
    public static void main(String[] args) {

        Hlo.info();
        Hlo obj = new Hlo("Yatharth");

        obj.greet();
        obj.greet("HashMap2 ke sath code chal raha hai!");

        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        map1.put(1, "Apple");
        map1.put(2, "Banana");

        map2.put(10, "Car");
        map2.put(20, "Bike");

        System.out.println("Map1: " + map1);
        System.out.println("Map2: " + map2);

        System.out.println("Map1 get(1): " + map1.get(1));
        System.out.println("Map2 get(20): " + map2.get(20));
    }
}
