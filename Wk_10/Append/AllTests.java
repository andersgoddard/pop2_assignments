public class AllTests {
	public static junit.framework.TestSuite suite(){	
		junit.framework.TestSuite suite = new junit.framework.TestSuite();
		suite.addTestSuite(AppendTest.class);
		return suite;		
	}
}