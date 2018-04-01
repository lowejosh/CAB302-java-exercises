package junit.FootyScore;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FootyScoreTests {

	FootyScore testScore;
	
	@Before
	public void setUpFootyScore() {
		testScore = null;
	}
	
	@Test
	public void testConstruction() {
		testScore = new FootyScore();
	}
	
    @Test
    public void testStartingScore() {
        testScore = new FootyScore();
        String expected = "0, 0, 0";
        String actual = testScore.sayScore();
        assertEquals(expected, actual);
    }

    @Test
    public void testKickGoal() {
        testScore = new FootyScore();
        testScore.kickGoal();
        String expected = "1, 0, 6";
        String actual = testScore.sayScore();
        assertEquals(expected, actual);
    }

    @Test
    public void testKickBehind() {
        testScore = new FootyScore();
        testScore.kickBehind();
        String expected = "0, 1, 1";
        String actual = testScore.sayScore();
        assertEquals(expected, actual);
    }

    @Test
    public void testInfrontOfTrue() {
        testScore = new FootyScore();
        FootyScore testScoreCompare = new FootyScore();
        testScore.kickGoal();
        boolean result = testScore.inFrontOf(testScoreCompare);
        assertTrue(result);
    }

    @Test
    public void testInFrontOfSame() {
        testScore = new FootyScore();
        assertFalse(testScore.inFrontOf(testScore));
    }
}
