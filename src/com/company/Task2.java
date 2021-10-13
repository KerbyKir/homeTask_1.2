package com.company;

public class Task2 {

    public static void main(String[] args) {
        // #2: В боксе, перед каждым боем, спортсменов взвешивают – это делают для того, чтобы убедиться,
        //что боксеры соответствуют своей весовой категории, и бой будет честным.
        //Вес одного боксера – 78,2 кг
        //Вес второго боксера – 82,7 кг
        //Подсчитайте и выведите в консоль общий вес двух бойцов.
        //Подсчитайте и выведите в консоль разницу между весами бойцов.

        float boxerNum1Weight = 78.2f;
        float boxerNum2Weight = 82.7f;
        float boxersSumWeight = boxerNum1Weight + boxerNum2Weight;
        float boxersDifWeightV1 = boxersSumWeight % boxerNum1Weight;
        float boxersDifWeightV2 = boxerNum2Weight % boxerNum1Weight;
        float boxersDifWeightV3 = boxerNum2Weight - boxerNum1Weight;

        System.out.println("Общий вес двух бойцов "+boxersSumWeight+" кг");
        System.out.println("Вариант 1: Разница между весами бойцов "+boxersDifWeightV1+" кг");
        System.out.println("Вариант 2: Разница между весами бойцов "+boxersDifWeightV2+" кг");
        System.out.println("Вариант 3: Разница между весами бойцов "+boxersDifWeightV3+" кг");
    }
}
