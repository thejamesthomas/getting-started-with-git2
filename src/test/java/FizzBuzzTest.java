import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
    @Test
    public void shouldReturnFizzWhenMultipleOfThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.parse(3);
        assertThat(actual, is("Fizz"));
    }

    @Test
    public void shouldReturnBuzzWhenMultipleOfFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.parse(5);
        assertThat(actual, is("Buzz"));
    }

    @Test
    public void shouldReturnNumberWhenNotMultipleOfThreeOrFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.parse(4);
        assertThat(actual, is("4"));
    }

    @Test
    public void shouldReturnFizzBuzzWhenMultipleOfBothThreeAndFive(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.parse(15);
        assertThat(actual, is("FizzBuzz"));
    }

}