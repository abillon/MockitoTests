package resg.bsc.dco.cde.test.mocking;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ClassToTestTest {

	@Test
	public void testMockBehavior() {

		ClassToMock realClassToMock = new ClassToMock();
		System.out.println(realClassToMock.behaviorToMock2(3, 2, 1));

		ClassToMock classToMock = mock(ClassToMock.class);
		stub(classToMock.behaviorToMock1(1, 2)).toReturn(true);
		// when(classToMock.behaviorToMock2(1, 2, 3)).thenReturn(true);

		System.out.println(classToMock.behaviorToMock2(3, 2, 1));
		System.out.println(classToMock.behaviorToMock3().size());

		ClassToTest classToTest = new ClassToTest(classToMock);

		boolean result = classToTest.useClassToMockBehavior(1, 2);

		verify(classToMock, times(1)).behaviorToMock1(1, 2);
		assertTrue(result);

		// assertTrue(classToMock.behaviorToMock2(1, 2 , 3));

	}
}
