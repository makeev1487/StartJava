public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf("Rex", 'M', 40.6, 4, "gray");
        
        System.out.println("Name: " + wolf.name + "\n" +
                "Gender: " + wolf.gender + "\n" +
                "Weight: " + wolf.weight + "\n" +
                "Age: " + wolf.age + "\n" +
                "Color: " + wolf.color);

        wolf.howl();
        wolf.sit();
        wolf.run();
        wolf.sleep();
    }
}