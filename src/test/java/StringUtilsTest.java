import org.example.StringUtilsEx;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void testIsPositiveNumber() {
        assertTrue(StringUtilsEx.isPositiveNumber("123"));
        System.out.println(StringUtilsEx.isPositiveNumber("123"));
        assertFalse(StringUtilsEx.isPositiveNumber("-123"));
        System.out.println(StringUtilsEx.isPositiveNumber("-123"));
        assertFalse(StringUtilsEx.isPositiveNumber("0"));
        System.out.println(StringUtilsEx.isPositiveNumber("0"));
        assertFalse(StringUtilsEx.isPositiveNumber("abc"));
        System.out.println(StringUtilsEx.isPositiveNumber("abc"));
    }
}