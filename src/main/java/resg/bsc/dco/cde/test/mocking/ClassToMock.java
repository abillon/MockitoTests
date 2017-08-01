package resg.bsc.dco.cde.test.mocking;

import java.util.ArrayList;
import java.util.List;

public class ClassToMock {
	
	public boolean behaviorToMock1(int value1, int value2) {
		return false;
	}
	
	public boolean behaviorToMock2(int value1, int value2, int value3) {
		return (value1 == (value2 + value3));
	}
	
	public List<String> behaviorToMock3() {
		List<String> list = new ArrayList<String>();
		list.add("gaga");
		list.add("lady");
		return list;
	}

}
