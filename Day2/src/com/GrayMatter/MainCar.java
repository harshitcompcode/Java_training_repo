package com.GrayMatter;

public class MainCar {
    public static void main(String[] args) {
        Engine engine = new Engine("V8", 450);
        Car car = new Car("Ford", "Mustang", engine);

        System.out.println(car);
    }
}
