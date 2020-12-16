package com.sort;

/**
 * @description: 希尔排序
 * @author: Smileslove
 * @time: 2020/12/16 9:18
 */
public class ShellSort {

    public static void shellSort(int[] arr){
        //选择增量 gap = length/2,以gap = gap/2的形式缩小
        for(int gap = arr.length / 2; gap > 0; gap /= 2){
            //对分组后的数据分别进行直接插入排序
            for(int i = gap; i < arr.length; i++){
                int j = i;
                int temp = arr[j];
                if(arr[j] < arr[j - gap]){
                    while(j - gap >= 0 && temp < arr[j - gap]){
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                }
                arr[j] = temp;
            }
        }
    }
}
