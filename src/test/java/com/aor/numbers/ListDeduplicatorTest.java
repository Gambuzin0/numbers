package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {

    @Test
    public void deduplicate() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);
        List<Integer> expected = Arrays.asList(1,2,4,5);

        ListDeduplicator deduplicator = new ListDeduplicator();
        ListSorter ls = new ListSorter();
        List<Integer> distinct = deduplicator.deduplicate(list,ls);

        Assertions.assertEquals(expected, distinct);
    }

    @Test
    public void Test_deduplicate() {
        List<Integer> list = Arrays.asList(1,2,4,2);
        List<Integer> expected = Arrays.asList(1,2,4);

        ListDeduplicator deduplicator = new ListDeduplicator();
        ListSorter ls = new ListSorter();
        List<Integer> distinct = deduplicator.deduplicate(list,ls);

        Assertions.assertEquals(expected, distinct);
    }
}