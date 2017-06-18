package com.mustafaergan.sirket.run;

import com.mustafaergan.sirket.dao.DAO;
import com.mustafaergan.sirket.entity.Adres;
import com.mustafaergan.sirket.entity.Il;
import com.mustafaergan.sirket.entity.Personel;

public class Islem4 {
	
	public static void main(String[] args) {
		DAO dao = new DAO();
		Il il = new Il();
		il.setName("Ankara");
		dao.insert(il);
		
		
		Adres adres = new Adres();
		adres.setIl(il);
		adres.setAdresVerisi("Çankaya/Ankara");
		dao.insert(adres);
		
		Personel personel = new Personel();
		personel.setName("Hasan");
		personel.setAdres(adres);
		
		dao.insert(personel);
	}

}
