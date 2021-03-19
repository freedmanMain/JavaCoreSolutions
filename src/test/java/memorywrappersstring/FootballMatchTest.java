package memorywrappersstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootballMatchTest {
    private FootballMatch obj = new FootballMatch();
    @Test
    public void math_result_test(){
        assertEquals(2,obj.matchResult(0,1,0,1));
        assertEquals(0,obj.matchResult(3,3,0,1));
        assertEquals(1,obj.matchResult(1,2,1,3));
        assertEquals(1,obj.matchResult(2,1,4,0));
        assertEquals(1,obj.matchResult(2,2,3,3));
    }
}