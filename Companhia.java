public class Companhia {
    private Voo[] vetVoo;
    private String nome;
    private String telefone;
    private String pais;
    private int qtdeVoos;

    public Companhia(){
        this.vetVoo = new Voo[10];
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }

    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String t){
        this.telefone = t;
    }

    public String getPais(){
        return this.pais;
    }
    public void setPais(String p){
        this.pais = p;
    }

    public int getQtdeVoos(){
		return this.qtdeVoos;
	}
	
	public void setQtdeVoos(int qt){
		this.qtdeVoos = qt;
	}

	public Voo getVoo(int pos){
		return this.vetVoo[pos];
	}
	
	public void setVoo(Voo t){
		this.setQtdeVoos(this.getQtdeVoos() + 1);
		int pos = this.getQtdeVoos() - 1;
		this.vetVoo[pos] = t;
	}
}


