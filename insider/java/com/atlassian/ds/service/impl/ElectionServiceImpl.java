package com.atlassian.ds.service.impl;

import com.atlassian.ds.service.ElectionService;

import java.util.*;

public class ElectionServiceImpl implements ElectionService {

    @Override
    public String findWinner(List<String> votes) {
        /*
        // no of vote, elected person name
        Map<Integer,String>

        1 C
        2 A
        3 B
        // who won first that person should win...
         */
        Map<String, Integer> countMapping = new HashMap<>();
        List<String> electedPerson =new LinkedList<>();
        for (int i = 0; i < votes.size(); i++) {
            if (countMapping.containsKey(votes.get(i))) {
                countMapping.put(votes.get(i), countMapping.get(votes.get(i)) + 1);
                electedPerson.remove(votes.get(i));
                electedPerson.add(votes.get(i));
            } else {
                countMapping.put(votes.get(i), 1);
                electedPerson.add(votes.get(i));
            }
        }

        //Set<String> set = countMapping.keySet();

        String winner = null;
        int maxVote = 0;
        int size = electedPerson.size()-1;
        for (int i =size ;i >=0; i--) {
            if (maxVote < countMapping.get(electedPerson.get(i))) {
                maxVote = countMapping.get(electedPerson.get(i));
                winner = electedPerson.get(i);
            }
        }
        return winner;
    }

}
