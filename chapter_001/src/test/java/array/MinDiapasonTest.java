package array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinDiapasonTest {
    @Test
    public void whenFindMinDiaposone() {
        assertThat(
                MinDiapason.findMin(
                new int[]{1, 4, 7, 5, 8},
                        1, 3
                ),
                is(4)
        );
    }
        @Test
        public void whenLastMin() {
            assertThat(
                    MinDiapason.findMin(
                            new int[] {10, 5, 3, 1},
                            1, 3
                    ),
                    is(1)
            );
        }

        @Test
        public void whenMiddleMin() {
            assertThat(
                    MinDiapason.findMin(
                            new int[] {10, 2, 5, 1},
                            0, 2
                    ),
                    is(2)
            );
        }
    }


