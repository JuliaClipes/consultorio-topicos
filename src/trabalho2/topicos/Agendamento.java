package trabalho2.topicos;

import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Agendamento {
    private int id_agendamento;
    private String data_agendamento;
    private String datac_agendamento;
    private String descricao_agendamento;
    private String nome_cliente_a;
    private String especialidade_agendamento;
    

    public int getIdAgendamento() {
        return id_agendamento;
    }
    public String getNomeClienteCC() {
        return nome_cliente_a;
    }

    public void setIdAgendamento(int id_agendamento) {
        this.id_agendamento = id_agendamento;
    }
    public void setNomeClienteCC(String nome_cliente_a) {
        this.nome_cliente_a = nome_cliente_a;
    }

    public String getDescricaoAgendamento() {
        return descricao_agendamento;
    }

    public void setDescricaoAgendamento(String descricao_agendamento) {
        this.descricao_agendamento = descricao_agendamento;
    }

    public String getDataAgendamento() {
        return data_agendamento;
    }

    public void setDataAgendamento(String data_agendamento) {
        this.data_agendamento = data_agendamento;
    }

    public String getDatacAgendamento() {
        return datac_agendamento;
    }

    public void setDatacAgendamento(String datac_agendamento) {
        this.datac_agendamento = datac_agendamento;
    }

    public String getEspecialidadeAgendamento() {
        return especialidade_agendamento;
    }

    public void setEspecialidadeAgendamento(String especialidade_agendamento) {
        this.especialidade_agendamento = especialidade_agendamento;
    }

    Object get(int selectedRow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}

