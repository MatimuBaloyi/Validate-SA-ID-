import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ValidateSaIdTest {

    @Test
    public void testValidIdNumbers() {
        assertTrue(ValidateSaId.isIdNumberValid("2001014800086"));
        assertTrue(ValidateSaId.isIdNumberValid("2909035800085"));
    }

    @Test
    public void testIdTooShort() {
        assertFalse(ValidateSaId.isIdNumberValid("123456789012")); // 12 digits
    }

    @Test
    public void testIdTooLong() {
        assertFalse(ValidateSaId.isIdNumberValid("12345678901234")); // 14 digits
    }

    @Test
    public void testIdWithLetters() {
        assertFalse(ValidateSaId.isIdNumberValid("20010A4800086")); // contains letter
    }
}
