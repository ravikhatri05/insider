package com.paytm.insider.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Story extends BaseClass implements Comparable<Story> {
    Integer descendants;
    Integer score;
    String title;
    String url;

    @Override
    public int compareTo(Story o) {
        if (this.id.equals(o.getId())) {
            return 0;
        }
        return o.getScore().compareTo(this.score);
    }
}
