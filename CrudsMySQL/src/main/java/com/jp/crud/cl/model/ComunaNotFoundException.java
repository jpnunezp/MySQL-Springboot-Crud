package com.jp.crud.cl.model;

public class ComunaNotFoundException extends RuntimeException{

    public ComunaNotFoundException(Long id) {
        super("Comuna id not found : " + id);
    }
	
}
