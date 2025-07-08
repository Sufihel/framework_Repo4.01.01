package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("chrome");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println("execute createContactTest");
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(URL);
		System.out.println(BROWSER);
	}

	@Test
	public void modifyContactTest() {
		System.out.println("execute modifyContactTest");
	}
}
