package com.mustafa;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.mustafaergan.matematik.MatematikServiceLocator;

import NET.webserviceX.www.GlobalWeatherLocator;

public class Islem {
	
	public static void main(String[] args) {
		MatematikServiceLocator
		matloc = new MatematikServiceLocator();
		
		GlobalWeatherLocator locator
		= new GlobalWeatherLocator();
		
		try {
//			int veri = matloc.getMatematik().toplama(50, 100);
//			System.out.println(veri);
	String veri = 
	locator.getGlobalWeatherSoap().getCitiesByCountry("turkey");
	System.out.println(veri);
	veri = locator.getGlobalWeatherSoap().getWeather("batman", "turkey");
	System.out.println(veri);

			
		} catch (RemoteException | ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
