public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Coyote Tango");
        jaeger1.setMark("Mark-1");
        jaeger1.setHeight(280f);
        jaeger1.setWeight(2.312f);
        jaeger1.setSpeed(5);
        jaeger1.setStrength(7);
        jaeger1.setArmor(4);

        Jaeger jaeger2 = new Jaeger("Strike Eureka", "Mark-5");

        System.out.println("Model name: " + jaeger1.getModelName() + " Mark: " + jaeger1.getMark() + " Speed:" + 
                jaeger1.getStrength() + " Armor: " + jaeger1.getArmor() + "\nModel name: " + jaeger2.getModelName() +
                " Mark: " + jaeger2.getMark() + " Speed:" + jaeger2.getStrength() + " Armor: " + jaeger2.getArmor());

        jaeger1.jump();
        jaeger1.move();
        jaeger2.drift();
        jaeger2.attack();
    }
}