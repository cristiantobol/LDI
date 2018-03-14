package uk.ac.derby.ldi.calc.calculator;

public class ValueDouble extends ValueAbstract {
	
	public double internalValue;
	
	public ValueDouble(double b) {
		internalValue = b;
	}
	
	public boolean booleanValue() {
		throw new ExceptionSemantic("Cannot convert integer to double.");
	}
	
	public double doubleValue() {
		return internalValue;
	}
	
	public int intValue() {
		return (int)internalValue;
	}
	
	public Value or(Value v) {
		throw new ExceptionSemantic("Cannot perform logical OR on double."); 
	}

	public Value and(Value v) {
		throw new ExceptionSemantic("Cannot perform logical OR on double.");
	}

	public Value not() {
		throw new ExceptionSemantic("Cannot perform logical NOT on double.");
	}

	public int compare(Value v) {
		if (internalValue == v.intValue())
			return 0;
		else if (internalValue > v.intValue())
			return 1;
		else
			return -1;
	}

	public Value add(Value v) {
		return new ValueDouble(internalValue + v.doubleValue());
	}

	public Value subtract(Value v) {
		return new ValueDouble(internalValue - v.doubleValue());
	}

	public Value mult(Value v) {
		return new ValueDouble(internalValue * v.doubleValue());
	}

	public Value div(Value v) {
		return new ValueDouble(internalValue / v.doubleValue());
	}

	public Value unary_plus() {
		return new ValueDouble(internalValue);
	}

	public Value unary_minus() {
		return new ValueDouble(-internalValue);
	}
	
	public String toString() {
		return "" + internalValue;
	}
}
