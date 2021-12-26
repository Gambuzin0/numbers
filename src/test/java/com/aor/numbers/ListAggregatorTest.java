package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {
    List<Integer> list_for_tests;

    @BeforeEach
    public void list_creator(){

        list_for_tests = Arrays.asList(1,2,4,2,5);

    }

    @Test
    public void sum() {

        ListAggregator aggregator = new ListAggregator();
        int sum = aggregator.sum(list_for_tests);

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {

        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(list_for_tests);

        Assertions.assertEquals(5, max);
    }

    @Test
    public void min() {

        ListAggregator aggregator = new ListAggregator();
        int min = aggregator.min(list_for_tests);

        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {

        ListAggregator aggregator = new ListAggregator();
        ListDeduplicator deduplicator = new ListDeduplicator(new ListSorter());
        int distinct = aggregator.distinct(list_for_tests,deduplicator);

        Assertions.assertEquals(4, distinct);
    }

    @Test
    public void testing_max(){
        List<Integer> list_of_negs = Arrays.asList(-1,-4,-5);

        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(list_of_negs);

        Assertions.assertEquals(-1,max);
    }

    @Test
    public void testing_distinct(){
        List<Integer> list = Arrays.asList(1,2,4,2);
        ListAggregator aggregator = new ListAggregator();


        GenericListDeduplicator deduplicator = Mockito.mock(GenericListDeduplicator.class);
        Mockito.when(deduplicator.deduplicate(Mockito.anyList())).thenReturn(Arrays.asList(1, 2, 4));

        int distinct = aggregator.distinct(list,deduplicator);

        Assertions.assertEquals(3,distinct);
    }
}

