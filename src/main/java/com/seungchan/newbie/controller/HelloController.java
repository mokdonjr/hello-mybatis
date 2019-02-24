package com.seungchan.newbie.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.seungchan.newbie.model.Player;
import com.seungchan.newbie.service.HelloService;

/**
 * Handles requests for the application home page.
 */
@RestController
public class HelloController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("hi.");
		List<Player> list = helloService.getHelloDaoAll();
		StringBuilder builder = new StringBuilder();
		for (Player player : list) {
			logger.info(player.toString());
			builder.append(player.toString() + "\n");
		}
		return builder.toString();
	}
	
}
