package es.tion.ua.biblioteca;

import es.tion.ua.biblioteca.client.MiBibliotecaTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class MiBibliotecaSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for MiBiblioteca");
    suite.addTestSuite(MiBibliotecaTest.class);
    return suite;
  }
}
