import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {

    @Test
    void getBin() {
        //given
        Bins bin = new Bins(2, 12);

        //when
        bin.increment(2);
        int actual = bin.getBin(2);
        int expected = 1;
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    void increment() {
        Bins bin = new Bins(2, 12);

        //when
        bin.increment(2);
        bin.increment(2);
        int actual = bin.getBin(2);
        int expected = 2;
        //then
        Assert.assertEquals(expected,actual);
    }
}