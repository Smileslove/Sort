package com.sort;

/**
 * @description: 计数排序
 * @author: Smileslove
 * @time: 2020/12/17 0:04
 */
public class CountSort {

    public static int[] countSort(int[] arr, int maxValue){
        int[] count = new int[maxValue+1];
        int[] result = new int[arr.length];
        //统计arr中各元素个数，存入count数组之中
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        //修改count数组
        int sum = 0;
        for(int i = 0; i < maxValue+1; i++){
            sum += count[i];
            count[i] = sum;
        }
        //构造result数组,从后往前遍历是为了保证稳定性
        for (int i = arr.length - 1; i >= 0; i--){
            result[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        return result;
    }
}
