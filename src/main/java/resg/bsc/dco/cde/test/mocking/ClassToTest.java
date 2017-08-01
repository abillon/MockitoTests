package resg.bsc.dco.cde.test.mocking;

public class ClassToTest {
	 
	private ClassToMock classToMock = null;

	public ClassToTest(ClassToMock classToMock) {
		this.classToMock = classToMock;
	}

	public boolean useClassToMockBehavior(int value1, int value2) {
		
		boolean result = classToMock.behaviorToMock1(value1, value2);
		//Something else todo
		
		return result;
	}
	
	public ClassToMock getClassToMock() {
		return classToMock;
	}
	
}
