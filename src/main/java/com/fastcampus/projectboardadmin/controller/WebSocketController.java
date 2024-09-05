package com.fastcampus.projectboardadmin.controller;

import java.security.Principal;

import com.fastcampus.projectboardadmin.dto.websocket.WebSocketMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

	@MessageMapping("/hello")
	@SendTo("/topic/chat")
	public WebSocketMessage chat(WebSocketMessage message, Principal principal) throws InterruptedException {
		Thread.sleep(1000);//대화하는 느낌 시뮬레이션

		return WebSocketMessage.of("안녕하세요 " + principal.getName() + "! " + message.content() + "라고 하셨나요?");
	}
}
