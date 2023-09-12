package cat.tacademy.barcelonactiva.FrancoToda.Pau.s04.t01.n01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/")
	public String index() {
		return "Les patates estan molt bones :)";
	}
	
	@GetMapping("/HelloWorld")
	public String saluda(@RequestParam(defaultValue = "Unknown") String nom) {
		String a = (nom.equals("Unknown"))?"No et conec aixi que em caus malament" : "Hola " + nom + " hem caus malament.";
		return a;
	}
	
	
	@GetMapping("/HelloWorld2/{nom}")
	public String saluda2(@PathVariable String nom) {
		return "Hola " + nom + " em caus malament tu tambe";
	}
	
}
