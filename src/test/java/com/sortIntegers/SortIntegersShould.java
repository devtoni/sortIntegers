package com.sortIntegers;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


@RunWith(JUnitParamsRunner.class)
public class SortIntegersShould {

    @Test
    @Parameters(method = "addParameters")
    public void sort_an_integers_list(List<Integer> unsorted,List<Integer> sorted){
        assertThat(sortIntegers(unsorted), is(sorted));
    }

    private Object[] addParameters() {
        return new Object[]{
                new Object[]{Arrays.asList(), Arrays.asList()},
                new Object[]{Arrays.asList(1), Arrays.asList(1)},
                new Object[]{Arrays.asList(2,1), Arrays.asList(1, 2)},
                new Object[]{Arrays.asList(3,1,2), Arrays.asList(1, 2, 3)}
        };
    }

    private List<Integer> sortIntegers(List<Integer> asList) {
        if (asList.size() > 1) {
            Integer temp = asList.get(0);
            if (temp > asList.get(1)) {
                asList.set(0, asList.get(1));
                asList.set(1, temp);
            }
        }
        if (asList.size() > 2) {
            Integer temp = asList.get(1);
            if (temp > asList.get(2)) {
                asList.set(1, asList.get(2));
                asList.set(2, temp);
            }
        }
        return asList;
    }
}
