package com.paytm.insider.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.LinkedList;

@Data
@EqualsAndHashCode(of = {"id"})
public class BaseClass {

    Long id;
    String by;
    LinkedList<Integer> kids = new LinkedList<>();
    Long time;
    String title;
    String type;
}
