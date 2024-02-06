package br.com.michele.service;

import br.com.michele.dao.ClienteDao;
import br.com.michele.dao.ClienteDaoMock;
import br.com.michele.dao.IClienteDao;

/**
 * @author michele.codes
 */
public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}