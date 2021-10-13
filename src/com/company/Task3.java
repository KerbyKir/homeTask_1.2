package com.company;

public class Task3 {
    public static void main(String[] args) {
        // #3: За весом спортсмена следит не только сам спортсмен, но и его тренер.
        //Он достигается и поддерживается упорными тренировками и сбалансированным питанием.
        //Вот один из рецептов завтрака перед тренировкой, который получил наш спортсмен для поддержания формы:
        //– Бананы – 5 штук (1 банан - 80 грамм);
        //– Молоко – 200 мл (100 мл = 105 грамм);
        //– Мороженое пломбир – 2 брикета по 100 грамм;
        //– Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        //Смешать всё в блендере и готово.
        //Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        //Результат напечатайте в консоль.

        byte bananasAmount = 5;
        byte bananaWeight = 80;
        int bananasWeight = bananasAmount * bananaWeight;

        short milksAmountInML = 200;
        byte milkWeight = 105;
        int milksWeight = (milksAmountInML/100)*milkWeight;

        byte iceCreamsAmount = 2;
        byte iceCreamWeight = 100;
        int iceCreamsWeight = iceCreamWeight * iceCreamsAmount;

        byte eggsAmount = 4;
        byte eggWeigh = 70;
        int eggsWeigh = eggWeigh * eggsAmount;

        float sumWeighGR = eggsWeigh + iceCreamsWeight + milksWeight + bananasWeight;
        float sumWeighKG = sumWeighGR/1000;

        System.out.println("Вес спорт-завтрака "+sumWeighKG+" кг");
    }
}
