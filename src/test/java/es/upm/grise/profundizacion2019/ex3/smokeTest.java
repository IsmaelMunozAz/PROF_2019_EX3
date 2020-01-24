package es.upm.grise.profundizacion2019.ex3;


import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class smokeTest {
	

	//Creo el mock de time
	@Mock
	Time time;
	
	//Utilizo @InjectMocks para permitir mocks and spy injection.
	@InjectMocks
	MyClass my;
	
	
	//Añado el time mock en el @Before.
	@Before
	public void setUp() {
		my = new MyClass(time);
	}

//	@Test
//	public void smoleTest() {
//		long SECONDS = 60;
//		my.nextTime(SECONDS);
//	}
	
	//Creo el primer test y lo modifico para no tener datos mockeados y
	//que salga el resultado
	@Test
	public void testFechaActual() {
		Time timeNotMock=new Time();
		MyClass myNotMock=new MyClass(timeNotMock);
		long SECONDS = 0;
		myNotMock.nextTime(SECONDS);
	}
	
	//Creo el segundo test y lo modifico para no tener datos mockeados y
	//que salga el resultado
	@Test
	public void testFecha120seg() {
		Time timeNotMock=new Time();
		MyClass myNotMock=new MyClass(timeNotMock);
		long SECONDS = 120;
		myNotMock.nextTime(SECONDS);
	}
	
	
	//Creo el test
	@Test
	public void testMockOneTimegetFuture() {
		long second=120;
		when(time.getFutureTime(120)).thenReturn("2020/01/01 00:02:00");
		my.nextTime(second);
		verify(time, times(1)).getFutureTime(second);
		}
	

}
