import com.task.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    String fizz = "Fizz";
    String buzz = "Buzz";
    String fizzBuzz = "FizzBuzz";

    @Test
    public void fizzBuzzTest_positive_fizz(){
        Assertions.assertEquals(new String(FizzBuzz.fizzbuzz(3)), fizz);
        Assertions.assertEquals(new String(FizzBuzz.fizzbuzz(-3)), fizz);
        Assertions.assertEquals(new String(FizzBuzz.fizzbuzz(2147483646)), fizz);
        Assertions.assertEquals(new String(FizzBuzz.fizzbuzz(-2147483646)), fizz);

    }
    @Test
    public void fizzBuzzTest_positive_buzz(){
        Assertions.assertEquals(new String(FizzBuzz.fizzbuzz(5)), buzz);
        Assertions.assertEquals(new String(FizzBuzz.fizzbuzz(-5)), buzz);
        Assertions.assertEquals(new String(FizzBuzz.fizzbuzz(2147483645)), buzz);
        Assertions.assertEquals(new String(FizzBuzz.fizzbuzz(-2147483645)), buzz);

    }
    @Test
    public void fizzBuzzTest_positive_fizzbuzz(){
        Assertions.assertEquals(new String(FizzBuzz.fizzbuzz(15)), fizzBuzz);
        Assertions.assertEquals(new String(FizzBuzz.fizzbuzz(-15)), fizzBuzz);
        Assertions.assertEquals(new String(FizzBuzz.fizzbuzz(0)), fizzBuzz);
        Assertions.assertEquals(new String(FizzBuzz.fizzbuzz(2147483640)), fizzBuzz);
        Assertions.assertEquals(new String(FizzBuzz.fizzbuzz(-2147483640)), fizzBuzz);
    }
    @Test
    public void fizzBuzzTest_negative(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            FizzBuzz.fizzbuzz(1);
        });
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            FizzBuzz.fizzbuzz(-1);
        });
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            FizzBuzz.fizzbuzz(-2147483648);
        });
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            FizzBuzz.fizzbuzz(2147483647);
        });
    }

}
