
package com.miracle.labs.microservice.transform.generated;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/DependeeClass")
public class SpringDependeeClassController{
com.monolith.legacy.DependeeClassBridge target = new com.monolith.legacy.DependeeClassBridge();
@GetMapping
( path="/String", produces="application/json")
public String getString(){
	return target.getString();
}
@GetMapping
( path="/A", produces="application/json")
public String getA(){
	return target.getA();
}
@PostMapping
( path="/A", produces="application/json")
public String setA(@RequestParam("0") String arg0 ){
	return target.setA(arg0);
}
@PostMapping
( path="/Internals", produces="application/json")
public String setInternals(@RequestParam("0") String arg0 ,@RequestParam("1") String arg1 ,@RequestParam("2") String arg2 ,@RequestParam("3") String arg3 ,@RequestParam("4") String arg4 ){
	return target.setInternals(arg0,arg1,arg2,arg3,arg4);
}
@GetMapping
( path="/Internals/{arg0}", produces="application/json")
public String getInternals(@PathVariable("arg0") String arg0 ){
	return target.getInternals(arg0);
}
@GetMapping
( path="/ProtectedInt", produces="application/json")
public String getProtectedInt(){
	return target.getProtectedInt();
}
@GetMapping
( path="/Int", produces="application/json")
public String getInt(){
	return target.getInt();
}
@PostMapping
( path="/Int", produces="application/json")
public String setInt(@RequestParam("0") String arg0 ){
	return target.setInt(arg0);
}
}
