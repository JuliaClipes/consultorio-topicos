package trabalho2.topicos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {

    private Connection conexao;

    public ClienteDAO() throws SQLException{
	this.conexao = Conexao.getConexao();
}
    
    public void insere(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente(nome_cliente_banco, telefone_cliente_banco, endereco_cliente_banco, cpf_cliente_banco) values (?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getTelefoneCliente());
            stmt.setString(3, cliente.getEnderecoCliente());
            stmt.setString(4, cliente.getCpfCliente());
            
            stmt.execute();
        }
    public void imprime(Cliente cliente) throws SQLException {
        String sql = "SELECT * FROM cliente";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
            stmt.execute();
        }

    

}
