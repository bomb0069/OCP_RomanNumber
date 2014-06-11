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

    @Test
    public void testXRule() {
        assertRomanArabic("X", 10);
        assertRomanArabic("XI", 11);
        assertRomanArabic("XV", 15);
        assertRomanArabic("XIX", 19);
        assertRomanArabic("XX", 20);
        assertRomanArabic("XXX", 30);
        assertRomanArabic("XXXIV", 34);
    }

    @Test
    public void testAnotherRule() {
        assertRomanArabic("XL", 40);
        assertRomanArabic("L", 50);
        assertRomanArabic("XC", 90);
        assertRomanArabic("C", 100);
        assertRomanArabic("CD", 400);
        assertRomanArabic("D", 500);
        assertRomanArabic("CM", 900);
        assertRomanArabic("M", 1000);
    }
}
