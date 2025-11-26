class Hlo {

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
        obj.greet("Tagda code chal raha hai!");
    }
}
