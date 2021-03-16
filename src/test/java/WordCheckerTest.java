import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCheckerTest {


    @Test
    public void check_one_word_is_null_returns_null() {
        assertNull(WordChecker.check(null, "Hello"));
        assertNull(WordChecker.check("Hello", null));
        assertNull(WordChecker.check(null, null));
    }

    @Test
    public void check_one_word_is_empty_returns_false() {
        assertFalse(WordChecker.check("Hello", ""));
        assertFalse(WordChecker.check("", "Hello"));
        assertFalse(WordChecker.check("", ""));
    }

    @Test
    public void check_words_have_diff_length_returns_false() {
        assertFalse(WordChecker.check("Hello", "Hell"));
        assertFalse(WordChecker.check("Hello", "Hel lo"));
        assertFalse(WordChecker.check("Hello", "Hel__lo"));
    }

    @Test
    public void check_words_have_same_length() {
        assertTrue(WordChecker.check("Hello", "lleho"));
        assertTrue(WordChecker.check("ABI", "bia"));
        assertTrue(WordChecker.check("mehdi", "ihdme"));
        assertFalse(WordChecker.check("you", "yoo"));
    }

    @Test
    public void order_test_cases() {
        assertEquals("ABCD",WordChecker.order("ABDC"));
        assertEquals("abej",WordChecker.order("abej"));
        assertEquals("ayz",WordChecker.order("azy"));
        assertEquals("aayz",WordChecker.order("azay"));
    }
}
