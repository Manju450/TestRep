import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WebAuto1 {

	public static void main(String[] args) throws IOException {

		String exePath = "C:\\Automation\\chromedriver_win32\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", exePath);

		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");

		driver.manage().window().maximize();

		driver.findElement(By.name("userName")).sendKeys("manju450");

		driver.findElement(By.name("password")).sendKeys("6266588");

		driver.findElement(By.name("login")).click();

		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();

		Select dropPassenger = new Select(driver.findElement(By.name("passCount")));

		dropPassenger.selectByVisibleText("1");

		Select dropFromPort = new Select(driver.findElement(By.name("fromPort")));

		dropFromPort.selectByVisibleText("Frankfurt");

		Select dropFromMonth = new Select(driver.findElement(By.name("fromMonth")));

		dropFromMonth.selectByVisibleText("March");

		Select dropFromDay = new Select(driver.findElement(By.name("fromDay")));

		dropFromDay.selectByVisibleText("21");

		Select dropToPort = new Select(driver.findElement(By.name("toPort")));

		dropToPort.selectByVisibleText("San Francisco");

		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();

		Select dropAirline = new Select(driver.findElement(By.name("airline")));

		dropAirline.selectByVisibleText("Blue Skies Airlines");

		driver.findElement(By.name("findFlights")).click();

		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input")).click();

		driver.findElement(By.name("reserveFlights")).click();

		driver.findElement(By.name("passFirst0")).sendKeys("SampleFirstName");

		driver.findElement(By.name("passLast0")).sendKeys("SampleLastName");

		Select dropMealPref = new Select(driver.findElement(By.name("pass.0.meal")));

		dropMealPref.selectByVisibleText("Low Calorie");

		Select dropCardType = new Select(driver.findElement(By.name("creditCard")));

		dropCardType.selectByVisibleText("MasterCard");

		driver.findElement(By.name("creditnumber")).sendKeys("5214632598563214");

		Select dropExpMonth = new Select(driver.findElement(By.name("cc_exp_dt_mn")));

		dropExpMonth.selectByVisibleText("10");

		Select dropExpYear = new Select(driver.findElement(By.name("cc_exp_dt_yr")));

		dropExpYear.selectByVisibleText("2010");

		driver.findElement(By.name("cc_frst_name")).sendKeys("FirstName");

		driver.findElement(By.name("cc_mid_name")).sendKeys("MiddleName");

		driver.findElement(By.name("cc_last_name")).sendKeys("LastName");

		driver.findElement(By.name("billAddress1")).clear();

		driver.findElement(By.name("billAddress1")).sendKeys("Srinatha Layout");

		driver.findElement(By.name("billAddress2")).sendKeys("10th Cross, 2nd Main");

		driver.findElement(By.name("billCity")).clear();

		driver.findElement(By.name("billCity")).sendKeys("Munnekolala");

		driver.findElement(By.name("billState")).clear();

		driver.findElement(By.name("billState")).sendKeys("Karnataka");

		driver.findElement(By.name("billZip")).clear();

		driver.findElement(By.name("billZip")).sendKeys("23235");

		Select dropBillCountry = new Select(driver.findElement(By.name("billCountry")));

		dropBillCountry.selectByVisibleText("COTE D'IVOIRE");

		driver.findElement(By.name("delAddress1")).clear();

		driver.findElement(By.name("delAddress1")).sendKeys("SaiBaba Layout");

		driver.findElement(By.name("delAddress2")).clear();

		driver.findElement(By.name("delAddress2")).sendKeys("SaiBaba Temple Road");

		driver.findElement(By.name("delCity")).clear();

		driver.findElement(By.name("delCity")).sendKeys("Kalyan Nagar");

		driver.findElement(By.name("delState")).clear();

		driver.findElement(By.name("delState")).sendKeys("Tamilnadu");

		driver.findElement(By.name("delZip")).clear();

		driver.findElement(By.name("delZip")).sendKeys("44551");

		Select dropDelCountry = new Select(driver.findElement(By.name("delCountry")));

		dropDelCountry.selectByVisibleText("SAUDI ARABIA");

		Alert alert = driver.switchTo().alert();

		String alertMessage = driver.switchTo().alert().getText();

		alert.accept();

		driver.findElement(By.name("buyFlights")).click();

		driver.close();

		try {

			FileWriter writer = new FileWriter("C:\\Users\\manju\\Desktop\\AutoFiles\\MyFile.txt", true);
			writer.write("\r\n");
			writer.write("\r\n");
			writer.write("\r\n");
			Date date = new Date();
			writer.write(date.toString() + ":");
			writer.write("\r\n");
			writer.write(alertMessage);
			writer.write("\r\n"); // write new line
			writer.write("\r\n");
			writer.write("Good Bye!");
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}