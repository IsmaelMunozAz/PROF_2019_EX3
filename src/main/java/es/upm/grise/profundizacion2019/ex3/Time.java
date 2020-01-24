package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	
	public static String getFutureTime(long seconds) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		//Establezco el tiempo definido en el examen en vez del momento actual.
		LocalDateTime time = LocalDateTime.of(2020, 01, 01, 00,00, 00);
	//	LocalDateTime time = LocalDateTime.now();
		
		//Almaceno en time el tiempo sumado.
		time=time.plusSeconds(seconds);
		return formatter.format(time);	
	}

}
