package com.aor.numbers;

import java.util.Arrays;
import java.util.List;

/**
 * A utility class that aggregates list of numbers
 * into a single integer using various functions.
 */
public class ListAggregator {
    /**
     * Sums all numbers in a list.
     * @return The sum of all the values in the list.
     */
    public Integer sum(List<Integer> list) {
        int sum = 0;

        for (Integer number : list)
            sum += number;

        return sum;
    }

    /**
     * Calculates the maximum value in a list.
     * @return The maximum value in the list.
     */
    public Integer max(List<Integer> list) {
        int max = list.get(0);

        for (Integer number : list)
            if (number > max)
                max = number;

        return max;
    }

    /**
     * Calculates the minimum value in a list.
     * @return The minimum value in the list.
     */
    public Integer min(List<Integer> list) {
        int min = Integer.MAX_VALUE;

        for (Integer number : list)
            if (number < min)
                min = number;

        return min;
    }

    /**
     * Counts the number of distinct numbers in a list.
     * @return The number of distinct numbers.
     */
    public int distinct(List<Integer> list, GenericListDeduplicator deduplicator) {

        List<Integer> distinct = deduplicator.deduplicate(list);
        // STUB
        // um listDeduplicator falso que devolve o valor que deveria devolver tendo
        //em conta a lista usada nos testes ({1,2,4,2})
        /*class stub_listDeduplicator {
            public List<Integer> deduplicate(List<Integer> list){
                List<Integer> l = Arrays.asList(1,2,4);
                return l;
            }
        }*/
        // agora o método distinct vai estar a trabalhar sempre com os valores corretos
        //pois o stub_listDeduplicator devolve sempre o  valor correto
        // se mesmo com dados corretos o teste falhar sabemos que o erro está no code
        // do método distinct, se o teste agora passar sabemos que o erro está no code
        // do metodo da class listDeduplicator deduplicate().

        return distinct.size();
    }
}