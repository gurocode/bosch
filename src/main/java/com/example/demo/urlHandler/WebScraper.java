package com.example.demo.urlHandler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;


public class WebScraper {
    int id = 1;
    JsonConverter json = new JsonConverter();

    public String urlByKey(String keyword){

        try{
            Document doc = Jsoup.connect("https://www.google.com/search?q=" + keyword.toString()).get();
            Elements element = doc.getElementsByTag("a");

            for(Element x: element){
                if(x.text().contains("https") && id <= 10){
                    json.addToList(id,x.attr("href"));
                    id += 1;
                }
            }

        }
        catch(IOException ioe){
            System.out.println("Exception: " + ioe);
        }

       return json.list.toString();
    }
}
