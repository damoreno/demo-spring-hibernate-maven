import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.administration.model.HelloWorld;
import cl.administration.service.HelloWorldService;
 
 
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    	  new ClassPathXmlApplicationContext("beanLocations.xml");
 
    	HelloWorldService helloWorldService = (HelloWorldService)appContext.getBean("helloWorldService");
 
    	/** insert **/
    	HelloWorld helloWorld = new HelloWorld();
    	helloWorld.setId(1);
    	helloWorld.setCode("76689");
    	helloWorld.setName("Name1");
    	helloWorldService.save(helloWorld);
 
    	/** select **/
    	HelloWorld helloWorld2 = helloWorldService.findByHelloWorldCode("76689");
    	System.out.println(helloWorld2);
 
    	/** update **/
    	helloWorld2.setName("Name2");
    	helloWorldService.update(helloWorld2);
 
    	/** delete **/
    	helloWorldService.delete(helloWorld2);
 
    	System.out.println("Done");
    }
}