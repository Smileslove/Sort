package com.sort;

/**
 * @description:
 * @author: Smileslove
 * @time: 2020/12/16 8:41
 */
public class InsertSort {

    public static void insertSort(int[] arr){
        //从下标为1的元素开始
        for(int i = 1; i <arr.length; i++){
            //暂存要插入的数据
            int temp = arr[i];
            //从前方已经排序好的序列的最右侧开始比较，找到比暂存数小的数
            int j = i;
            while(j > 0 && temp < arr[j - 1]){
                //比暂存数大的数向后移动一位
                arr[j] = arr[j - 1];
                j--;
            }

            if(j != i ){
                arr[j] = temp;
            }
        }
    }
}
