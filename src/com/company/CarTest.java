package com.company;

public class CarTest {
    public static void main(String[] args) {

        // Создаем объекты и инициализурем поля
        Car carOne = new Car();
        carOne.brand = "Toyota";
        carOne.color = "Grey";
        carOne.typeOfMotor = "Petrol";
        carOne.numOfDoors = 4;

        Car carTwo = new Car();
        carTwo.brand = "BMW";
        carTwo.color = "White";
        carTwo.typeOfMotor = "Diesel";
        carTwo.numOfDoors = 5;

        Car carThree = new Car();
        carThree.brand = "Ford";
        carThree.color = "Red";
        carThree.typeOfMotor = "Gas";
        carThree.numOfDoors = 2;

        // Выводим значение полей каждого объекта
        System.out.println("Brand car: " + carOne.brand + ',' + " Color: " + carOne.color + ','
                + " Motor: " + carOne.typeOfMotor + ',' + " Doors = " + carOne.numOfDoors + ','
                + " Wheels = " + carOne.numOfWheels);

        System.out.println("Brand car: " + carTwo.brand + ',' + " Color: " + carTwo.color + ','
                + " Motor: " + carTwo.typeOfMotor + ',' + " Doors = " + carTwo.numOfDoors + ','
                + " Wheels = " + carTwo.numOfWheels);

        System.out.println("Brand car: " + carThree.brand + ',' + " Color: " + carThree.color + ','
                + " Motor: " + carThree.typeOfMotor + ',' + "Doors = " + carThree.numOfDoors + ','
                + " Wheels = " + carThree.numOfWheels);

    }
}