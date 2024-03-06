package GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility extends WebdriverUtility {

	public static String fetchData(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(IpathConstant.propertyPath);
		 p = new Properties();
		 p.load(fis);
		 return p.getProperty(key);
	}
}
