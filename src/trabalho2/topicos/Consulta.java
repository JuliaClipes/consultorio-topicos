package trabalho2.topicos;

import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Consulta {
    private int id_consulta;
    private String nome_paciente_consulta;
    private String data_consulta;
    private String recomendacoes_consulta;

    public int getIdConsulta() {
        return id_consulta;
    }

    public void setIdConsulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public String getNomePacienteConsulta() {
        return nome_paciente_consulta;
    }

    public void setNomePacienteConsulta(String nome_paciente_consulta) {
        this.nome_paciente_consulta = nome_paciente_consulta;
    }

    public String getDataConsulta() {
        return data_consulta;
    }

    public void setDataConsulta(String data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getRecomendacoesConsulta() {
        return recomendacoes_consulta;
    }

    public void setRecomendacoesConsulta(String recomendacoes_consulta) {
        this.recomendacoes_consulta = recomendacoes_consulta;
    }

    void setNomePacienteConsulta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNomePacienteConsulta(JTextField jTFNomePConsulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDataConsulta(JTextField jTFDataConsulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRecomendacoesConsulta(JTextArea jTFRecomendacoesConsulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
