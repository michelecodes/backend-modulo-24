package br.com.michele;

import br.com.michele.dao.ClienteDao;
import br.com.michele.dao.ClienteDaoMock;
import br.com.michele.dao.IClienteDao;
import br.com.michele.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author michele.codes
 */
public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
