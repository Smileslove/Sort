package com.sort;

import java.util.Arrays;

/**
 * @description: 冒泡排序
 * @author: Smileslove
 * @time: 2020/12/15 23:43
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr){

        for(int i = 1; i < arr.length; i++){
            //设定一个标记，如果本次循环过后没有发生数据交换（即待排序数列已经有序），则设其为false，表示排序已经完成
            boolean flag = true;

            for(int j = 0; j < arr.length - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //发生了数据交换，设置flag为false
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

}
