package in.devopswithmanju.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	public WelcomeRestController() {
		logger.info("***** WelcomeRestController :: Constructor *****");
	}

	@GetMapping
	public String welcomeMsg() {
		logger.info("***** welcomeMsg() execution start *****");
		String msg = "Welcome to Devops With Manju";
		logger.info("***** welcomeMsg() execution end *****");
		String s = "hello";
		logger.info("******************************************************************");
		return msg;
	}
	
	@GetMapping("/getCurrentDateTime")
	public String greetMsg() {
		String msg = "Welcome to Devops With Manju";

		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		String msg += "Current Date and Time: " + currentDateTime.format(formatter);
		logger.info("***** ***************************** *****");
		return msg;
	}	
	
}
