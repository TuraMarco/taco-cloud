package tacos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * La classe controller gestisce le entry del server.
 */
@Controller
public class HomeController {

	/**
	 * Il metodo di un controller deve ritornare una istanza di String e viene
	 * mappato su di un path
	 * 
	 * @return String
	 */
	@RequestMapping(path = "/", method=RequestMethod.GET)
	public String home() {
		return "home";
	}
}
