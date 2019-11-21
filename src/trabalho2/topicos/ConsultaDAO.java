package trabalho2.topicos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultaDAO {

    private Connection conexao;

    public ConsultaDAO() throws SQLException{
	this.conexao = Conexao.getConexao();
}
    
    public void insere(Consulta consulta) throws SQLException {
        String sql = "INSERT INTO consulta(nome_paciente_consulta_banco, data_consulta_banco, recomendacoes_consulta_banco) values (?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, consulta.getNomePacienteConsulta());
            stmt.setString(2, consulta.getDataConsulta());
            stmt.setString(3, consulta.getRecomendacoesConsulta());
            
            stmt.execute();
        }

    

}
