public class OffByN implements CharacterComparator {
    private int offset;
    public OffByN(int n) {
        offset = n;
    }

    public boolean equalChars(char x, char y) {
        //TODO do I need null check?
        int eval = Character.valueOf(x) - Character.valueOf(y);
        if (eval == offset || eval == -offset) {
            return true;
        }
        return false;
    }
}
