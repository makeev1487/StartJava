public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf("Rex", 'M', 40.6, 6, "gray");
        
        System.out.println("Name: " + wolf.getName() + "\n" +
                "Gender: " + wolf.getGender() + "\n" +
                "Weight: " + wolf.getWeight() + "\n" +
                "Age: " + wolf.getAge() + "\n" +
                "Color: " + wolf.getColor());

        wolf.setName("Elbe");
        wolf.setGender('F');
        wolf.setWeight(35.6);
        wolf.setAge(5);
        wolf.setColor("White");

        System.out.println("\nName: " + wolf.getName() + "\n" +
                "Gender: " + wolf.getGender() + "\n" +
                "Weight: " + wolf.getWeight() + "\n" +
                "Age: " + wolf.getAge() + "\n" +
                "Color: " + wolf.getColor());

        wolf.howl();
        wolf.sit();
        wolf.run();
        wolf.sleep();
    }
}