package com.vesodeveloper.models;

import java.util.ArrayList;
import java.util.List;

import com.vesodeveloper.main1.History1;
import com.vesodeveloper.main1.Webview;

public class HistoryModel {

	public void navtoHistry() {
	System.out.println("Потребителя 	е на екрана с историята ");
	}

	public String isread() {
		String str="Readed";
return str;
	}
	

	public void scrolldown() {
	System.out.println("Scrolled");
}		
		// TODO Auto-generated method stub
	

	public void watch() {
	Webview w1=new Webview();	
	w1.start();
	w1.stop();
	}
	

}
