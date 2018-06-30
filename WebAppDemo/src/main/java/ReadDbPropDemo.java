import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadDbPropDemo {
public static void main(String[] args) throws IOException {
	InputStream inputStream=Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
	Properties properties=new Properties();
	properties.load(inputStream);
	System.out.println(properties.getProperty("username"));
	System.out.println(properties.getProperty("password"));
}
}
