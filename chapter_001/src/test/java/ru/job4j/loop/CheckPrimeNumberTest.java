package ru.job4j.loop;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(15);
        assertThat(rsl, is(false));
    }

    @Test
    public void when4() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(4);
        assertThat(rsl, is(false));
    }
}
