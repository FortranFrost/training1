package org.fujitsu.training.codes;

import static org.mockito.Mockito.doReturn;
// manually import static methods
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doNothing;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestMathematics {
	
	@Mock // Mockito
	private Mathematics math;
	
	@Mock
	//@Spy  // opposite of mock
	private ArrayList<String> arrList /*= new ArrayList<>()*/;
	
	@BeforeEach // needed for spy
	public void setup() {
		//mathSpy = new Mathematics();
	}
	@AfterEach // needed for spy
	public void teardown() {
		//mathSpy = null;
	}
	
	@Test
	public void testDiv01() {
		
		// stubs
		when(math.div(10, 10)).thenReturn(1);
		when(math.div(10, 0)).thenReturn(0);
		when(math.div(50, 10)).thenReturn(5);
		when(math.div(60, 10)).thenReturn(6);
	
		Assertions.assertEquals(1, math.div(10, 10));
		System.out.println(math.div(10, 0));	
		System.out.println(math.div(50, 10));	
		System.out.println(math.div(60, 10));	
	}
	
	@Test
	public void testArrList01() {
		
		doReturn(true).when(math).display();
		//when(arrList.get(0)).thenReturn(100); //sensitive to data type
		
		//Assertions.assertEquals("sherwin", math.div(10, 0));
		
		
	}
	
	// rainy day testing
	@Test
	public void testDiv03() {
		
		when(math.div(10, 2)).thenThrow(ArithmeticException.class);
		
		Assertions.assertThrows(ArithmeticException.class, ()->{			
			math.div(10, 2);
		});
		
	}

}
