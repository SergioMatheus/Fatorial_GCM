package fatorial;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MockFatorial {

	@Mock
	private Fatorial fatorial;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void fatorialImprime() {
		Mockito.doNothing().when(fatorial).imprime();
		fatorial.imprime();

		Mockito.verify(fatorial).imprime();
	}

	@Test
	public void fatorialCalcula() {
		Mockito.when(fatorial.fatorial(1L)).thenReturn(1L);

		fatorial.fatorial(1L);

		Mockito.verify(fatorial).fatorial(1L);
	}

}
