public class OffByN implements CharacterComparator {
    private int offset;
    public OffByN(int n) {
        offset = Math.abs(n);
    }

    @Override
    public boolean equalChars(char x, char y) {
        //TODO do I need null check?
        if (Character.isAlphabetic(x) && Character.isAlphabetic(y)) {
            int eval = Character.toLowerCase(x) - Character.toLowerCase(y);
            if (Math.abs(eval) == offset) {
                return true;
            }
        }
        return false;
    }
}
