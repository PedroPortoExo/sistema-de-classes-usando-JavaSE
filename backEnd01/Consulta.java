package backEnd01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Consulta {
	public boolean consultar(String caminho ,String cpfCl ,String valor) {
		try {
		caminho = caminho + "Agenda.txt";
		FileReader fcrf = new FileReader(caminho);
		BufferedReader bcrf = new BufferedReader(fcrf);
		String camCons = caminho.replace("Agenda.txt", "Consultas.txt");
		FileWriter fcwf = new FileWriter(camCons,true);
		BufferedWriter bcwf = new BufferedWriter(fcwf);
		int cont = 0 ;
		while (bcrf.ready()) {
			   String line = bcrf.readLine();
			   String vet[] = line.split(":");
			    if (vet[5].equalsIgnoreCase(cpfCl)) {
				String nomeT = vet[1];
			    String idade = vet[3];
			    String planoSaude = vet[7];
			    String telefone = vet[9];
			    String endere�o = vet[11];
			    String nomeMed = vet[13];
			    String cpfMed = vet[15];
			    String hora = vet[17]+":"+vet[18];
			    bcwf.write("Nome:"+nomeT+":Idade:" +idade+ ":CPF:" + cpfCl + ":Plano:" +planoSaude 
				+":TEL:" +telefone+ ":Endere�o:"+endere�o+":Nome Medico:"+nomeMed+":CPF Medico:"+cpfMed+":HR:"+hora+":R$:"+valor+":N�o Pago");
				bcwf.newLine();	
				cont++;
			}
			    
		}
		bcwf.close();
		fcwf.close();
		bcrf.close();
		fcrf.close();
		if(cont != 0) {
			return true;
		}	
		}
		
	 catch(Exception e) {
		 System.err.println(e);
	}
	return false;
	}

}
