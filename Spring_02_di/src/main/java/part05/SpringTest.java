package part05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		String path = "part05/di.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		Service svc = (Service) context.getBean("svc");
		
		svc.prn();
		
	}

}
