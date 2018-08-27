/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagecollector;

import com.bal.Anchor;
import com.bal.Domain;
import com.bal.Hasher;
import com.bal.WebPage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Cell;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class PageCollector {
  
  public void Page_Links(String URL) throws Exception
  {
      Document doc;
      try
      {
          doc = Jsoup.connect(URL).get();
          org.jsoup.select.Elements links=doc.select("a");
          
          FileOutputStream fout=new FileOutputStream("PageCollector.csv");  
			PrintStream csv=new PrintStream(fout); 
                        csv.println("id	       \t\t\t                        links");
          
          for(Element e:links)
          {
              String href=e.attr("abs:href");
              String id=Hasher.toSha256(href);
              System.out.println(id);
              System.out.println(href);
              csv.println(id + "            ,           	"+ href);
              
               
          }
      csv.println("      ");
      }
      catch (IOException ex) {
            Logger.getLogger(WebPage.class.getName()).log(Level.SEVERE, null, ex);
        }
  }

    
}
