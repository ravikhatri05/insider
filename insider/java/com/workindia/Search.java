package com.workindia;

public class Search {

    public static void main(String arg[]){
        int input = -4;

        /**
         * -4 = 2i
         *  4 = 2i
         *
         */
        if(input<0){
            System.out.println("INVALID");
        }
        System.out.println(binarySearch(input));

    }

    public static int binarySearch(int y){


        int start =1;
        int ans =0;
        int end =y;
        if(y==0 || y==1){
            return y;
        }
        while(start<=end){
            int mid= (start+end)/2;
            if(mid*mid == y){
                return mid;
            }
            if(mid*mid<y){
                start=  mid+1;
                ans = mid;
            }else{

                end = mid-1;
            }
        }
        return ans;

    }
}
