import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumbersTest {
    @Test
    public void toArabicTest(){
        RomanNumbers rn = new RomanNumbers();
        assertEquals(1, rn.toArabic("I"));
        assertEquals(2, rn.toArabic("II"));
        assertEquals(3, rn.toArabic("III"));
        assertEquals(4, rn.toArabic("IV"));
        assertEquals(5, rn.toArabic("V"));
        assertEquals(6, rn.toArabic("VI"));
        assertEquals(7, rn.toArabic("VII"));
        assertEquals(8, rn.toArabic("VIII"));
        assertEquals(9, rn.toArabic("IX"));
        assertEquals(10, rn.toArabic("X"));
        assertEquals(11, rn.toArabic("XI"));
        assertEquals(12, rn.toArabic("XII"));
        assertEquals(13, rn.toArabic("XIII"));
        assertEquals(14, rn.toArabic("XIV"));
        assertEquals(15, rn.toArabic("XV"));
        assertEquals(16, rn.toArabic("XVI"));
        assertEquals(17, rn.toArabic("XVII"));
        assertEquals(18, rn.toArabic("XVIII"));
        assertEquals(19, rn.toArabic("XIX"));
        assertEquals(20, rn.toArabic("XX"));
        assertEquals(2944, rn.toArabic("MMCMXLIV"));
    }
}
