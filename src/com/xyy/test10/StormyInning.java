package com.xyy.test10;

import static com.xyy.tools.Print.*;

class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}
class UmpireArgument extends BaseballException {}

abstract class Inning {
	public Inning() throws BaseballException {}
	public void event() throws BaseballException {
		// Doesn't actually have to throw anything
	}
	public abstract void atBat() throws  Strike, Foul;
	public void walk() {}	// Throws no checked exceptions
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
	// OK to add new exceptions for constructors, but you
	// must deal with the base constructor exceptions:
	public StormyInning() throws RainedOut, BaseballException {}
	public StormyInning(String s) throws Foul, BaseballException {}
	
	// Regular methods must conform to base class:
	//! void walk() throws PopFoul {} // Compile error
	// Interface CANNOT add exceptions to existing
	// methods from the base class:
	//! public void event() throws RainedOut {}
	// If the method doesn't already exist in the 
	// base class, the exception is OK.
	public void rainHard() throws RainedOut {}
	// You can choose to not throw any exceptions
	// even if the base version does:
	public void event() {}
	// Overridden methods can throw inherited exceptions:
	public void atBat() throws PopFoul {}
	
	public void noBall() throws UmpireArgument {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			StormyInning si = new StormyInning();
			si.atBat();
			si.noBall();
		} catch (PopFoul e) {
			// TODO: handle exception
			print("Pop foul");
		} catch (RainedOut e) {
			// TODO: handle exception
			print("Rained out");
		}  catch (UmpireArgument e) {
			// TODO: handle exception
			print("UmpirreArgument exception");
		} catch (BaseballException e) {
			// TODO: handle exception
			print("Generic baseball exception");
		}
		
		// strike not thrown in derived version.
		try {
			// What happens if you upcast?
			Inning i =  new StormyInning();
			i.atBat();
			// You must catch the exceptions from the base-class version of the method:
		} catch (Strike e) {
			// TODO: handle exception
			print("Strike");
		} catch (Foul e) {
			// TODO: handle exception
			print("Foul");
		} catch (RainedOut e) {
			// TODO: handle exception
			print("Rained out");
		} catch (BaseballException e) {
			// TODO: handle exception
			print("Generic baseball exception");
		}
	}
}
