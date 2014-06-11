package th.own.bomb0069.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumberTest {

    @Test
    public void test1ShouldBeReturnI() {
        NumberConvertor numberConvertor = NumberConvertorFactory.create();
        String romanNumber = numberConvertor.getRomanNumber(1);
        assertEquals("I", romanNumber);
    }

}
