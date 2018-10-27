package com.sortIntegers;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;



public class SortIntegersShould {
    @Test
    public void sort_an_integers_list(){
        assertThat(sortIntegers(intList()), is(intList()));
        assertThat(sortIntegers(intList(1)), is(intList(1)));
    }

    private List<Integer> intList(Integer ...ints) {
        return Arrays.asList(ints);
    }

    private List<Integer> sortIntegers(List<Integer> asList) {
        return asList;
    }
}
