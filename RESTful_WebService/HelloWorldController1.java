import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  
//Controller  
@RestController  
public class HelloWorldController1   
{  
//using get method and hello-world as URI  
@GetMapping(path="/hello-world")  
public String helloWorld()  
{  
return "Hello World";  
}  
}  
