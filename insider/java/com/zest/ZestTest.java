package com.zest;

public class ZestTest {

    public static void main(String arg[]){

        int [] arr1= {3,5,7};
        int [] arr2={7,1,2};
        int [] result = add(arr1,arr2);
        for (int a:
             result) {
            System.out.print(a);
        }

    }

    /**
     *syncronized
     * request 1---> box1
     * reqest 2---->box2   db level locking r1-> r2-> waiting
     *
     * @param arr
     * @param arr2
     * @return
     */
    public static int[] add(int[] arr,int [] arr2){

        int l1= arr.length-1;
        int l2 = arr2.length-1;
        int [] arr3= new int [Math.max(l1+1,l2+1)];

        int rem =0;
        while(l1>=0 && l2 >=0){

            int result= arr[l1]+arr2[l2];
            arr3[l2] = rem+result/10;
            rem=result%10;
            l1--;
            l2--;
        }
        return arr3;

    }
}
