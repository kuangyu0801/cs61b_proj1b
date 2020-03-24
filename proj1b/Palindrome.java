public class Palindrome {

    public Deque<Character> wordToDeque(String word) {
        Deque<Character> charDeque = new LinkedListDeque<>();
        for (int i = 0; i < word.length(); i += 1) {
            charDeque.addLast(word.charAt(i));
        }
        return charDeque;
    }

    private boolean charRecursive( Deque<Character> charDeque) {
        if (charDeque.size() == 1 || charDeque.size() == 0) {
            return true;
        }
        Character first = charDeque.removeFirst();
        Character last = charDeque.removeLast();
        if (first.equals(last)) {
            return charRecursive(charDeque);
        }
        return false;
    }

    /*A palindrome is defined as a word that is the same whether it is read forwards or backwards.*/
    public boolean isPalindrome(String word) {
        Deque<Character> charDeque = this.wordToDeque(word);
        return charRecursive(charDeque);
    }

    private boolean charRecursive( Deque<Character> charDeque, CharacterComparator cc) {
        if (charDeque.size() == 1 || charDeque.size() == 0) {
            return true;
        }
        Character first = charDeque.removeFirst();
        Character last = charDeque.removeLast();
        if (cc.equalChars(first, last)) {
            return charRecursive(charDeque, cc);
        }
        return false;
    }

    public boolean isPalindrome(String word, CharacterComparator cc) {
        Deque<Character> charDeque = this.wordToDeque(word);
        return charRecursive(charDeque, cc);
    }
}
