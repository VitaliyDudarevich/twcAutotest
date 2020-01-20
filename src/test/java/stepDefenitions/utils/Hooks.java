package stepDefenitions.utils;

import io.cucumber.java.After;

public class Hooks {
    @After
    public void tierDown(){
        Browser.destroy();
    }
}
