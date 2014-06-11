package th.own.bomb0069.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumberTest {

    NumberConvertor numberConvertor = NumberConvertorFactory.create();

    @Test
    public void testIRule() {
        assertEquals("I", numberConvertor.getRomanNumber(1));
        assertEquals("II", numberConvertor.getRomanNumber(2));
        assertEquals("III", numberConvertor.getRomanNumber(3));
    }

    @Test
    public void testIVRule() {
        assertEquals("IV", numberConvertor.getRomanNumber(4));
    }
}
