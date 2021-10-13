package com.company;

public class Task4 {
    public static void main(String[] args) {
        // #4: Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг,
        //чтобы оставаться в своей весовой категории.
        //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм
        //и сколько, если каждый день будет худеть на 500 грамм.
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        //Результаты подсчетов выведите в консоль.

        byte loseWeightAllKG = 7;

        float loseWeightForDayV1GR = 250;
        float loseWeightForDayV1KG = loseWeightForDayV1GR/1000;
        float loseWeightForDayV2GR = 500;
        float loseWeightForDayV2KG = loseWeightForDayV2GR/1000;

        float amountDaysV1 = loseWeightAllKG/loseWeightForDayV1KG;
        float amountDaysV2 = loseWeightAllKG/loseWeightForDayV2KG;
        float amountDaysAvg = (amountDaysV1+amountDaysV2)/2;
        System.out.println("Дней, если терять по 250 грамм, уйдёт "+amountDaysV1);
        System.out.println("Дней, если терять по 500 грамм, уйдёт "+amountDaysV2);
        System.out.println("Дней в среднем уйдёт "+amountDaysAvg);
    }
}
