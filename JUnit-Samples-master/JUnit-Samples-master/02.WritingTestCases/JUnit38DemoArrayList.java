import junit.framework.*;
import java.util.*;
public class JUnit38DemoArrayList extends TestCase {
    private ArrayList<String> lst;     // declare test fixture instance.

   public JUnit38DemoArrayList(String name) { super(name); }   // constructor

   // Initialize the test fixture used by all the test methods
    protected void setUp() throws Exception {
        lst = new ArrayList<String>();
        lst.add("alpha");    // at index 0
        lst.add("beta");     // at index 1
    }
    protected void tearDown() throws Exception { super.tearDown(); }  // for clean-up operation

    // test method to test the insert operation
    public void testInsert() {
        assertEquals("wrong size", 2, lst.size());  // error message, expected, actual
        lst.add(1, "charlie");
        assertEquals("wrong size", 3, lst.size());
        assertEquals("wrong element", "alpha",   lst.get(0));
        assertEquals("wrong element", "charlie", lst.get(1));
        assertEquals("wrong element", "beta",    lst.get(2));
    }
    // test method to test the replace operation
    public void testReplace() {
        assertEquals("wrong size", 2, lst.size());
        lst.set(1, "charlie");
        assertEquals("wrong size", 2, lst.size());
        assertEquals("wrong element", "alpha",   lst.get(0));
        assertEquals("wrong element", "charlie", lst.get(1));
    }
    public static void main(String[] args) {
        junit.textui.TestRunner.run(JUnit38DemoArrayList.class);
    }
} 