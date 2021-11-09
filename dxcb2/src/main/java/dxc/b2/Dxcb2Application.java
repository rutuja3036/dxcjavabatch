package dxc.b2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootConfiguration

public class Dxcb2Application {
public static void main(String[] args) {
	SpringApplication.run(Dxcb2Application.class,args);
	ApplicationContext vehiclesFactory = new ClassPathXmlApplicationContext("settingsconfig.xml");
	for(int i =0;i<10;i++);
	try {
		Thread.sleep(800);
		Vehicle vehicle = (Vehicle) vehiclesFactory.getBean("Car");
		vehicle.drive();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Hello spring");
}

}
