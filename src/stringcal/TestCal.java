package stringcal;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;

public class TestCal {
	@Test
    public void testNumberIsEmptySpace() {
        assertEquals(0, Calculator.add(" "));
    }

    @Test
    public void testStringHasOneNumber() {
        assertEquals(2, Calculator.add("2"));
    }

    @Test
    public void testStringHasTwoNumber() {
        assertEquals(3, Calculator.add("1,2"));
    }

    @Test
    public void testStringHasUnknownNumbers() {
        assertEquals(6, Calculator.add("1,2,3"));
    }

    @Test
    public void testStringHasAlphabets() {
        assertEquals(6, Calculator.add("a,b,c"));
        assertEquals(10, Calculator.add("1,a,b,2,c,1"));
    }

//    @Test
//    public void testStringHasNegativeNumber() {
//        Exception e = Assert.assertThrows(Exception.class, () -> Calculator.add("-1"));
//        assertEquals("Negative not allowed:-1", e.getMessage());
//    }
//
//    private Exception assertThrows(Class<Exception> class1, Object object) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Test
//    public void testStringHasMultipleNegativeNumber() {
//        Exception e = assertThrows(Exception.class, () -> Calculator.add("-1,3,-4,-2"));
//        assertEquals("Negative not allowed:-1,-4,-2,", e.getMessage());
//    }

    @Test
    public void testStringNumberIsBiggerThanThousand() {
        assertEquals(5, Calculator.add("1,2001,3,1001,1"));
    }

    @Test
    public void testNumberWithDifferentDelimiterNewLine() {
        assertEquals(6, Calculator.add("1\n2,3"));
    }

    @Test
    public void testNumberWithDifferentDelimiter() {
        assertEquals(6, Calculator.add("//;\n1;2;3"));
    }

    @Test
    public void testNumberWithOddIndicesSum() {
        assertEquals(4, Calculator.add("0//2,1,4,3"));
    }

    @Test
    public void testNumberWithEvenIndicesSum() {
        assertEquals(6, Calculator.add("1//1,2,5,3"));
    }

    @Test
    public void testNumberWithMulitpleLengthDelimiter() {
        assertEquals(6, Calculator.add("//;;;\n1;;;2;;;3"));
    }

}