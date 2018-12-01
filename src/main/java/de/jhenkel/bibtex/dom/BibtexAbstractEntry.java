/*
 * Created on Mar 17, 2003
 *
 * @author henkel@cs.colorado.edu
 * 
 */
package de.jhenkel.bibtex.dom;

/**
 * Abstract entries are the building blocks of bibtex files.
 * 
 * @author henkel
 */
public abstract class BibtexAbstractEntry extends BibtexNode {

	protected BibtexAbstractEntry(BibtexFile file){
		super(file);
	}

}
