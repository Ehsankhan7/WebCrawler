/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagecollector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP Pavilion
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class DataCollect {
    public void jsoupCollectPoint(String URL,String PRICE) throws Exception
    {
        System.out.println("Running...\n");
        System.out.println(PRICE);
        
       // System.out.println(ADDRESS);
        Document document;
		try {
			//Get Document object after parsing the html from given url.
			document = Jsoup.connect(URL).get();

			String title = document.title(); //Get title
			System.out.println("  Title: " + title); //Print title.
                        Elements price = document.select(PRICE); //Get price
			//Elements address = document.select(ADDRESS); //Get address
			FileOutputStream fout=new FileOutputStream("DataCollector.csv");  
			PrintStream csv=new PrintStream(fout); 
                        csv.println("Prices");
for (int i=0; i < price.size(); i++) {
    String PR=price.get(i).text();
	System.out.println(PR );
        csv.println(PR);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("done");
    }

   
    
}

