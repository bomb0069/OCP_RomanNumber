package th.own.bomb0069.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumberTest {

    NumberConvertor numberConvertor = NumberConvertorFactory.create();

    @Test
    public void test1ShouldBeReturnI() {
        assertEquals("I", numberConvertor.getRomanNumber(1));
    }

    @Test
    public void test2ShouldBeReturnII() {
        assertEquals("II", numberConvertor.getRomanNumber(2));
    }

}
