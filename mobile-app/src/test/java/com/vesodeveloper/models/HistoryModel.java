package com.vesodeveloper.models;

import java.util.ArrayList;
import java.util.List;

import com.vesodeveloper.main1.History1;
import com.vesodeveloper.main1.Webview;

public class HistoryModel {

	public void navtoHistry() {
	System.out.println("Потребителя 	е на екрана с историята ");
	}

	public boolean isread(Boolean b) {
		List<com.vesodeveloper.main1.History1> htview=getHistory();
		
		final boolean isRead=htview.stream()
				.anyMatch(hs->b.equals(true));
	return isRead ? true : false;
	}
	private static List<com.vesodeveloper.main1.History1> getHistory(){
		History1 h=new History1();
		h.setAncient_history(true);
		final List<History1>hl= new ArrayList<History1>();
		hl.add(h);
		return hl;
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
