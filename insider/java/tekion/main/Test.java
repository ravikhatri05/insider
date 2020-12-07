package tekion.main;

import java.util.HashSet;

public class Test {
    /**
     * 12, 3, 4, 1, 6, 9 sum = 24 12, 3, 9 
     *
     * 1. bruit force
     *   O(N3)
     *  n log n
     *
     *  12  15
     *
     *  O(N2)
     *
     *  12
     *
     *  15-3
     * @param arg
     *
     *
     * i=0
     * currSum= 7;
     * i+1
     * j=2
     * 7-4=3
     * [3,]
     *
     * O(n)
     * 0(1)
     * o(n2)
     *
     *
     * pointer i,left and right
     *
     * right
     * arr[mid]< num && arr[right]>=num
     * arr[mid]<num && arr[left]<=num
     *
     * long(n)
     */
    public static void main(String arg[]){
        int []arr ={5,6,7,8,9,1,2,3,4};

        int length = arr.length;
            System.out.println(binarySearch(arr,0,length-1,2));
    }

    public static int binarySearch(int arr[],int left, int right,int num){
        if(left>right){
            return -1;
        }
        int mid = left+(right-left)/2;
        if(arr[mid] == num){
            return mid;
        }


        if(arr[left]<=arr[mid]){
            if(num>=arr[left] && num<=arr[mid]){
             return    binarySearch (arr,left,mid-1,num);
            }
            return binarySearch( arr,mid+1,right,num);

        } if(arr[mid]<=num && num<=arr[right]){
            return binarySearch( arr,mid+1,right,num);
        }
        return  binarySearch (arr,left,mid-1,num);


    }
}
