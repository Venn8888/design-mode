package com.venn;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 策略模式
 *
 * 狗狗按指定策略进行排序
 * @author dwf
 * @date 2021/3/8 21:43
 */

public class Strategy<T> {

    private void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = comparator.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        Dog[] a = {new Dog(1.0, 3.0), new Dog(3.0, 1.0), new Dog(2.0, 5.0)};
        Strategy<Dog> strategy = new Strategy<Dog>();
        strategy.sort(a, new DogFoodComparator());
        System.out.println("按食量排序：" + Arrays.toString(a));
        strategy.sort(a, new DogWeightComparator());
        System.out.println("按重量排序：" + Arrays.toString(a));
    }
}
