package br.com.fiap.previnatech.service;

import java.util.List;
import br.com.fiap.previnatech.model.Hospital;
import br.com.fiap.previnatech.data.HospitalDao;

public class HospitalService {

    private HospitalDao hospitalDao = new HospitalDao();

    public List<Hospital> getAllUnidadesHospitalares() throws Exception {
        return hospitalDao.getAllUnidadesHospitalares();
    }

    public Hospital getUnidadeHospitalarById(Long id) throws Exception {
        return hospitalDao.getUnidadeHospitalarById(id);
    }

    public void addUnidadeHospitalar(Hospital hospital) throws Exception {
    	hospitalDao.addUnidadeHospitalar(hospital);
    }

    public void updateUnidadeHospitalar(Hospital hospital) throws Exception {
    	hospitalDao.updateUnidadeHospitalar(hospital);
    }

    public void deleteUnidadeHospitalar(Long id) throws Exception {
    	hospitalDao.deleteUnidadeHospitalar(id);
    }
}
