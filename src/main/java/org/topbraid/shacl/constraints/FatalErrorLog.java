package org.topbraid.shacl.constraints;

import org.topbraid.shacl.vocabulary.SH;

/**
 * A singleton to record (and print) fatal errors thrown by the validation engine.
 * 
 * @author Holger Knublauch
 */
public class FatalErrorLog {

	private static FatalErrorLog singleton = new FatalErrorLog();
	
	public static FatalErrorLog get() {
		return singleton;
	}
	
	public static void set(FatalErrorLog value) {
		FatalErrorLog.singleton = value;
	}
	
	
	public void log(String message) {
		System.err.println(SH.NAME + " Fatal Error: " + message);
	}
}
