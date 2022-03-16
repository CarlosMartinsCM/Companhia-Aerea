import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaCompanhia {
    private Companhia c1;
    private BufferedReader reader;    

    public static void main(String[] args) throws Exception{
        SistemaCompanhia sc = new SistemaCompanhia();
        sc.c1 = new Companhia();
        sc.reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Informe o nome da companhia: ");
        sc.c1.setNome(sc.reader.readLine());
        System.out.println("Informe o telefone da companhia aérea: ");
        sc.c1.setTelefone(sc.reader.readLine());
        sc.menu();
    }

    public void menu() throws Exception{
		String opcao = "";
		while(!opcao.equals("4")){
			System.out.println("\n-------------------------");
			System.out.println("[1] Cadastrar voo");
			System.out.println("[2] Listar voos existentes");
			System.out.println("[3] Listar passageiros voo");
			System.out.println("[4] Sair");
			opcao = this.reader.readLine();
			
			if(opcao.equals("1")){
                cadastrarVoo();
			}else if(opcao.equals("2")){
                listarVoos();
			}else if(opcao.equals("3")){
                consultarVoo();
			}else if(opcao.equals("4")){
				System.out.println("Encerrando...");
			}else {
				System.out.println("Opcao invalida...");
			}
		}
	}

    public void cadastrarVoo(){
		try{
			Voo voo = new Voo();
			System.out.println("Numero do voo:");
			String numVoo = this.reader.readLine();
			voo.setNumeroVoo(Integer.parseInt(numVoo));
			
			System.out.println("Local de embarque:");
			voo.setLocalEmbarque(this.reader.readLine());

            System.out.println("Local de desembarque:");
			voo.setLocalDesembarque(this.reader.readLine());
			
			System.out.println("\n---------Passageiros--------");
			for(int i=0; i<30; i++){
				System.out.println("\n-----------------");
				System.out.println("Informe o nome do passageiro:");
				String nomePassgeiro = this.reader.readLine();
				if(nomePassgeiro.equals("")){
					break;
				}
				Passageiro passageiro = new Passageiro();
				passageiro.setNome(nomePassgeiro);
				
				System.out.println("RG:");
				passageiro.setRG(this.reader.readLine());
				

                System.out.println("Telefone:");
				passageiro.setTelefone(this.reader.readLine());

                System.out.println("País de origem:");
				passageiro.setPaisDeOrigem(this.reader.readLine());

				voo.setPassageiro(i, passageiro);

			}
			this.c1.setVoo(voo);
		}catch(Exception c1){
			System.out.println("formato invalido...");
		}
	}

    public void listarVoos() throws Exception{
		System.out.println("------------------------");
		System.out.println("Relatorio de Voos");
		for(int i = 0; i < this.c1.getQtdeVoos(); i++){
			String linha = "Numero do voo: " + this.c1.getVoo(i).getNumeroVoo();
			
			System.out.print(linha);
			
			linha = " - Local de embarque: " + this.c1.getVoo(i).getLocalEmbarque();
			System.out.print(linha);
			
			linha = " - Local de desembarque: " + this.c1.getVoo(i).getLocalDesembarque();
			System.out.print(linha + "\n");
		}
	}

    public void consultarVoo(){
		try{
			System.out.println("------------------------");
			System.out.println("Consulta de Voos");
			System.out.println("Informe o numero do Voo: ");
			int numVoo = Integer.parseInt(this.reader.readLine());
			boolean achou = false;
			
			for(int i = 0; i < this.c1.getQtdeVoos(); i++){
				Voo t = this.c1.getVoo(i);
				if(t.getNumeroVoo() == numVoo){
					System.out.println("Passageiros no voo:");
					int pos = 0;
					while(t.getPassageiro(pos) != null){
						String linha = "Nome: " + t.getPassageiro(pos).getNome();
                        System.out.print(linha);

                        linha = "\nRG: " + t.getPassageiro(pos).getRG();
						System.out.print(linha);

                        linha = "\nTelefone: " + t.getPassageiro(pos).getTelefone();
						System.out.print(linha);

                        linha = "\nPaís de origem: " + t.getPassageiro(pos).getPaisDeOrigem();
						System.out.print(linha);

                        pos++;
					}
					achou = true;
					break;
				}
			}
			if(!achou){
				System.out.println("Voo encontrado");
			}
		}catch(Exception c1){
			System.out.println("formato invalido...");
		}
	}
}



