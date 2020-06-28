package com.basic.sort;

import java.util.Arrays;

/*
 *@author hanyunzhuo
 *@date 2020/6/2 17:43
 */
public class SortTest {

    public static void main(String[] args) {
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        QuickSort.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
