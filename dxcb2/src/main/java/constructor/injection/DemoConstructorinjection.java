package constructor.injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoConstructorinjection {
	private static final String APPLICATION_CONTEXT_XML = "FanKnob.xml";
	public static void main(String[] args) {
		 BeanFactory factory = loadContext();
		 Employee employee = (Employee)factory.getBean("employee");
		 employee.show();
}
private static BeanFactory loadContext() 
{
	Resource resource = new ClassPathResource(APPLICATION_CONTEXT_XML);
	BeanFactory factory = new XmlBeanFactory(resource);
	return factory;
}
}
