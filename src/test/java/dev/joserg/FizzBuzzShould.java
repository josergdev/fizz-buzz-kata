package dev.joserg;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FizzBuzzShould {

    @Test void
    return_string_of_given_number() {
        assertThat(FizzBuzz.of(1)).isEqualTo("1");
        assertThat(FizzBuzz.of(2)).isEqualTo("2");
        assertThat(FizzBuzz.of(4)).isEqualTo("4");
    }

    @Test void
    return_Fizz_when_multiple_of_three() {
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(6)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(9)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(18)).isEqualTo("Fizz");
    }

    @Test void
    return_Buzz_when_multiple_of_five() {
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(10)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(20)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(25)).isEqualTo("Buzz");
    }

    @Test void
    return_FizzBuzz_when_multiple_of_three_and_five() {
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.of(30)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.of(45)).isEqualTo("FizzBuzz");
    }
}
