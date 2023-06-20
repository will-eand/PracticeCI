import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("USA");
        assertTrue(myString.detectCapitalUse());

    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("Google");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest3() {
        myString.setString("leetcode");
        assertTrue(myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest4() {
        myString.setString("googlE");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest5() {
        myString.setString("");
        assertFalse(myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest6() {
        myString.setString("gooGLE");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest7() {
        myString.setString("GoOGLE");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest8() {
        myString.setString("GOOGLE");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest9() {
        myString.setString("GO OGLE");
        assertFalse(myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest10() {
        myString.setString("oogaboogaS");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest11() {
        myString.setString("oogabooga");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest12() {
        myString.setString("OOGABOOGA");
        assertTrue(myString.detectCapitalUse());
    }



}