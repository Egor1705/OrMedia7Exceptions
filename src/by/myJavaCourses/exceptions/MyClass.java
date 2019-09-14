package by.myJavaCourses.exceptions;

import java.util.Random;

public class MyClass {

	private int intValue;
	private String name;

	public void firstMethod() throws AnotherException1, AnotherException2 {
		Random r = new Random();
		int rand = 1 + r.nextInt(100);
		if (rand <= 50) {
			if (rand <= 25) {

				throw new AnotherException1();
			} else {

				throw new AnotherException2();
			}
		} else {
			System.out.println(getMessage());
		}

	}

	public String getMessage() {
		return "no exceptions";
	}

	public void secondMethod() {
		if (this.name == null || this.intValue <= 0) {
			throw new MyRuntimeExceptionA();
		}
		if (this.name == null && this.intValue > 100) {
			throw new MyRuntimeExceptionB();
		}
		if (this.name == null && this.intValue == 1 + (int) (Math.random() * 101)) {
			throw new MyRuntimeExceptionC();
		}
		if (this.name != null && this.intValue != 1 + (int) (Math.random() * 101)) {
			throw new MyRuntimeExceptionD();
		}
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + intValue;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (intValue != other.intValue)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
