package com.atlassian.ds.service;

import java.util.List;

public interface ElectionService {

    String findWinner(List<String> votes);
}
