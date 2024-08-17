package ar.edu.untref.dyasc;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public List<Long> getFibo(Long n) {

        final Long n1 = 0L;
        final Long n2 = 1L;

        List<Long> result = new ArrayList<>();
        Long n_minus_1 = n2;
        Long n_minus_2 = n1;
        Long new_x = 0L;

        if (n <= 0) {
            throw new IllegalArgumentException();
        }

        if(n == 1) {
            result.add(n1);
            return result;
        }

        if(n == 2){
            result.add(n1);
            result.add(n2);
            return result;
        }

        result.add(n1);
        result.add(n2);

        for (Long x = 3L; x <= n; x++) {
            System.out.println("n_minus_1: " + n_minus_1);
            System.out.println("n_minus_2: " + n_minus_2);
            new_x = n_minus_1 + n_minus_2;
            System.out.println("new_x: " + new_x);

            n_minus_2 = n_minus_1;
            n_minus_1 = new_x;

            System.out.println("new n_minus_1: " + n_minus_1);
            System.out.println("new n_minus_2: " + n_minus_2);
            
            result.add(new_x);
        }

        return result;
    }
}
