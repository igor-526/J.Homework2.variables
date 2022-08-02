package com.company;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        byte byteVar = 7; //инициализируем переменную с типом данных "byte"
        int intVar = 45; //инициализируем переменную с типом данных "integer"
        long longVar = 61446814554795234L; //инициализируем переменную с типом данных "long"
        float floatVar = 14.34F; //инициализируем переменную с типом данных "float"
        double doubleVar = 14.26961416531862; //инициализируем переменную с типом данных double

        //Задание 2
        float boxerFirstWeight = 78.2F;
        float boxerSecondWeight = 82.7F;
        float boxersWeight = boxerFirstWeight + boxerSecondWeight; //Ищем общий вес боксёров
        float boxersWeightDifference = boxerSecondWeight - boxerFirstWeight; //Ищем разницу в весе боксёров
        System.out.println("Общий вес боксёров оставляет " + boxersWeight + " кг");
        System.out.println("Разница в весе боксёров составляет " + boxersWeightDifference + " кг");

        //задание 3
        int bananaWeight = 80;
        int bananaCount = 5;
        bananaWeight = bananaWeight * bananaCount; //общий вес бананов
        int milkWeight = 105;
        int milkCount = 2;
        milkWeight = milkWeight * milkCount; //общий вес молока
        int iceCreamWeight = 100;
        int iceCreamCount = 2;
        iceCreamWeight = iceCreamWeight * iceCreamCount; //общий вес мороженного
        int eggWeight = 70;
        int eggCount = 4;
        eggWeight = eggWeight + eggCount; //общий вес яиц
        float sumWeight = bananaWeight + milkWeight + iceCreamWeight + eggWeight; //считаем общий вес продуктов
        System.out.println(); //пустая строка для разделения выводов между заданиями
        System.out.println("Вес спорт-завтрака составляет " + sumWeight + " гр");
        sumWeight = sumWeight/1000;
        System.out.println("Вес спорт-завтрака составляет " + sumWeight + " кг");

        //Задание 4
        //В критериях оценки указана необходимость использования операции определения остатка от деления
        //Честно, я хуй его знает куда вообще ее прихуярить тут можно. Даже если будем работать не с граммами, то все деления будут целочисленными
        int weightToLoss = 7000; //для удобства будем работать с граммами
        int lostPerDayFirst = 250;
        int lostPerDaySecond = 500;
        int daysFirst = weightToLoss / lostPerDayFirst;
        int daysSecond = weightToLoss / lostPerDaySecond;
        int daysMean = (daysFirst + daysSecond)/2; //средняя арифметическая количества дней
        System.out.println(); //пустая строка для разделения выводов между заданиями
        System.out.println("Для похудения может потребоваться от " + daysSecond + " до " + daysFirst + " дней");
        System.out.println("В среднем: " + daysMean + " день");

        //Задание 5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int salaryMashaNew = salaryMasha + salaryMasha/10;
        int salaryDenisNew = salaryDenis + salaryDenis/10;
        int salaryKristinaNew = salaryKristina + salaryKristina/10;
        int salaryMashaDifference = (salaryMashaNew - salaryMasha) * 12;
        int salaryDenisDifference = (salaryDenisNew - salaryDenis) * 12;
        int salaryKristinaDifference = (salaryKristinaNew - salaryKristina) * 12;
        System.out.println(); //Пустая строка для разделения выводов между заданиями
        System.out.println("Маша теперь получает " + salaryMashaNew + " рублей. Годовой доход вырос на " + salaryMashaDifference + " рубелй.");
        System.out.println("Денис теперь получает " + salaryDenisNew + " рублей. Годовой доход вырос на " + salaryDenisDifference + " рубелй.");
        System.out.println("Кристина теперь получает " + salaryKristinaNew + " рублей. Годовой доход вырос на " + salaryKristinaDifference + " рубелй.");


    }
}
