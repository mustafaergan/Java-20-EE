package com.mustafaergan.skor.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.mustafaergan.skor.entity.Haber;

@ManagedBean
@SessionScoped
public class UserController {

	List<Haber> haberler;
	
//	public UserController() {
//		// TODO Auto-generated constructor stub
//	}
	
	@PostConstruct
	public void init(){
		haberler = new ArrayList<>();
		Haber haber1 = new Haber();
		haber1.setSira(1);
		haber1.setDuyuru("Pazar Ders Yok");
		
		Haber haber2 = new Haber();
		haber2.setSira(2);
		haber2.setDuyuru("16 Temmuzda ders yok");
		haberler.add(haber1);
		haberler.add(haber2);
	}
	
	public void setHaberler(List<Haber> haberler) {
		this.haberler = haberler;
	}
	
	public List<Haber> getHaberler() {
		return haberler;
	}
	
}
