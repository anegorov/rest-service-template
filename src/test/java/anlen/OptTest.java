package anlen;

import anlen.service.AnOptional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
public class OptTest {

    @Test
    public void test(){
        AnOptional ao = new AnOptional(null);
        System.out.println("AAA:" + ao.getValue().get());
    }

    @Test
    public void BuzzFizz(){
        IntStream.rangeClosed(1, 100)
            .mapToObj(i -> i%3==0?
                    (i%5==0? "FizzBuzz" : "Fizz") :
                    (i%5==0? "Buzz" : i)
            )
            .forEach(System.out::println);


    }
}
