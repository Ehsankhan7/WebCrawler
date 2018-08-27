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
import java.util.Scanner;
import static javafx.application.Platform.exit;
import javafx.scene.control.Cell;


public class ScrapperCrawler {
    
  
        public static void main(String[] args) throws Exception {
      System.out.println("Select from the Following options: ");
      System.out.println("1)Find Web links(crawler)");
      System.out.println("2)Find specific data(scrapper)");      
   System.out.println("3)Exit");
   int option;
   Scanner s1=new Scanner(System.in);
   Scanner s2=new Scanner(System.in);
   option=s1.nextInt();
   if(option==1)
   {
    System.out.println("Enter URL: ");
   
    String URL=s2.nextLine();
   
      PageCollector pg=new PageCollector();
      pg.Page_Links(URL);
   }
   
   if(option==2)
   {
       System.out.println("Enter URL: ");
   
    String URL=s2.nextLine();
    DataCollect d1=new DataCollect();
   //////////creating price argument
    System.out.println("Please select CLASS of price:");
   String InspectClass=s2.nextLine();
   
   System.out.println("Please enter the currency format e.g Rs(pakistani rupees),$ (American Dollar).....etc");
   String currency=s2.nextLine();
   
   String PRICE="."+InspectClass+":"+"contains("+currency+")";
   System.out.println(PRICE);
   
   /*creating Address Argument
   System.out.println("Enter the Class for Address:");
   String AddClass=s2.nextLine();
   System.out.println("Enter city:");
   String City=s2.nextLine();
   
   String ADDRESS="span["+AddClass+"]:contains("+City+")";
   System.out.println(ADDRESS);
   */
   
   
   d1.jsoupCollectPoint(URL,PRICE);
   }
   else{
       exit();
       
   }
   }
}
