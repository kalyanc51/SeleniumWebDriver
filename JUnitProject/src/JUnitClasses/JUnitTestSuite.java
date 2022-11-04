package JUnitClasses;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)				
@Suite.SuiteClasses({
	TestJunit.class,
	JUnitAnnotations.class,
	JUnitAssertions.class
	})		

public class JUnitTestSuite {				
			// This class remains empty, it is used only as a holder for the above annotations		
}


