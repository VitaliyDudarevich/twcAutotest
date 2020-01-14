package pages;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class PageURL {
    private WebDriver driver;
    public PageURL(WebDriver driver) {
        this.driver = driver;
    }

    static Map<String, String> pageURL = new HashMap();
    static {
        pageURL.put("home page onliner.by", "https://www.onliner.by/");
        pageURL.put("afisha tut.by","https://afisha.tut.by/");
    }


    public static String returnURL(String str){
        return pageURL.get(str);
    }
}
