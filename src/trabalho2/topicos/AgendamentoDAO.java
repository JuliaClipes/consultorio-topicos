package trabalho2.topicos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTextField;

public class AgendamentoDAO {

    private Connection conexao;

    public AgendamentoDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void insere(Agendamento agenda) throws SQLException {
        String sql = "INSERT INTO agendamento(datac_agendamento_banco, data_agendamento_banco, descricao_agendamento_banco, especialidade_agendamento_banco, cliente_agendamento_banco) values (?,?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, agenda.getDatacAgendamento());
        stmt.setString(2, agenda.getDataAgendamento());
        stmt.setString(3, agenda.getDescricaoAgendamento());
        stmt.setString(4, agenda.getEspecialidadeAgendamento());
        stmt.setString(5, agenda.getNomeClienteCC());

        stmt.execute();
    }

    public ArrayList<Agendamento> ListaAgendamento(String paciente) throws SQLException {
        String sql = "SELECT * FROM agendamento where datac_agendamento_banco like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, paciente);
        ResultSet rs = stmt.executeQuery();

        ArrayList<Agendamento> lista = new ArrayList<Agendamento>();

        while (rs.next()) {
            Agendamento agendamento = new Agendamento();

            agendamento.setDataAgendamento(rs.getString("data_agendamento_banco"));
            agendamento.setDatacAgendamento(rs.getString("datac_agendamento_banco"));
            agendamento.setDescricaoAgendamento(rs.getString("descricao_agendamento_banco"));
            agendamento.setEspecialidadeAgendamento(rs.getString("especialidade_agendamento_banco"));
            agendamento.setNomeClienteCC(rs.getString("cliente_agendamento_banco"));

            lista.add(agendamento);

        }
        rs.close();
        stmt.close();

        return lista;
    }

    public void exclui(String agendamento) throws SQLException {
        String sql = "DELETE from agendamento where datac_agendamento_banco = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, agendamento);

        stmt.execute();
        stmt.close();

    }
}
