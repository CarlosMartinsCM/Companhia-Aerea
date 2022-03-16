public class Passageiro {
    private String nome;
    private String RG;
    private String telefone;
    private String paisDeOrigem;

    public String getNome(){
		return this.nome;
	}
	public void setNome(String n){
		this.nome = n;
	}

    public String getRG(){
        return this.RG;
    }
    public void setRG(String rg){
        this.RG = rg; 
    }

    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String tl){
        this.telefone = tl;
    }

    public String getPaisDeOrigem(){
        return this.paisDeOrigem;
    }
    public void setPaisDeOrigem(String p_o){
        this.paisDeOrigem = p_o;
    }

}
