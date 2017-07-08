package com.mustafaergan.skor.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginController {
	
	String outputKulAdi ="Kullanici Adi"; 
	String kullanciAdi;
	String sifre;
	
	
	public void login(){
		System.out.println("giris: " + this.kullanciAdi);
	}
	
	
	public void setKullanciAdi(String kullanciAdi) {
		this.kullanciAdi = kullanciAdi;
	}
	
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	public String getKullanciAdi() {
		return kullanciAdi;
	}
	
	public String getSifre() {
		return sifre;
	}
	
	public void setOutputKulAdi(String outputKulAdi) {
		this.outputKulAdi = outputKulAdi;
	}
	
	public String getOutputKulAdi() {
		return outputKulAdi;
	}

}
