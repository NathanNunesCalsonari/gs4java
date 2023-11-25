package br.com.fiap.previnatech.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.previnatech.model.Funcionario;

public class FuncionarioDao {

    public List<Funcionario> getAllFuncionarios() throws Exception {
        List<Funcionario> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM T_PVTC_FUNCIONARIO";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Funcionario funcionario = extractFuncionarioFromResultSet(resultSet);
                funcionarios.add(funcionario);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return funcionarios;
    }

    public Funcionario getFuncionarioById(Long id) throws Exception {
        String sql = "SELECT * FROM T_PVTC_FUNCIONARIO WHERE ID_FUNC = ?";
        Funcionario funcionario = null;

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                funcionario = extractFuncionarioFromResultSet(resultSet);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return funcionario;
    }

    public void addFuncionario(Funcionario funcionario) throws Exception {
        String sql = "INSERT INTO T_PVTC_FUNCIONARIO (ID_FUNC, ID_SUPERIOR, NM_FUNC, NR_CPF, NR_RG, DT_NASCIMENTO, " +
                "VL_SALARIO, DT_CADASTRO, NM_USUARIO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, funcionario.getIdFunc());
            preparedStatement.setLong(2, funcionario.getIdSuperior());
            preparedStatement.setString(3, funcionario.getNmFunc());
            preparedStatement.setString(4, funcionario.getNrCpf());
            preparedStatement.setString(5, funcionario.getNrRg());
            preparedStatement.setString(6, funcionario.getDtNascimento());
            preparedStatement.setDouble(7, funcionario.getVlSalario());
            preparedStatement.setString(8, funcionario.getDtCadastro());
            preparedStatement.setString(9, funcionario.getNmUsuario());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateFuncionario(Funcionario funcionario) throws Exception {
        String sql = "UPDATE T_PVTC_FUNCIONARIO SET ID_SUPERIOR=?, NM_FUNC=?, NR_CPF=?, NR_RG=?, " +
                "DT_NASCIMENTO=?, VL_SALARIO=?, DT_CADASTRO=?, NM_USUARIO=? WHERE ID_FUNC=?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, funcionario.getIdSuperior());
            preparedStatement.setString(2, funcionario.getNmFunc());
            preparedStatement.setString(3, funcionario.getNrCpf());
            preparedStatement.setString(4, funcionario.getNrRg());
            preparedStatement.setString(5, funcionario.getDtNascimento());
            preparedStatement.setDouble(6, funcionario.getVlSalario());
            preparedStatement.setString(7, funcionario.getDtCadastro());
            preparedStatement.setString(8, funcionario.getNmUsuario());
            preparedStatement.setLong(9, funcionario.getIdFunc());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteFuncionario(Long id) throws Exception {
        String sql = "DELETE FROM T_PVTC_FUNCIONARIO WHERE ID_FUNC=?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Funcionario extractFuncionarioFromResultSet(ResultSet resultSet) throws SQLException {
        Funcionario funcionario = new Funcionario(null, null, null, null, null, null, null, null, null);
        funcionario.setIdFunc(resultSet.getLong("ID_FUNC"));
        funcionario.setIdSuperior(resultSet.getLong("ID_SUPERIOR"));
        funcionario.setNmFunc(resultSet.getString("NM_FUNC"));
        funcionario.setNrCpf(resultSet.getString("NR_CPF"));
        funcionario.setNrRg(resultSet.getString("NR_RG"));
        funcionario.setDtNascimento(resultSet.getString("DT_NASCIMENTO"));
        funcionario.setVlSalario(resultSet.getDouble("VL_SALARIO"));
        funcionario.setDtCadastro(resultSet.getString("DT_CADASTRO"));
        funcionario.setNmUsuario(resultSet.getString("NM_USUARIO"));
        return funcionario;
    }
}
