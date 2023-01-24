package com.startjava.lesson_2_3.robot;

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

        System.out.println(jaeger1);
        jaeger1.jump();
        jaeger1.move();

        System.out.println("\n" + jaeger2);
        jaeger2.drift();
        jaeger2.attack();
    }
}