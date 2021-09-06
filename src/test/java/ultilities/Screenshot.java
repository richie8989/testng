package ultilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseClass;

public class Screenshot extends BaseClass {
	
	
	
	
	
	public void getScreenshot() throws IOException {
		
		Date currentdate= new Date();
		String screenshotfilename= currentdate.toString().replace(":","-");
		File screenshotFile= ((TakesScreenshot )driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//pics//" + screenshotfilename+ ".png"));
		
		
	}

}
