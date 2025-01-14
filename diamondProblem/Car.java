/*DIAMOND PROBLEM SOLUTION.*/

package javac.diamondProblem;

public interface Car {
    default void drive() {
        System.out.println("CAR DRIVE METHOD");
    }
}

interface PetrolCar extends Car {
    @Override
    default void drive() {
        System.out.println("PETROL CAR DRIVE METHOD");
    }
}

interface ElectricCar extends Car {
    @Override
    default void drive() {
        System.out.println("ELECTRIC CAR DRIVE METHOD");
    }
}

class HybridCar implements PetrolCar, ElectricCar {

    @Override
    public void drive() {
        PetrolCar.super.drive();
        ElectricCar.super.drive();
    }

    public static void main(String[] args) {
        new HybridCar().drive();
    }
}