package br.com.michele;

import br.com.michele.dao.ContratoDao;
import br.com.michele.dao.IContratoDao;
import br.com.michele.dao.mocks.ContratoDaoMock;
import br.com.michele.service.ContratoService;
import br.com.michele.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author michele.codes
 */
public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}