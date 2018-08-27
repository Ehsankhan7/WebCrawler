/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
//import pagecollector.PageCollector;

/**
 *
 * @author HP Pavilion
 */
public class WebPage {
    private Anchor anchor;
    private String webPageHash;
    private int anchorParseStatus;
    private int emailParseStatus;
    private Document document;
    //general constructor for crawling/scrapping
  public WebPage(Anchor anchor) throws Exception{
        this.anchor = anchor;
        this.webPageHash=Hasher.toSha256(anchor.getAnchorHash()+ SameBal.getTimestamp().toString());
  this.anchorParseStatus=0;
this.emailParseStatus=0;  
  }
    public String getWebPageHash() {
        return webPageHash;
    }

    public int getAnchorParseStatus() {
        return anchorParseStatus;
    }

    public int getEmailParseStatus() {
        return emailParseStatus;
    }

    public Document getDocument() {
        return document;
    }
    

  
    
    public void loadDocumentFromWeb()
    {
         
        try {
            document = Jsoup.connect(anchor.getAnchorURL()).get();
           
        } catch (IOException ex) {
            Logger.getLogger(WebPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
