package by.myJavaCourses.exceptions;

import java.util.logging.Logger;

public class MyWrapper {

	private MyClass myClass = new MyClass();
	private static final Logger log = Logger.getLogger("MyWrapper.class");

	public void invoke(int method) {
		if (method == 1) {

			try {
				myClass.firstMethod();
			} catch (AnotherException1 e) {
				// TODO Auto-generated catch block
				System.out.println("exception1");
			} catch (AnotherException2 e) {
				// TODO Auto-generated catch block
				System.out.println("exception2");
			} finally {
				log.info("hello");
			}
		}
		if (method == 2) {
			myClass.secondMethod();
		}
	}

	public void set(Object ob) {
		if (ob == "String") {
			myClass.setName("String");
		} else if (ob == new Integer(0)) {
			myClass.setIntValue(new Integer(0));
		} else {
			throw new RuntimeException();
		}
	}

}
