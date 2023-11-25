package br.com.fiap.previnatech.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.previnatech.model.Medico;

public class MedicoDao {

    public List<Medico> getAllMedicos() {
        List<Medico> medicos = new ArrayList<>();
        String sql = "SELECT * FROM T_PVTC_MEDICO";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Medico medico = extractMedicoFromResultSet(resultSet);
                medicos.add(medico);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return medicos;
    }

    public Medico getMedicoById(Long id) {
        String sql = "SELECT * FROM T_PVTC_MEDICO WHERE ID_FUNC = ?";
        Medico medico = null;

        try (Connection connection = ConnectionFactory.getConnection();
        	    PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        	    preparedStatement.setLong(1, id);
        	    ResultSet resultSet = preparedStatement.executeQuery();

        	    if (resultSet.next()) {
        	        medico = extractMedicoFromResultSet(resultSet);
        	    } else {
        	        System.out.println("Nenhum médico encontrado com o ID: " + id);
        	    }

        	} catch (SQLException e) {
        	    e.printStackTrace();
        	} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        return medico;
    }

    private Medico extractMedicoFromResultSet(ResultSet resultSet) throws SQLException {
        Medico medico = new Medico(null, 0, null, null, null, null);
        medico.setIdFunc(resultSet.getLong("ID_FUNC"));
        medico.setCrm(resultSet.getInt("NR_CRM"));
        medico.setEspecialidade(resultSet.getString("DS_ESPECIALIDADE"));
        medico.setDataCadastro(resultSet.getString("DT_CADASTRO"));
        medico.setNmUsuario(resultSet.getString("NM_USUARIO"));
        return medico;
    }
}

