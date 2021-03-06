import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Implement each of the tests below in order within the src/main/java/FizzBuzz class
 * Make a Git commit after implementing each test. Add only the minimum amount of code required
 * for each test case to make that test pass. This may innclude just putting in a literal value...
 * do not add any additional code.
 *
 * Hint:  If you complete implementing a test and the next test passes w/o any changes to FizzBuzz.java,
 *        you did too much and should start over from the previous test.
*/

public class WeekTwoExercisePartTwo {
    // TODO: remove @Disabled attribute, make the test run green, and then move on to the next test
    // TODO: remember to refactor after you have a green test (never refactor when you have a failing test)

    // TODO Response: Why would you never refactor if you had a failing test? -- Because you need to be able to refactor in a way to keep it passing,
    //  which you couldn't do if it wasn't passing.

    @Test
    public void sendingOneShouldReturnStringOne(){
        // TODO Comment: Hard coded to return "1".
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test
        FizzBuzz fb = new FizzBuzz();
        String expected = "1";

        String actual = fb.execute(1);

        assertEquals(expected, actual);
    }

    @Test
    public void sendingTwoShouldReturnStringTwo(){
        // TODO Comment: replaced hard coded "1" with a toString() of the parameter
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test

        FizzBuzz fb = new FizzBuzz();
        String expected = "2";

        String actual = fb.execute(2);

        assertEquals(expected, actual);
    }

    @Test
    public void sendingThreeShouldReturnStringFizz() {
        // TODO Comment: declared variable and created an if statement looking for a 3.
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test

        FizzBuzz fb = new FizzBuzz();
        String expected = "Fizz";

        String actual = fb.execute(3);

        assertEquals(expected, actual);
    }

    @Test
    public void sendingAnyMultipleOfThreeShouldReturnStringFizz() {
        // TODO Comment: Added else to return Buzz for modulus of three.
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test

        FizzBuzz fb = new FizzBuzz();
        String expected = "Fizz";

        String actual = fb.execute(9);

        assertEquals(expected, actual);
    }

    @Test
    public void sendingAnyMultipleOfFiveShouldReturnStringBuzz() {
        // TODO Comment: Added else to return Buzz for modulus of five.
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test

        FizzBuzz fb = new FizzBuzz();
        String expected = "Buzz";

        String actual = fb.execute(25);

        assertEquals(expected, actual);
    }

    @Test
    public void sendingAnyMultipleOfThreeAndFiveOfThreeShouldReturnStringFizzBuzz() {
        // TODO Comment: replace this comment with a brief description of why you made the change you did in FizzBuzz.java
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test

        FizzBuzz fb = new FizzBuzz();
        String expected = "FizzBuzz";

        String actual = fb.execute(45);

        assertEquals(expected, actual);
    }
}
