package com.sortIntegers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;



public class SortIntegersShould {
    @Test
    public void sort_an_integers_list(){
        assertThat(sortIntegers(intList()), is(intList()));
    }

    private List<Object> intList() {
        return Arrays.asList();
    }

    private List<Integer> sortIntegers(List<Object> asList) {
        return new ArrayList<>();
    }
}
