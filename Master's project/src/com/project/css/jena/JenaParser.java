package com.project.css.jena;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.ModelFactory;
public class JenaParser {

	public static void main (String [] args){
	
			Model m = ModelFactory.createDefaultModel();
			String MS = "http://abc.xyz/test/";
			
			Resource r = m.createResource( MS+"r"); 
			Property p = m.createProperty(MS + "p");
			
			r.addProperty(p, "hello world", XSDDatatype.XSDstring);
			
			m.write(System.out, "Turtle");
	}
	
}
