package stepDefenitions.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

  public static void takeScreenshot(String heading) {
      Date dateNow = new Date();
      SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
      String filename = format.format(dateNow) + ".png";
      File screenshot = ((TakesScreenshot) Browser.getInstance()).getScreenshotAs(OutputType.FILE);
      try {
          FileUtils.copyFile(screenshot, new File("C:\\Screenshots\\"+ heading + filename));
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
}

