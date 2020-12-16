package com.sort;


/**
 * @description: 测试程序
 * @author: Smileslove
 * @time: 2020/12/16 0:01
 */
public class Test {

    public static void main(String[] args) {
        int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};

        //BubbleSort.bubbleSort(arr);
        //SelectSort.selectSort(arr);
        //InsertSort.insertSort(arr);
        //ShellSort.shellSort(arr);
        //MergeSort.mergeSort(arr);
        //QuickSort.quickSort(arr);
        //HeapSort.HeapSort(arr);
        int[] ans = CountSort.countSort(arr,65);
        for(int each : ans){
            System.out.print(each + ",");
        }
    }
}
