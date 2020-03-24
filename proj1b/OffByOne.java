public class OffByOne implements CharacterComparator {

    //TODO do I need to start empty constructor
    public OffByOne() {

    }

    @Override
    public boolean equalChars(char x, char y) {
        //TODO do I need null check?
        if (Character.isAlphabetic(x) && Character.isAlphabetic(y)) {
            int eval = Character.toLowerCase(x) - Character.toLowerCase(y);
            if (Math.abs(eval) == 1) {
                return true;
            }
        }
        return false;
    }

}
