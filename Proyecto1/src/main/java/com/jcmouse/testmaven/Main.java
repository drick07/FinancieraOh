package com.jcmouse.testmaven;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/**
 * @see http://www-jc-mouse.net
 * @author mouse
 */
public class Main {
    
    public static void main(String[] args) {
        //Codigo HTML
        String HTML = "<html><head>"
                + "<title>Mi Primera Pagina Web</title>"
                + "</head>"
                + "<body>HOLA MUNDO !!!</body>"
                + "</html>";
        //se obtiene etiquetas HTML
        Document document = Jsoup.parse(HTML);
        Elements allElements = document.getAllElements();        
        allElements.stream().forEach((element) -> {
            System.out.println( element.nodeName() + " " + element.ownText());
        });
    }
    
} 