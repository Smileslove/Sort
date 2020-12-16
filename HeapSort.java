package com.sort;

/**
 * @description: 堆排序
 * @author: Smileslove
 * @time: 2020/12/16 23:43
 */
public class HeapSort {

    public static void HeapSort(int[] arr){
        //构建大顶堆
        for(int i = arr.length / 2 - 1; i >= 0; i--){
            //从第一个非叶子结点从下至上，从右至左调增堆结构
            adjustHeap(arr, i, arr.length);
        }
        //调整堆结构，交换堆顶元素与末尾元素
        for(int j = arr.length - 1; j > 0; j--){
            //将堆顶元素与末尾元素进行交换
            swap(arr, 0, j);
            //重新调整堆
            adjustHeap(arr, 0, j);
        }
    }

    private static void adjustHeap(int[] arr, int i, int length){
        //temp存当前元素
        int temp = arr[i];
        //从i结点的左子节点开始（2i+1处）
        for(int k = i*2 + 1; k < length; k = k*2 + 1){
            //如果左子节点的值小于右子节点的值，则k指向右子节点
            if(k + 1 < length && arr[k] < arr[k+1]){
                k++;
            }
            if(arr[k] > temp){
                arr[i] = arr[k];
                i = k;
            } else{
                break;
            }
        }
        arr[i] = temp;
    }

    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
