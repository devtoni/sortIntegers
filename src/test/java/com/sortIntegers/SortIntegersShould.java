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
    public void sort_an_integers_list(List<Integer> unsorted, List<Integer> sorted) {
        assertThat(sortIntegers(unsorted), is(sorted));
    }

    private Object[] addParameters() {
        return new Object[]{
                new Object[]{Arrays.asList(), Arrays.asList()},
                new Object[]{Arrays.asList(1), Arrays.asList(1)},
                new Object[]{Arrays.asList(2, 1), Arrays.asList(1, 2)},
                new Object[]{Arrays.asList(3, 1, 2), Arrays.asList(1, 2, 3)}
        };
    }

    private List<Integer> sortIntegers(List<Integer> asList) {
        for (int index = 0; asList.size() > index + 1; index++) {
            if (outOfOrder(asList, index))
                swap(asList, index);
        }
        return asList;
    }

    private boolean outOfOrder(List<Integer> asList, int index) {
        return asList.get(index) > asList.get(index + 1);
    }

    private void swap(List<Integer> asList, int index) {
        Integer temp = asList.get(index);
        asList.set(index, asList.get(index + 1));
        asList.set(index + 1, temp);
    }
}
