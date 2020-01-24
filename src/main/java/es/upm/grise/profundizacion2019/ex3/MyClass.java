package es.upm.grise.profundizacion2019.ex3;

public class MyClass {
	
	
	//Modifico de private a protected
	protected static Time time=new Time();
	
	//Lo meto en el constructor
	public MyClass(Time time) {
		// TODO Auto-generated constructor stub
		this.time=time;
	}
	
	//Creo un constructor vacio
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
