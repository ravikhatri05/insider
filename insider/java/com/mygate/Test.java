package com.mygate;

import com.sun.codemodel.internal.JForEach;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

    /**
     *  input x,y
     *  out number of steps to convert x to y
     *
     * 2*2 4-1 3*2 6*2
     *  operation (multiply by 2 ,5)
     * @param arg
     *
     * x to which number
     */
    int count =0;
    public static void main (String arg[]){
       System.out.println( getOperation(4,2));
    }


    public boolean test(int src,int dest){
        if(src>dest){
            return false;
        }
        if(src==dest){
            return true;
        }
        count++;
        return test(src*2,dest) || test(src-1,dest);
    }

    public static int getOperation(int x,int y){
        LinkedList<String> queue= new LinkedList<>();
        queue.offer(x+":"+0);
        while(!queue.isEmpty()){
            String temp = queue.poll();
            String arr [] =temp.split(":");
            int src = Integer.parseInt(arr[0]);
            int steps = Integer.parseInt(arr[1]);

            if(src==y){
                return steps;
            }
           int i = src*2;
            int j= src-1;
            int steps_final = steps+1;
            if(i>0){
                queue.offer(i+":"+ steps_final);
            }
            if(j>0){
                queue.offer(j+":"+ steps_final);
            }
        }
        return -1;

    }

    public void getMaxSum(int arr1 [],int arr2[]){

    }

    public boolean checkIfExist(int arr2[],int k){
        for(int i:arr2){
            if(i==k){
                return true;
            }
        }
        return false;
    }


}
