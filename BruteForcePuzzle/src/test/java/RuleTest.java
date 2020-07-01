import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RuleTest {
    @Test
    public void compareJohnAndHeinzRule189() {
        assertEquals(new Rule189Heinz(), new Rule189Heinz());
        assertEquals(new Rule189John(), new Rule189John());
        assertEquals(new Rule189John(), new Rule189Heinz());
        assertEquals(new Rule189Heinz(), new Rule189John());
        assertNotEquals(new Rule147(), new Rule189John());
    }

//    @Test
    public void compareJohnAndHeinzRule964() {
        assertEquals(new Rule964(), new Rule964());
        assertEquals(new Rule964John(), new Rule964John());
        assertEquals(new Rule964John(), new Rule964());
        assertEquals(new Rule964(), new Rule964John());
        assertNotEquals(new Rule147(), new Rule964John());
    }
}
