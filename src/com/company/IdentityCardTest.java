package com.company;

public class IdentityCardTest {
    public static void main(String[] args) {

        // Создаем объекты и инициализируем поля
        // Образы вымышлены и совпадение с ральными лицами чисто случайны )
        IdentityCard IdentityCardOne = new IdentityCard();
        IdentityCardOne.Country = "Ukraine";
        IdentityCardOne.firstName = "Ivan";
        IdentityCardOne.lastName = "Popov";
        IdentityCardOne.seriesOfIdentityCard = "HK";
        IdentityCardOne.numberOfIdentityCard = 333444;

        IdentityCard IdentityCardTwo = new IdentityCard();
        IdentityCardTwo.Country = "USA";
        IdentityCardTwo.firstName = "John";
        IdentityCardTwo.lastName = "Stalker";
        IdentityCardTwo.seriesOfIdentityCard = "PL";
        IdentityCardTwo.numberOfIdentityCard = 309043;

        IdentityCard IdentityCardThree = new IdentityCard();
        IdentityCardThree.Country = "Georgia";
        IdentityCardThree.firstName = "Nikolos";
        IdentityCardThree.lastName = "Suhishvilli";
        IdentityCardThree.seriesOfIdentityCard = "GR";
        IdentityCardThree.numberOfIdentityCard = 13849;

        // Выводим поля объектов
        System.out.println("Countri - " + IdentityCardOne.Country + ',' + " First name - "
                + IdentityCardOne.firstName + ',' + " Last name - " + IdentityCardOne.lastName + ','
                + " Series Card - " + IdentityCardOne.seriesOfIdentityCard + ',' + " Number Card - "
                + IdentityCardOne.numberOfIdentityCard);

        System.out.println("Countri - " + IdentityCardTwo.Country + ',' + " First name - "
                + IdentityCardTwo.firstName + ',' + " Last name - " + IdentityCardTwo.lastName + ','
                + " Series Card - " + IdentityCardTwo.seriesOfIdentityCard + ',' + " Number Card - "
                + IdentityCardTwo.numberOfIdentityCard);

        System.out.println("Countri - " + IdentityCardThree.Country + ',' + " First name - "
                + IdentityCardThree.firstName + ',' + " Last name - " + IdentityCardThree.lastName + ','
                + " Series Card - " + IdentityCardThree.seriesOfIdentityCard + ',' + " Number Card - "
                + IdentityCardThree.numberOfIdentityCard);

    }
}
