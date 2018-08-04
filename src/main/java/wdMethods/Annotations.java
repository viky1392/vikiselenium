package wdMethods;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Annotations extends SeMethods {
@Parameters({"URL","UNAME","PWD"})
	@BeforeMethod  //(groups= {"smoke"})
	public void beforeMethod(String url,String uname , String password) {

		startApp("chrome", url);
		WebElement eleUserName = locateElement("class", "dome1");
		type(eleUserName, uname);
		WebElement elePassword = locateElement("id", "password");
		type(elePassword,password );
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);

	}

	@AfterMethod //(groups= {"smoke"})
	public void afterMethod() {

		closeBrowser();

	}

}

