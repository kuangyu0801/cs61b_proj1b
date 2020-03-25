import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    //You must use this palindrome, and not instantiate
    //new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();
    static OffByOne offByOnecc = new OffByOne();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    @Test
    public void testIsPalindromeOverload() {
        assertFalse(palindrome.isPalindrome("noon", offByOnecc));
    }

    @Test
    public void testIsPalindromeAllTrue() {

        assertTrue(palindrome.isPalindrome("noon"));
        assertTrue(palindrome.isPalindrome("non"));
        assertTrue(palindrome.isPalindrome("deedeed"));
        assertTrue(palindrome.isPalindrome("hallah"));
        assertTrue(palindrome.isPalindrome("a"));
    }

    @Test
    public void testIsPalindromeAllFalse() {
        assertFalse(palindrome.isPalindrome("cat"));
        assertFalse(palindrome.isPalindrome("caca"));
        assertFalse(palindrome.isPalindrome("Cac"));
        assertTrue(palindrome.isPalindrome("Deedeed"));
        assertTrue(palindrome.isPalindrome("hH"));
    }
}
