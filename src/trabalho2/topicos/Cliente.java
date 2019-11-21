package trabalho2.topicos;
import javax.swing.JTextField;


public class Cliente {
    private int id_cliente;
    private String nome_cliente;
    private String telefone_cliente;
    private String endereco_cliente;
    private String cpf_cliente;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setIdCliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNomeCliente() {
        return nome_cliente;
    }

    public void setNomeCliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getTelefoneCliente() {
        return telefone_cliente;
    }

    public void setTelefoneCliente(String telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }

    public String getEnderecoCliente() {
        return endereco_cliente;
    }

    public void setEnderecoCliente(String endereco_cliente) {
        this.endereco_cliente = endereco_cliente;
    }

    public String getCpfCliente() {
        return cpf_cliente;
    }

    public void setCpfCliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    void setNomeCliente(JTextField jTFNomeNovoCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTelefoneCliente(JTextField jTFTelefoneNovoCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCpfCliente(JTextField jTFCpfNovoCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}


