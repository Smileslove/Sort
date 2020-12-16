package com.sort;

/**
 * @description: 快速排序
 * @author: Smileslove
 * @time: 2020/12/16 10:31
 */
public class QuickSort {

    public static void quickSort(int[] arr){
        sort(arr,0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int left = low;
        int right = high;
        //使用第一个元素作为基准值
        int temp = arr[left];

        while(left < right){

            //从右往左扫描，找到第一个比基准值小的元素
            while(left < right && temp <= arr[right]){
                right--;
            }
            //将这个元素放在arr[left]中
            arr[left] = arr[right];

            //从左往右扫描，找到第一个比基准值大的元素
            while(left < right && temp >= arr[left]){
                left++;
            }
            //将这个元素放在arr[right]中
            arr[right] = arr[left];
        }
        //加入基准值
        arr[left] = temp;

        //对基准值左边的数组进行快速排序
        sort(arr, low, left - 1);
        //对基准值右边的数组进行快速排序
        sort(arr, right + 1, high);

    }

}
