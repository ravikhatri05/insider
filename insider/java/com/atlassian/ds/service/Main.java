package com.atlassian.ds.service;


import com.atlassian.ds.service.impl.ElectionServiceImpl;

import java.util.Arrays;

public class Main {

    public static void main(String args []){
        ElectionService electionService =new ElectionServiceImpl();
        System.out.println("Winner is ::"+electionService.findWinner(Arrays.asList("B","A","B","B","C","C")));
        System.out.println("Winner is ::"+electionService.findWinner(Arrays.asList("B","A","B","B","A","C","A")));

        System.out.println("Winner is ::"+electionService.findWinner(Arrays.asList("A","B","C")));

        System.out.println("Winner is ::"+electionService.findWinner(Arrays.asList("A","B","C","C","A")));

        /*
         B A B B A C A

         out put -> A--> C --> B  if i iterate in reverse order

                     { B-->C-->A }

         */
    }



    public void findWinner_Success() {



    }

}
