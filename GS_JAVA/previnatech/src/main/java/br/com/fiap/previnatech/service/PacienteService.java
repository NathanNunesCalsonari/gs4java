package br.com.fiap.previnatech.service;

import java.util.ArrayList;

import br.com.fiap.previnatech.data.PacienteDao;
import br.com.fiap.previnatech.model.Paciente;

import java.util.List;

public class PacienteService {

    private PacienteDao pacienteDao = new PacienteDao();

    public List<Paciente> getAllPacientes() throws Exception {
        return pacienteDao.getAllPacientes();
    }

    public Paciente getPacienteById(Long id) throws Exception {
        return pacienteDao.getPacienteById(id);
    }

    public void addPaciente(Paciente paciente) throws Exception {
        pacienteDao.addPaciente(paciente);
    }

    public void updatePaciente(Paciente paciente) throws Exception {
        pacienteDao.updatePaciente(paciente);
    }

    public void deletePaciente(Long id) throws Exception {
        pacienteDao.deletePaciente(id);
    }
}

