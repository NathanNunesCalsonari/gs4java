package br.com.fiap.previnatech.exception;

public class PrevinaTechError {
	
	private String error;
	private String message;
	
	public PrevinaTechError(String error, String message) {
	    this.error = error;
	    this.message = message;
	}
	
	public String getError() {
	    return error;
	}
	
	public String getMessage() {
	    return message;
	}

}
