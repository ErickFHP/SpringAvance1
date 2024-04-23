package com.api.disquera.controllers;
import com.api.disquera.services.emailSender;
import com.api.disquera.models.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/auth")
public class EmailController {
	
	    emailSender emailSender;
	    
	    public EmailController(emailSender emailSender) {
	        this.emailSender = emailSender;
	    }
	    
	    @PostMapping("/authenticate")
	    public ResponseEntity<Object> authenticate(@RequestBody LoginRequest loginRequest) {
	    	emailSender.sendMessageUser(loginRequest.getEmailUser(), loginRequest.getMessage());
	        // Lógica de autenticación utilizando emailSender
	        return ResponseEntity.ok().body("Hola...");
	    }
	

	
	

}
