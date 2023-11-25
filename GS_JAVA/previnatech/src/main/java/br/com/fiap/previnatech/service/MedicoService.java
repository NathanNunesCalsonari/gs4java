package br.com.fiap.previnatech.service;

import java.util.List;

import br.com.fiap.previnatech.model.Medico;
import br.com.fiap.previnatech.data.MedicoDao;

public class MedicoService {

    private MedicoDao medicoDao = new MedicoDao();

    public List<Medico> getAllMedicos() {
        return medicoDao.getAllMedicos();
    }

    public Medico getMedicoById(Long id) {
        return medicoDao.getMedicoById(id);
    }

}
