package com.sort;

/**
 * @description: 选择排序
 * @author: Smileslove
 * @time: 2020/12/16 0:32
 */
public class SelectSort {

    public static void selectSort(int[] arr){
        //一共需要length - 1 轮比较
        for(int i = 0; i < arr.length; i++){
            int min = i;
            //每轮中又需要比较length - i次,找到最小元素的下标
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            //将找到的最小元素与索引为i的值进行交换
            if(i != min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
