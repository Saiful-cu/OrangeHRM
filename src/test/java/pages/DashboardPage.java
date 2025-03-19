package pages;

import constants.LocatorConstant;
import org.openqa.selenium.By;

public class DashboardPage extends BasePage {

   public DashboardPage(){
       super(By.xpath(String.format(LocatorConstant.PRECISE_TEXT_XPATH,"Dashboard")));
   }
}
