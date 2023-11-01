package com.epam.mjc;

import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return arg -> arg.stream().map(i -> i / divider).collect(Collectors.toList());
    }
}
