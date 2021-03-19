package memorywrappersstring;

public class FootballMatch {

    /**
     * Task:
     * If the user bet was 100% accurate - return 2;
     * If user guessed who is the winner,
     * loser or that this was a draw
     * (played 1: 2, and the bet was 0: 3
     * or played 2: 2, and the bet was 3: 3
     * - then the user has won this bet) then return 1;
     * If the bet was wrong at all - return 0.
     * */

    public int matchResult(int result1, int result2, int bet1, int bet2) {
        return result1 == bet1 && result2 == bet2    ? 2
                : result1 == result2 && bet1 == bet2 ? 1
                : result1 < result2 && bet1 < bet2   ? 1
                : result1 > result2 && bet1 > bet2   ? 1
                : 0;
    }
}
