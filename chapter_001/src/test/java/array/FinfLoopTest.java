package array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FinfLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        //FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 10;
        int result = FindLoop.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }
}

