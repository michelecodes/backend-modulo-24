package br.com.michele;

import org.junit.Assert;
import org.junit.Test;

import br.com.michele;.TesteCliente;

public class TesteClienteTest {

	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Michele");
		cli.adicionarNome1("Michele");

		Assert.assertEquals("Michele", cli.getNome());
	}
}
