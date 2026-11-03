package com.baji.springollama.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baji.springollama.service.OllamaChatService;

@RestController
@RequestMapping("/chat")
public class OllamaController {
	
	@Autowired
	private OllamaChatService chatService;
	
	@GetMapping
	public String chat(@RequestParam String message) {
		return chatService.chat(message);
	}

}
