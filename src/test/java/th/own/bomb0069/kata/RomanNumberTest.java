package th.own.bomb0069.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumberTest {

    NumberConvertor numberConvertor = NumberConvertorFactory.create();

    private void assertRomanArabic(String roman, int arabic) {
        assertEquals(roman, numberConvertor.getRomanNumber(arabic));
    }

    @Test
    public void testIRule() {
        assertRomanArabic("I", 1);
        assertRomanArabic("II", 2);
        assertRomanArabic("III", 3);
    }

    @Test
    public void testIVRule() {
        assertRomanArabic("IV", 4);
    }

    @Test
    public void testVRule() {
        assertRomanArabic("V", 5);
        assertRomanArabic("VI", 6);
        assertRomanArabic("VII", 7);
        assertRomanArabic("VIII", 8);
    }

    @Test
    public void testIXRule() {
        assertRomanArabic("IX", 9);
    }

}
