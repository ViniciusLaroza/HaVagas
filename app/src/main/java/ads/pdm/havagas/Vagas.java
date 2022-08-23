package ads.pdm.havagas;

public class Vagas {

    public Vagas(String nomeCompleto, String email, boolean receberEmail, String telefone, String tipoTell, boolean possuiCell, String cell, String sexo, String date, String formacao, String anoFormacao, String anoConclusao, String instituicao, String titulo, String orienteador, String vagasInteresse) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.receberEmail = receberEmail;
        this.telefone = telefone;
        this.tipoTell = tipoTell;
        this.possuiCell = possuiCell;
        this.cell = cell;
        this.sexo = sexo;
        this.date = date;
        this.formacao = formacao;
        this.anoFormacao = anoFormacao;
        this.anoConclusao = anoConclusao;
        this.instituicao = instituicao;
        this.titulo = titulo;
        this.orienteador = orienteador;
        this.vagasInteresse = vagasInteresse;
    }



    public Vagas(){

    }

    public String getFormacao() { return formacao; }

    public void setFormacao(String formacao) { this.formacao = formacao; }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isReceberEmail() {
        return receberEmail;
    }

    public void setReceberEmail(boolean receberEmail) {
        this.receberEmail = receberEmail;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoTell() {
        return tipoTell;
    }

    public void setTipoTell(String tipoTell) {
        this.tipoTell = tipoTell;
    }

    public boolean isPossuiCell() {
        return possuiCell;
    }

    public void setPossuiCell(boolean possuiCell) {
        this.possuiCell = possuiCell;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVagasInteresse() {
        return vagasInteresse;
    }

    public void setVagasInteresse(String vagasInteresse) {
        this.vagasInteresse = vagasInteresse;
    }


    public String getAnoFormacao() {
        return anoFormacao;
    }

    public void setAnoFormacao(String anoFormacao) {
        this.anoFormacao = anoFormacao;
    }

    public String getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(String anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOrienteador() {
        return orienteador;
    }

    public void setOrienteador(String orienteador) {
        this.orienteador = orienteador;
    }


    private String nomeCompleto;
    private String email;
    private boolean receberEmail;
    private String telefone;
    private String tipoTell;
    private boolean possuiCell;
    private String cell;
    private String sexo;
    private String date;
    private String formacao;
    private String anoFormacao;
    private String anoConclusao;
    private String instituicao;
    private String titulo;
    private String orienteador;
    private String vagasInteresse;

    @Override
    public String toString() {
        return "Vagas{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", receberEmail=" + receberEmail +
                ", telefone='" + telefone + '\'' +
                ", tipoTell='" + tipoTell + '\'' +
                ", possuiCell=" + possuiCell +
                ", cell='" + cell + '\'' +
                ", sexo='" + sexo + '\'' +
                ", date='" + date + '\'' +
                ", formacao='" + formacao + '\'' +
                ", anoFormacao='" + anoFormacao + '\'' +
                ", anoConclusao='" + anoConclusao + '\'' +
                ", instituicao='" + instituicao + '\'' +
                ", titulo='" + titulo + '\'' +
                ", orienteador='" + orienteador + '\'' +
                ", vagasInteresse='" + vagasInteresse + '\'' +
                '}';
    }
}
