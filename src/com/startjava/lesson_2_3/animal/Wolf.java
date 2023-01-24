public class Wolf {
    private String name;
    private char gender;
    private double weight;
    private int age;
    private String color;

    public Wolf(String name, char gender, double weight, int age, String color) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

     public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("\nIncorrect age");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void howl() {
        System.out.println("Howling");
    }

    public void sit() {
        System.out.println("Sitting");
    }

    public void run() {
        System.out.println("Running");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}