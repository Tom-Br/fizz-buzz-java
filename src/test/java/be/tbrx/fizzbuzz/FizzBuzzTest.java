package be.tbrx.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void TODO() {

        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            String fizzBuzzValue = fizzbuzz(i);
            result.add(fizzBuzzValue);
        }

        String output = String.join(" ", result);
        assertThat(output).isEqualTo("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz");

    }

    private String fizzbuzz(int i) {
        if (i % 15 == 0) {
            return "fizzbuzz";
        } else if (i % 3 == 0) {
            return "fizz";
        } else if (i % 5 == 0) {
            return "buzz";
        } else {
            return String.valueOf(i);
        }
    }
}
