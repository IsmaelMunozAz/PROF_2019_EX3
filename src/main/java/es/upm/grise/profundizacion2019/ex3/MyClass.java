package es.upm.grise.profundizacion2019.ex3;

public class MyClass {
	
	private Time time=new Time();
	
	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	
	public void nextTime(long seconds) {
		//Creo una instancia para llamar a getFuture.
	//	String next = Time.getFutureTime(seconds);
		String next=time.getFutureTime(seconds);
		System.out.println(next);
	}

}
