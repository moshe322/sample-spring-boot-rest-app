package com.devopsdemo.samplerestapp;

import org.springframework.beans.factory.annotation.Autowired;

public class BMSService {
	
	@Autowired
	AsianMoviesService asianMoviesService;
	
	public boolean bookAsianCinemaTicket(int theatreId, int rowNo, int colNo) {
		 // 
		boolean result = true;
		
		boolean seatAvailabillity = asianMoviesService.isSeatAvailable(theatreId,rowNo,colNo);
		if(seatAvailabillity==false) {
			result = false;
			return result;
		}
		else {
			
			
			
		}
		/////////
		///////////
		/////////
		///blaaa blaaa
		
		
		return result;
		
		
		
	}

}
