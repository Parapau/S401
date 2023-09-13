package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/")
	public String index() {
		return "les lludrigues marines son de les coses mes mones del mon";
	}
	
	
	@GetMapping("/HelloWorld")
	public String saluda (@RequestParam(defaultValue = "Unknown") String nom) {
		
		
		return "Hola " + nom + " estas executant un projecte gradle";
	}
	
	
	
	@GetMapping("/HelloWorld2/{nom}")
	public String saluda2 (@PathVariable("nom") String nom) {
		
		return "Hola " + nom + " estas executant un projecte gradle";
	}
	
}
