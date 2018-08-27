/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import com.bal.*;
//import ehsan.BAL.*;
import com.bal.Anchor;
import com.bal.Domain;
import com.bal.WebPage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP Pavilion
 */
public class balUT {
    
    public balUT() {
    }
    @Test
    public void loadDocumentFromWeb () throws Exception
    {
        Domain domain=new Domain("https://jsoup.org/");
        assertTrue("getDomainHash: Hash is wrong length",domain.getDomainHash().length()==64);
        Anchor anchor=new Anchor(domain,"https://jsoup.org/");
        assertTrue("getAnchorHash: Hash is wrong length",anchor.getAnchorHash().length()==64);
        WebPage webPage=new WebPage(anchor);
        webPage.loadDocumentFromWeb();
        assertTrue("Test Result",webPage.getDocument()!= null);
        
    }
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
