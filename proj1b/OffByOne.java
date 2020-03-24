public class OffByOne implements CharacterComparator {

    //TODO do I need to start empty constructor
    public OffByOne() {

    }

    @Override
    public boolean equalChars(char x, char y) {
        //TODO do I need null check?
        int eval = Character.valueOf(x) - Character.valueOf(y);
        if (eval == 1 || eval == -1) {
                return true;
        }
        return false;
    }

}
