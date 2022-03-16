public class Voo {
    private Passageiro[] vetPassageiro;
    private int numeroVoo;
    private String localEmbarque;
    private String localDesembarque;
    private int cont;

    public Voo(){
        this.vetPassageiro = new Passageiro[30];
    }

    public int getNumeroVoo(){
        return this.numeroVoo;
    }
    public void setNumeroVoo(int nv){
        this.numeroVoo = nv;
    }

    public String getLocalEmbarque(){
        return this.localEmbarque;
    }
    public void setLocalEmbarque(String le){
        this.localEmbarque = le;
    }

    public String getLocalDesembarque(){
        return this.localDesembarque;
    }
    public void setLocalDesembarque(String ld){
        this.localDesembarque = ld;
    }

    public Passageiro getPassageiro(int pos){
		return this.vetPassageiro[pos];
	}
	
	public void setPassageiro(int pos, Passageiro a){
		this.vetPassageiro[pos] = a;
	}


}
