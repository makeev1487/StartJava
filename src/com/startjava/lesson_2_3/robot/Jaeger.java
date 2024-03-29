package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark) {
        this(modelName, mark, 250f, 1.8f, 10, 10, 9);
    }

    public Jaeger(String modelName, String mark, float height, float weight, int speed,
            int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void drift() {
        System.out.println(modelName + ": turn drift mode!");
    }

    public void move() {
        System.out.println(modelName + ": jaeger moved!");
    }

    public void attack() {
        System.out.println(modelName + ": jaeger attacked!");
    }

    public void jump() {
        System.out.println(modelName + ": jaeger jumped!");
    }

    public String toString() {
        return "Name: " + modelName + '\n' +
            "Mark: " + mark + '\n' +
            "Speed: " + speed + '\n' +
            "Armor: " + armor;
    }
}