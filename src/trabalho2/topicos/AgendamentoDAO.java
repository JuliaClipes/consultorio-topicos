package trabalho2.topicos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
 public boolean lista_consulta(String nome) throws SQLException{
	String sql = "Select * from agendamento where  nome= ?";
	PreparedStatement stmt = Conexao.getConexao().prepareStatement(sql);
        stmt.setString(1, nome);
	ResultSet retorno = stmt.executeQuery();
	
        boolean teste = false;
                
	while(retorno.next()){
            
                System.out.println("Informacoes da Consulta:");
		System.out.println("Data do agendamento:"+retorno.getString("data_agendamento_banco"));
                System.out.println("Data da consulta:"+retorno.getString("datac_agendamento_banco"));
		System.out.println("Descricao:"+retorno.getString("descricao_agendamento_banco"));
                System.out.println("Especialidade:"+retorno.getString("especialidade_agendamento_banco"));
                System.out.println("Exame:"+retorno.getString("endereco"));
                
                return teste = true;
        }
         return teste;
         }
    

}
