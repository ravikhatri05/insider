package com.payu;

import javax.annotation.PostConstruct;
import java.net.Authenticator;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

public class Test {
    public static void main(String arg[]){
        String str="(()())()";
        /*
          ()
          ()
          (()())
          ()
          ()()
          (()())()
          () depth =1
          (()) depth =2
          ()() ,1,2

          4 4 1 --->
          4 4 CG -->
          4  3 CG ---> 1
          [data1] parralism _ consumer1   offset
          [data 2] maintain order
          [data 4]  consumer
          [data 3]
          partetion <no if consumer

          3 4

          1 ideal consumer

          userData->
          userId


          1. XML
          2.

          input = (()())()
          1+2+1
          (()())
          11210
          0
          (()())
          012345()

          1.
         */
    }

    public boolean checkIfBalanced(String str){
        char[] arr = str.toCharArray();
        Stack<String> stack =new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('){
                stack.push("(");
            } else{
                String c="";
                try {
                     c = stack.pop();
                }catch(EmptyStackException ese){

                }
                if(c!="("){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
