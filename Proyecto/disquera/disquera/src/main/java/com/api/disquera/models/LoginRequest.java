package com.api.disquera.models;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
@SuppressWarnings("unused")
public class LoginRequest {
	
	 private String emailUser;
	    private String message;
	    private String code;

	    // Getter para emailUser
	    public String getEmailUser() {
	        return emailUser;
	    }

	    // Getter para message
	    public String getMessage() {
	        return message;
	    }

	    // Getter para code
	    public String getCode() {
	        return code;
	    }
	

}
