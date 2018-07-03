package upm.oeg.wsld.jena;

import org.junit.*;
import static org.junit.Assert.*;

import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;

public class RdfTest {
 
    @Test
    public void test() {
		Model model = ModelFactory.createDefaultModel().read("data.rdf");
		assertEquals(false,true);
    }
}
