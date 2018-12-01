/*
 * Created on Mar 29, 2003
 *
 * @author henkel@cs.colorado.edu
 * 
 */
package de.jhenkel.bibtex.expansions;

/**
 * Exception thrown by an Expander object. 
 * 
 * @author henkel
 */
public class ExpansionException extends Exception {
	ExpansionException(Throwable cause){
		super(cause);
	}
	
	ExpansionException(String message) {
		super(message);
	}
}