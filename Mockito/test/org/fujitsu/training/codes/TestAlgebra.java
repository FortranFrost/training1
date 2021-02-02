package org.fujitsu.training.codes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class TestAlgebra {

	@Mock
	private Mathematics math;
	
	@InjectMocks
	private Algebra algebra = new Algebra(math); // injectibles means used in testing; must be instantiated
	
	@Test
	public void testGetExpression01() {
		
		when(math.div(10, 0)).thenReturn(0);
		
		Assertions.assertEquals(2000, algebra.getExpression(10,0));
		
		verify(math,times(2)).div(10, 0); // twice tinawag ang math.div sa algebra
	}
}
