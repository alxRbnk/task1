package com.rubnikovich.task1.main;

import com.rubnikovich.task1.creator.CreatorArray;
import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.service.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CustomArray arr = new CustomArray(CreatorArray.create(5));
//        System.out.println(arr);
        CustomArray arrTwo = new CustomArray(CreatorArray.create(5));
        System.out.println(arrTwo);

//        Average average = new Average();
//        System.out.println("среднее значение: " + average.averageNumber(arr.getArr()));
//
//        CountPositiveNegative countPositiveNegative = new CountPositiveNegative();
//        System.out.println("положительных чисел: " + countPositiveNegative.countPositive(arr.getArr()));
//        System.out.println("отрицательных чисел: " + countPositiveNegative.countNegative(arr.getArr()));
//
//        MaxMin maxMin = new MaxMin();
//        System.out.println("максимальное значение: " + maxMin.maxValue(arr.getArr()));
//        System.out.println("минимальное значение: " + maxMin.minValue(arr.getArr()));
//
//        Replace replace = new Replace();
//        replace.replaceValue(arr.getArr(), 13, 3);
//        System.out.println("замена элемента: " + arr);
//
//        Sum sum = new Sum();
//        System.out.println("сумма элементов массива: " + sum.sumValuesArray(arr.getArr()));

        SortArray sortArray = new SortArray();
//        System.out.println("сортировка 1: " + Arrays.toString(sortArray.firstSortArr(arr.getArr())));
//        System.out.println("сортировка 2: " + Arrays.toString(sortArray.wildSort(arrTwo.getArr())));
        System.out.println("сортировка 3: " + Arrays.toString(sortArray.anotherSort(arrTwo.getArr())));
    }
}
