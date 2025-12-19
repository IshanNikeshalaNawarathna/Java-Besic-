package demo;

import interfaces.Engine;

class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol Engine");
    }
}

class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric Engine");
    }
}

class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
    }

}

public class Demo {

    public static void main(String[] args) {

        Engine engine = new ElectricEngine();
        Car car = new Car(engine);
        car.drive();

        Engine engine2 = new PetrolEngine();
        Car car2 = new Car(engine2);
        car2.drive();


    }

}
