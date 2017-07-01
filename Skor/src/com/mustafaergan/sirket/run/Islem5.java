package com.mustafaergan.sirket.run;

import java.util.ArrayList;
import java.util.List;

import com.mustafaergan.sirket.dao.DAO;
import com.mustafaergan.sirket.entity.Adres;
import com.mustafaergan.sirket.entity.Il;
import com.mustafaergan.sirket.entity.Yol;

public class Islem5 {

	public static void main(String[] args) {
		DAO dao = new DAO();
		
		Adres mustafa = new Adres();
		mustafa.setAdresVerisi("Çankaya");
		
		Adres cemal = new Adres();
		cemal.setAdresVerisi("Küçükesat");
		
		dao.insert(mustafa);
		dao.insert(cemal);
		
		List<Adres> list = new ArrayList<>();
		list.add(mustafa);
		list.add(cemal);
		
		Il il = new Il();
		il.setName("Ankara");
		il.setAdresList(list);
		dao.insert(il);
		
		Yol yol = new Yol();
		yol.setIsim("Atatürk Bulvarý");
		yol.setAdresList(list);
		
		dao.insert(yol);
		
		
	}
	
}
