package com.company;

public class CountryTest {
    public static void main(String[] args) {

        // Создаем объекты и инициализируем поля
        // Значение полей не соответствуют действительности
        Country countryOne = new Country();
        countryOne.nameOfCountry = "Ukraine";
        countryOne.countryArea = 985_952;
        countryOne.populationOfCountry = 45_346_353;
        countryOne.race = "European race";
        countryOne.religionOfCountry = "Christianity";

        Country countryTwo = new Country();
        countryTwo.nameOfCountry = "Iran";
        countryTwo.countryArea = 123_321;
        countryTwo.populationOfCountry = 345_723;
        countryTwo.race = "Muslims";
        countryTwo.religionOfCountry = "Islam";

        Country countryThree = new Country();
        countryThree.nameOfCountry = "India";
        countryThree.countryArea = 1_234_329;
        countryThree.populationOfCountry = 1_012_434_982;
        countryThree.race = "Hindus";
        countryThree.religionOfCountry = "Hinduism";

        // Выводим значение полей каждого объекта
        System.out.println("Country - " + countryOne.nameOfCountry + ',' + " Area = " + countryOne.countryArea + ','
                + " Population = " + countryOne.populationOfCountry + ',' + " Race - " + countryOne.race + ','
                + " Religion - " + countryOne.religionOfCountry);

        System.out.println("Country - " + countryTwo.nameOfCountry + ',' + " Area = " + countryTwo.countryArea + ','
                + " Population = " + countryTwo.populationOfCountry + ',' + " Race - " + countryTwo.race + ','
                + " Religion - " + countryTwo.religionOfCountry);

        System.out.println("Country - " + countryThree.nameOfCountry + ',' + " Area = " + countryThree.countryArea + ','
                + " Population = " + countryThree.populationOfCountry + ',' + " Race - " + countryThree.race + ','
                + " Religion - " + countryThree.religionOfCountry);

    }
}
