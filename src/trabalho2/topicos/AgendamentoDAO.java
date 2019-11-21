package trabalho2.topicos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgendamentoDAO {

    private Connection conexao;

    public AgendamentoDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void insere(Agendamento agenda) throws SQLException {
        String sql = "INSERT INTO agendamento(datac_agendamento_banco, data_agendamento_banco, descricao_agendamento_banco, especialidade_agendamento_banco) values (?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, agenda.getDatacAgendamento());
        stmt.setString(2, agenda.getDataAgendamento());
        stmt.setString(3, agenda.getDescricaoAgendamento());
        stmt.setString(4, agenda.getEspecialidadeAgendamento());

        stmt.execute();
    }

    public List<Agendamento> getListaAgendamento() throws SQLException {
        String sql = "SELECT * FROM agendamento";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet resultado_agendamento = stmt.executeQuery();

        List<Agendamento> ListaAgendamento = new ArrayList<Agendamento>();

        while (resultado_agendamento.next()) {
       
            Agendamento agenda = new Agendamento();
            agenda.setDataAgendamento(resultado_agendamento.getString("data_agendamento_banco"));
            agenda.setDatacAgendamento(resultado_agendamento.getString("datac_agendamento_banco"));
            agenda.setDescricaoAgendamento(resultado_agendamento.getString("descricao_agendamento_banco"));
            agenda.setEspecialidadeAgendamento(resultado_agendamento.getString("especialidade_agendamento_banco"));
            
            ListaAgendamento.add(agenda);
        }
        resultado_agendamento.close();
        stmt.close();
        
        return (List<Agendamento>) resultado_agendamento;
        
    }

}
