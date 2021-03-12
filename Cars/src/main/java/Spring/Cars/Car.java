package Spring.Cars;

 

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

 

public class Car {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Wheel w=new Wheel();
        //w.setId(101);
        //w.setPrice(45.45);
         //car depends on wheel
        
        //IOC container -basic 
       // BeanFactory factory= new XmlBeanFactory(new FileSystemResource("D:\\Eclipse\\ejavacodes\\Maven\\Cars\\src\\main\\resource\\Beans.xml"));

        // Advanced 
        ClassPathXmlApplicationContext factory =new ClassPathXmlApplicationContext("Beans.xml");
        Wheel wheel=(Wheel)factory.getBean("w");
        factory.start();
        System.out.println(wheel.id+"  "+wheel.price);  //Constructor injection   -Dependency Injection
        //    factory.i        
        Wheel wheel1=(Wheel)factory.getBean("w");        
        System.out.println(wheel.hashCode()+  "  "+ wheel1.hashCode());
        System.out.println(wheel1.id+"  "+wheel1.price);  //Constructor injection   -Dependency Injection
    
        Engine engine=(Engine)factory.getBean("e");
        
        engine.setModel("Sports");
        System.out.println(engine.getModel());  // setter Injection  --DependencyInjection
        factory.close();
    }
}