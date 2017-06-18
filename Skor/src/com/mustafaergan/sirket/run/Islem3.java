package com.mustafaergan.sirket.run;

import com.mustafaergan.sirket.dao.DAO;
import com.mustafaergan.sirket.entity.Personel;

public class Islem3 {
	
	public static void main(String[] args) {
		DAO dao = new DAO();
		
		Personel per =dao.getAPersonelId(2);
		
		System.out.println(per.getAdres().getAdresVerisi());
	}

}
