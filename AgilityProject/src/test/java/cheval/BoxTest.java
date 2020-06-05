package cheval;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Cheval.Box;
import Cheval.Cheval;

public class BoxTest {
	
    private Box box1;
    private Cheval cheval1;

    @Before
    public void setUp() // throws java.lang.Exception
    {
        cheval1 = new Cheval(333, 8);
        ArrayList<Cheval> chevaux = new ArrayList<Cheval>();
        chevaux.add(cheval1);
        box1 = new Box(chevaux, 2);
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void testConstructorBox()
    {
    	cheval1 = new Cheval(333, 8);
        ArrayList<Cheval> chevaux = new ArrayList<Cheval>();
        chevaux.add(cheval1);
        box1 = new Box(chevaux, 2);
        assertEquals(box1.getChevaux().size(),1);	
    }
	
    
    @Test
    public void testGetterCapacity()
    {
        assertEquals(box1.getCapacity(),10);
      	
    }
	
    
    @Test
    public void testSetterCapacity()
    {
    	box1.setCapacity(15);
        assertEquals(box1.getCapacity(),15);
      	
    }
    
    

    @Test
    public void testGetterNumero()
    {
    	cheval1 = new Cheval(333, 8);
        ArrayList<Cheval> chevaux = new ArrayList<Cheval>();
        chevaux.add(cheval1);
        box1 = new Box(chevaux, 2);
        assertEquals(box1.getNumero(),2);
      	
    }
    

    @Test
    public void testSetterNumero()
    {
    	cheval1 = new Cheval(333, 8);
        ArrayList<Cheval> chevaux = new ArrayList<Cheval>();
        chevaux.add(cheval1);
        box1 = new Box(chevaux, 2);
        box1.setNumero(5);
        assertEquals(box1.getNumero(),5);
      	
    }
    
    
    @Test
    public void testGetterCheval()
    {
    	cheval1 = new Cheval(333, 8);
        ArrayList<Cheval> chevaux = new ArrayList<Cheval>();
        chevaux.add(cheval1);
        box1 = new Box(chevaux, 2);
        assertEquals(box1.getCheval(0),cheval1);
      	
    }
    
    @Test
    public void testAddCheval()
    {
    	cheval1 = new Cheval(333, 8);
        ArrayList<Cheval> chevaux = new ArrayList<Cheval>();
        chevaux.add(cheval1);
        box1 = new Box();
        box1.addCheval(cheval1);
        assertEquals(box1.getCheval(0),cheval1);
      	
    }
	
}

