package com.basic.sort;

/*
 *@author hanyunzhuo
 *@date 2020/6/2 18:35
 */
public class QuickSort {

    //快排
    public static void quickSort(int[] arr){
        if(arr == null){
            return;
        }
        if(arr.length == 0 || arr.length == 1){
            return;
        }
        quickSortImpl(arr,0,arr.length - 1);
    }

    private static void quickSortImpl(int[] arr,int low,int high){

        if((high - low) <= 0){
            return;
        }

        int start = low;
        int end = high;

        //定义基准数
        int base = arr[low];

        while (low < high){
            //移动指针   比基准数小的放在左边   比基准数大的放在右边
            while (low<high && arr[high] >= base){
                high-- ;
            }
            //
            arr[low] = arr[high];
            arr[high] = base;

            while (low<high && arr[low] <= base){
                low++;
            }
            arr[high] = arr[low];
            arr[low] = base;
        }
        //两边分别进行快排
        quickSortImpl(arr,start,low - 1);
        quickSortImpl(arr,low + 1,end);
    }
}
