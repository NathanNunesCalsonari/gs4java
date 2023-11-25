package br.com.fiap.previnatech.service;

import java.util.List;

import br.com.fiap.previnatech.model.Funcionario;
import br.com.fiap.previnatech.data.FuncionarioDao;

public class FuncionarioService {

    private FuncionarioDao funcionarioDao = new FuncionarioDao();

    public List<Funcionario> getAllFuncionarios() throws Exception {
        return funcionarioDao.getAllFuncionarios();
    }

    public Funcionario getFuncionarioById(Long id) throws Exception {
        return funcionarioDao.getFuncionarioById(id);
    }

    public void addFuncionario(Funcionario funcionario) throws Exception {
        funcionarioDao.addFuncionario(funcionario);
    }

    public void updateFuncionario(Funcionario funcionario) throws Exception {
        funcionarioDao.updateFuncionario(funcionario);
    }

    public void deleteFuncionario(Long id) throws Exception {
        funcionarioDao.deleteFuncionario(id);
    }
}
