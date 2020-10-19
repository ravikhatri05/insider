package com.paytm.insider.model;

import lombok.Data;

@Data
public class Comments extends BaseClass implements Comparable<Comments> {
    Long parent;
    String text;

    @Override
    public int compareTo(Comments comments) {
        Integer sizeThis = this.getKids().size();
        Integer sizeNew = comments.getKids().size();
        int compareResult = sizeNew.compareTo(sizeThis);
        if(compareResult != 0){
            return compareResult;
        }
        return comments.getTime().compareTo(this.getTime());
    }
}
