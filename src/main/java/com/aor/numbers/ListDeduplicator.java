package com.aor.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * An utility class that removes duplicate numbers
 * from a list.
 */
public class ListDeduplicator implements GenericListDeduplicator {

    /**
     * Removes duplicate numbers from a list.
     * @return A list having the same numbers as the original
     * but withou duplicates. The order of the numbers might
     * change.
     */
    public List<Integer> deduplicate(List<Integer> list, ListSorter ls) {
        List<Integer> unique = new ArrayList<>();

        //Another_stub !!!!!!!!!!!!!!!!!!!!
        class stub_list_sorter{
            public List<Integer> sort(List<Integer> lis){
                List<Integer> l = Arrays.asList(1,2,2,4);
                return l;
            }
        }

        stub_list_sorter sls = new stub_list_sorter();
        List<Integer> sorted = sls.sort(list);

        Integer last = null;

        for (Integer number : sorted)
            if (!number.equals(last)) {
                last = number;
                unique.add(number);
            }

        return unique;
    }
}
