package br.com.fiap.previnatech.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.previnatech.model.Hospital;

public class HospitalDao {

    public List<Hospital> getAllUnidadesHospitalares() throws Exception {
        List<Hospital> unidadesHospitalares = new ArrayList<>();
        String sql = "SELECT * FROM T_PVTC_UNID_HOSPITALAR";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
            	Hospital unidadeHospitalar = extractUnidadeHospitalarFromResultSet(resultSet);
                unidadesHospitalares.add(unidadeHospitalar);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return unidadesHospitalares;
    }

    public Hospital getUnidadeHospitalarById(Long id) throws Exception {
        String sql = "SELECT * FROM T_PVTC_UNID_HOSPITALAR WHERE ID_UNID_HOSPITALAR = ?";
        Hospital unidadeHospitalar = null;

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                unidadeHospitalar = extractUnidadeHospitalarFromResultSet(resultSet);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return unidadeHospitalar;
    }

    public void addUnidadeHospitalar(Hospital hospital) throws Exception {
        String sql = "INSERT INTO T_PVTC_UNID_HOSPITALAR (ID_UNID_HOSPITALAR, NM_UNID_HOSPITALAR, DT_FUNDACAO, " +
                "DS_ESPECIALIDADE_HOSP, DT_CADASTRO, NM_USUARIO) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, hospital.getIdHospital());
            preparedStatement.setString(2, hospital.getNomeHospital());
            preparedStatement.setString(3, hospital.getDataFundacao());
            preparedStatement.setString(4, hospital.getEspecialidade());
            preparedStatement.setString(5, hospital.getDtCadastro());
            preparedStatement.setString(6, hospital.getNmUsuario());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUnidadeHospitalar(Hospital hospital) throws Exception {
        String sql = "UPDATE T_PVTC_UNID_HOSPITALAR SET NM_UNID_HOSPITALAR=?, DT_FUNDACAO=?, " +
                "DS_ESPECIALIDADE_HOSP=?, DT_CADASTRO=?, NM_USUARIO=? WHERE ID_UNID_HOSPITALAR=?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, hospital.getNomeHospital());
            preparedStatement.setString(2, hospital.getDataFundacao());
            preparedStatement.setString(3, hospital.getEspecialidade());
            preparedStatement.setString(4, hospital.getDtCadastro());
            preparedStatement.setString(5, hospital.getNmUsuario());
            preparedStatement.setLong(6, hospital.getIdHospital());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void deleteUnidadeHospitalar(Long id) throws Exception {
        String sql = "DELETE FROM T_PVTC_UNID_HOSPITALAR WHERE ID_UNID_HOSPITALAR=?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Hospital extractUnidadeHospitalarFromResultSet(ResultSet resultSet) throws SQLException {
    	Hospital unidadeHospitalar = new Hospital(null, null, null, null, null, null);
        unidadeHospitalar.setIdHospital(resultSet.getLong("ID_UNID_HOSPITALAR"));
        unidadeHospitalar.setNomeHospital(resultSet.getString("NM_UNID_HOSPITALAR"));
        unidadeHospitalar.setDataFundacao(resultSet.getString("DT_FUNDACAO"));
        unidadeHospitalar.setEspecialidade(resultSet.getString("DS_ESPECIALIDADE_HOSP"));
        unidadeHospitalar.setDtCadastro(resultSet.getString("DT_CADASTRO"));
        unidadeHospitalar.setNmUsuario(resultSet.getString("NM_USUARIO"));
        return unidadeHospitalar;
    }
}
