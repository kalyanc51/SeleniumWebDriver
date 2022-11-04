package JUnitClasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitAssertions {
	
	@Test		
    public void testAssert(){					
        		
        //Variable declaration		
        String string1="Junit";					
        String string2="Junit";					
        String string3="test";					
        String string4="test";					
        String string5=null;					
        int variable1=1;					
        int	variable2=2;					
        int[] arithmeticArray1 = { 1, 2, 3 };					
        int[] arithmeticArray2 = { 1, 2, 3 };
    
        //Assert statements		
        assertEquals(string1,string2);					
        assertSame(string3, string4);					
        assertNotSame(string1, string3);					
        assertNotNull(string1);			
        assertNull(string5);			
        assertTrue(variable1<variable2);					
        assertArrayEquals(arithmeticArray1, arithmeticArray2);	
        System.out.println("All the assertions passed!!");
    }		

}
