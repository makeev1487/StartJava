public class Wolf {
    String name;
    char gender;
    double weight;
    int age;
    String color;

    public Wolf(String name, char gender, double weight, int age, String color) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    void howl() {
        System.out.println("Howling");
    }

    void sit() {
        System.out.println("Sitting");
    }

    void run() {
        System.out.println("Running");
    }

    void sleep () {
        System.out.println("Sleeping");
    }
}