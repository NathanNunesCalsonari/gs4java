package br.com.fiap.previnatech.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.previnatech.model.Paciente;

public class PacienteDao {

    public List<Paciente> getAllPacientes() throws Exception {
        List<Paciente> pacientes = new ArrayList<>();
        String sql = "SELECT * FROM T_PVTC_PACIENTE";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Paciente paciente = extractPacienteFromResultSet(resultSet);
                pacientes.add(paciente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pacientes;
    }

    public Paciente getPacienteById(Long id) throws Exception {
        String sql = "SELECT * FROM T_PVTC_PACIENTE WHERE ID_PACIENTE = ?";
        Paciente paciente = null;

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                paciente = extractPacienteFromResultSet(resultSet);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return paciente;
    }

    public void addPaciente(Paciente paciente) throws Exception {
        String sql = "INSERT INTO T_PVTC_PACIENTE (ID_PACIENTE, NM_PACIENTE, NR_CPF, NR_RG, DT_NASCIMENTO, FL_SEXO_BIOLOGICO, " +
                "DS_TIPO_SANGUINEO, NR_ALTURA, NR_PESO, DT_CADASTRO, NM_USUARIO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, paciente.getIdPaciente());
            preparedStatement.setString(2, paciente.getNomePaciente());
            preparedStatement.setString(3, paciente.getCpfPaciente());
            preparedStatement.setString(4, paciente.getRgPaciente());
            preparedStatement.setString(5, paciente.getDataNascimento());
            preparedStatement.setString(6, paciente.getSexoBiologico());
            preparedStatement.setString(7, paciente.getTipoSanguineo());
            preparedStatement.setDouble(8, paciente.getAlturaPaciente());
            preparedStatement.setDouble(9, paciente.getPesoPaciente());
            preparedStatement.setString(10, paciente.getDtCadastro());
            preparedStatement.setString(11, paciente.getNmUsuario());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePaciente(Paciente paciente) throws Exception {
        String sql = "UPDATE T_PVTC_PACIENTE SET NM_PACIENTE=?, NR_CPF=?, NR_RG=?, DT_NASCIMENTO=?, " +
                "FL_SEXO_BIOLOGICO=?, DS_TIPO_SANGUINEO=?, NR_ALTURA=?, NR_PESO=?, DT_CADASTRO=?, NM_USUARIO=? " +
                "WHERE ID_PACIENTE=?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, paciente.getNomePaciente());
            preparedStatement.setString(2, paciente.getCpfPaciente());
            preparedStatement.setString(3, paciente.getRgPaciente());
            preparedStatement.setString(4, paciente.getDataNascimento());
            preparedStatement.setString(5, paciente.getSexoBiologico());
            preparedStatement.setString(6, paciente.getTipoSanguineo());
            preparedStatement.setDouble(7, paciente.getAlturaPaciente());
            preparedStatement.setDouble(8, paciente.getPesoPaciente());
            preparedStatement.setString(9, paciente.getDtCadastro());
            preparedStatement.setString(10, paciente.getNmUsuario());
            preparedStatement.setLong(11, paciente.getIdPaciente());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePaciente(Long id) throws Exception {
        String sql = "DELETE FROM T_PVTC_PACIENTE WHERE ID_PACIENTE=?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Paciente extractPacienteFromResultSet(ResultSet resultSet) throws SQLException {
        Paciente paciente = new Paciente(null, null, null, null, null, null, null, null, null, null, null);
        paciente.setIdPaciente(resultSet.getLong("ID_PACIENTE"));
        paciente.setNomePaciente(resultSet.getString("NM_PACIENTE"));
        paciente.setCpfPaciente(resultSet.getString("NR_CPF"));
        paciente.setRgPaciente(resultSet.getString("NR_RG"));
        paciente.setDataNascimento(resultSet.getString("DT_NASCIMENTO"));
        paciente.setSexoBiologico(resultSet.getString("FL_SEXO_BIOLOGICO"));
        paciente.setTipoSanguineo(resultSet.getString("DS_TIPO_SANGUINEO"));
        paciente.setAlturaPaciente(resultSet.getDouble("NR_ALTURA"));
        paciente.setPesoPaciente(resultSet.getDouble("NR_PESO"));
        paciente.setDtCadastro(resultSet.getString("DT_CADASTRO"));
        paciente.setNmUsuario(resultSet.getString("NM_USUARIO"));
        return paciente;
    }
}
