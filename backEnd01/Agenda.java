package backEnd01;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class Agenda{
public boolean agendar(String caminho ,String cpfCl ,String nomeMed, String cpfMed , String hora) {
	try {
	caminho = caminho + "Clientes.txt";
	FileReader fcrf = new FileReader(caminho);
	BufferedReader bcrf = new BufferedReader(fcrf);
	String camAg = caminho.replace("Clientes.txt", "Agenda.txt");
	FileWriter fcwf = new FileWriter(camAg,true);
	BufferedWriter bcwf = new BufferedWriter(fcwf);
	int cont = 0 ;
	while (bcrf.ready()) {
		   String line = bcrf.readLine();
		   String vet[] = line.split(":");
		    String nomeT = vet[1];
		    String idade = vet[3];
		    String planoSaude = vet[7];
		    String telefone = vet[9];
		    String endereço = vet[11];
		if (vet[5].equalsIgnoreCase(cpfCl)) {
		    bcwf.write("Nome:"+nomeT+":Idade:" +idade+ ":CPF:" + cpfCl + ":Plano:" +planoSaude 
			+":TEL:" +telefone+ ":Endereço:"+endereço+":Nome Medico:"+nomeMed+":CPF Medico:"+cpfMed+":HR:"+hora);
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
public boolean verAgendado(String caminho , String cpfCl) {
	caminho = caminho + "Agenda.txt";
	
	try {
		FileReader fra = new FileReader(caminho);
	    BufferedReader bra = new BufferedReader(fra);
	    int cont = 0;
		while (bra.ready()) {
			   String line = bra.readLine();
			   String vet[] = line.split(":");
			   if(vet[5].equalsIgnoreCase(cpfCl)) {
				   cont++;
				   }
			   }
		bra.close();
		fra.close();
		if(cont != 0 ) {
			return true;
		}
	} catch (Exception e) {
		System.err.println(e);
	}
	return false;
}
public void agendamento(String caminho , String cpfCl) {
	caminho = caminho + "Agenda.txt";
	try {
		FileReader fra = new FileReader(caminho);
	    BufferedReader bra = new BufferedReader(fra);
		while (bra.ready()) {
			   String line = bra.readLine();
			   String vet[] = line.split(":");
			   if(vet[5].equalsIgnoreCase(cpfCl)) {
				System.out.printf("Nome:%s,Idade:%s,CPF:%s,Plano:%s,Nome Medico:%s,Hora:%s:%s %n"
						,vet[1],vet[3],vet[5],vet[7],vet[13],vet[17],vet[18]);
				   }
			   }
		bra.close();
		fra.close();
		
	} catch (Exception e) {
		System.err.println(e);
	}
}
}
