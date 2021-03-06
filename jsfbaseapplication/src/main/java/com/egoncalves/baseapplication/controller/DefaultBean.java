package com.egoncalves.baseapplication.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean(name="defaultBean")
@RequestScoped
public class DefaultBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private static Logger log = LoggerFactory.getLogger(DefaultBean.class);
	
	private String message = "Basic Web Application - JSF";
	
	@PostConstruct
	public void init(){
		log.info("Bean iniciado com sucesso!");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
