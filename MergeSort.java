package com.sort;

/**
 * @description: 归并排序
 * @author: Smileslove
 * @time: 2020/12/16 9:55
 */
public class MergeSort {

    public static void mergeSort(int[] arr){
        //在排序之前先创建一个与arr相同长度的临时空间，避免在递归过程中频繁开辟空间
        int[] temp = new int[arr.length];
        sort(arr, 0, arr.length - 1, temp);
    }

    private static void sort(int[] arr, int left, int right, int[] temp){
        if(left < right){
            int mid = (left + right) / 2;
            //分别对左边和右边进行归并排序
            sort(arr, left, mid, temp);
            sort(arr, mid + 1, right, temp);
            //将两个有序子数组合并
            merge(arr, left, mid, right, temp);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp){
        //i指向左侧序列
        int i = left;
        //j指向右侧序列
        int j = mid + 1;
        //t指向temp数组
        int t = 0;
        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        //将剩余元素填充进temp数组中
        while(i <= mid){
            temp[t++] = arr[i++];
        }
        while(j <= right){
            temp[t++] = arr[j++];
        }
        //将temp中的内容拷贝进原数组之中
        t = 0;
        while(left <= right){
            arr[left++] = temp[t++];
        }
    }
}
