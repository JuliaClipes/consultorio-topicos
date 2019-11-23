package trabalho2.topicos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultaDAO {

    private Connection conexao;

    public ConsultaDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void insere(Consulta consulta) throws SQLException {
        String sql = "INSERT INTO consulta(nome_paciente_consulta_banco, data_consulta_banco, recomendacoes_consulta_banco, medico_consulta_banco) values (?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, consulta.getNomePacienteConsulta());
        stmt.setString(2, consulta.getDataConsulta());
        stmt.setString(3, consulta.getRecomendacoesConsulta());
        stmt.setString(4, consulta.getMedicoConsulta());

        stmt.execute();
    }

    public ArrayList<Consulta>ListaConsulta(String paciente) throws SQLException {
        String sql = "SELECT * FROM consulta where nome_paciente_consulta_banco like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, paciente);
        ResultSet rs = stmt.executeQuery();

        ArrayList<Consulta>lista = new ArrayList<Consulta>();

        while (rs.next()) {
            Consulta consulta = new Consulta();
            consulta.setNomePacienteConsulta(rs.getString("nome_paciente_consulta_banco"));
            consulta.setDataConsulta(rs.getString("data_consulta_banco"));
            consulta.setRecomendacoesConsulta(rs.getString("recomendacoes_consulta_banco"));
            consulta.setMedicoConsulta(rs.getString("medico_consulta_banco"));

            lista.add(consulta);

        }
        rs.close();
        stmt.close();

        return lista;
    }

}
