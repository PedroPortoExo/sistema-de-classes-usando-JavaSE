package backEnd01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Gerente extends Funcionarios{

public Gerente() {
	super();
}

public void transferirDados(String caminho,String origem,String destino) {
	origem = caminho + origem+".txt";
	try {
		FileReader fccr1 = new FileReader(origem);
		BufferedReader bccr1 = new BufferedReader(fccr1);
		FileWriter fccw1 = new FileWriter(destino);
		BufferedWriter bccw1 = new BufferedWriter(fccw1);
		while (bccr1.ready()) {
			String linee = bccr1.readLine();
			bccw1.write(linee);
			bccw1.newLine();
		}
		bccw1.close();
		fccw1.close();
		bccr1.close();
		fccr1.close();
	} catch (Exception e) {
		System.out.println(e);
	}
}

public void relatorioFuncionarios(String caminho) {
	caminho = caminho + "Funcionarios.txt";
	try {
		BufferedReader bccr = new BufferedReader(new FileReader(caminho));
		String line;
		while (bccr.ready()) {
			line = bccr.readLine();
			String vet[] = line.split(":");
			line.trim();
			System.out.printf("Nome:%s,Idade:%s,CPF:%s,Plano:%s,Tel:%s,Endereço:%s,"
			+"Receita:%s,Profissão:%s,Hora:%s %n",vet[1],vet[3],vet[5],vet[7],vet[9],vet[11],vet[13],vet[15],vet[17]+":"+vet[18]);
		}
		bccr.close();
		System.out.println("\nFim do relatorio.");		
	} catch (Exception e) {
		System.err.println(e);
	}
}
public void relatorioClientes(String caminho) {
	caminho = caminho + "Clientes.txt";
	try {
		BufferedReader bccr = new BufferedReader(new FileReader(caminho));
		String line;
		while (bccr.ready()) {
			line = bccr.readLine();
			String vet[] = line.split(":");
			System.out.printf("Nome:%s,Idade:%s,CPF:%s,Plano:%s,Tel:%s,Endereço:%s,"
			+"Despeza:%s,Prescrição:%s %n",vet[1],vet[3],vet[5],vet[7],vet[9],vet[11],vet[13],vet[15]);	
		}
		System.out.println("\nFim do relatorio.\n");
		bccr.close();
	} catch (Exception e) {
		System.out.println(e);
	}
}

public boolean demitirFunc(String caminho,int cpf) {
	caminho = caminho + "Funcionarios.txt";
	try {
		FileReader fcr = new FileReader(caminho);
		BufferedReader bcr = new BufferedReader(fcr);
		String temp = caminho.replace(".txt", "temp.txt");
		FileWriter fcw = new FileWriter(temp);
		BufferedWriter bcw = new BufferedWriter(fcw);
		int cont = 0;
		while (bcr.ready()) {
			String line = bcr.readLine();
			String vet[] = line.split(":");
			int loc = Integer.parseInt(vet[5]);
			if (loc == cpf) {
				cont++;
			} else {
				bcw.write(line);
				bcw.newLine();
			}
		}
		bcw.close();
		fcw.close();
		bcr.close();
		fcr.close();
		if (cont == 1) {
			transferir(temp, caminho);
			return true;
		}
	} catch (Exception e) {
		System.err.println(e);
	}
 return false;
}
public boolean mudarHora(String caminho,String cpf,String hora) {
	caminho = caminho + "Funcionarios.txt";
	 try {
			FileReader fcr = new FileReader(caminho);
			BufferedReader bcr = new BufferedReader(fcr);
			String temp = caminho.replace(".txt", "temp.txt");
			FileWriter fcw = new FileWriter(temp);
			BufferedWriter bcw = new BufferedWriter(fcw);
			int cont = 0;
			while (bcr.ready()) {
				String line = bcr.readLine();
				String vet[] = line.split(":");
				if (vet[5].equalsIgnoreCase(cpf)) {
					String horario = vet [17]+":"+vet[18];
					horario = line.replace(horario, hora);
					bcw.write(horario);
					bcw.newLine();
					cont++;
				} else {
					bcw.write(line);
					bcw.newLine();
				}
			}
			bcw.close();
			fcw.close();
			bcr.close();
			fcr.close();
			if (cont == 1) {
				transferir(temp, caminho);
				return true;
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	 return false;
}
public void transferir(String origem, String caminho) {
	try {
		FileReader fccr1 = new FileReader(origem);
		BufferedReader bccr1 = new BufferedReader(fccr1);
		FileWriter fccw1 = new FileWriter(caminho);
		BufferedWriter bccw1 = new BufferedWriter(fccw1);
		while (bccr1.ready()) {
			String linee = bccr1.readLine();
			bccw1.write(linee);
			bccw1.newLine();
		}
		bccw1.close();
		fccw1.close();
		bccr1.close();
		fccr1.close();
	} catch (Exception e) {
		System.out.println(e);
	}
}
public boolean depositMed(String caminho , String cpf , double pix) {
	try {
		String caminhoF = caminho + "Funcionarios.txt";
		FileReader fcrf = new FileReader(caminhoF);
		BufferedReader bcrf = new BufferedReader(fcrf);
		String tempF = caminhoF.replace(".txt", "temp.txt");
		FileWriter fcwf = new FileWriter(tempF);
		BufferedWriter bcwf = new BufferedWriter(fcwf);
		int cont = 0 ;
		while (bcrf.ready()) {
			String line = bcrf.readLine();
			String vet[] = line.split(":");			
			if (vet[5].equalsIgnoreCase(cpf)) {
				String nomeT = vet[1];
			    String idade = vet[3];
			    cpf = vet[5];
			    String planoSaude = vet[7];
			    String telefone = vet[9];
			    String endereço = vet[11];
				double receita = Double.parseDouble(vet[13]);
				String horario = vet[17]+":"+vet[18];
			    receita = receita + pix;
			    bcwf.write("Nome:"+nomeT+":Idade:" +idade+ ":CPF:" + cpf + ":Plano:" +planoSaude 
				+":TEL:" +telefone+ ":Endereço:"+endereço+":R$:"+receita+":Prof:Medico"+":HR:"+horario);
				bcwf.newLine();	
				cont++;
			} else {
				bcwf.write(line);
				bcwf.newLine();
			}
		}
		bcwf.close();
		fcwf.close();
		bcrf.close();
		fcrf.close();
		if(cont != 0) {
			transferir(tempF, caminhoF);
			return true;
		}
		
	} catch (Exception e) {
		System.err.println(e);
	}
	return false;
}
public boolean depositAss(String caminho , String cpf , double pix) {
	try {
		String caminhof = caminho + "Funcionarios.txt";
		FileReader fcrf = new FileReader(caminhof);
		BufferedReader bcrf = new BufferedReader(fcrf);
		String tempF = caminhof.replace(".txt", "temp.txt");
		FileWriter fcwf = new FileWriter(tempF);
		BufferedWriter bcwf = new BufferedWriter(fcwf);
		int cont = 0 ;
		System.out.println(caminhof);
		while (bcrf.ready()) {
			String line = bcrf.readLine();
			String vet[] = line.split(":");
			if (vet[5].equalsIgnoreCase(cpf)) {
			    String nomeT = vet[1];
			    String idade = vet[3];
			    String planoSaude = vet[7];
			    String telefone = vet[9];
			    String endereço = vet[11];
				double receita = Double.parseDouble(vet[13]);
				String horario = vet[17]+":"+vet[18];
			    receita = receita + pix;
			    bcwf.write("Nome:"+nomeT+":Idade:" +idade+ ":CPF:" + cpf + ":Plano:" +planoSaude 
				+":TEL:" +telefone+ ":Endereço:"+endereço+":R$:"+receita+":Prof:Assistente"+":HR:"+horario);
				bcwf.newLine();	
				cont++;
			} else {
				bcwf.write(line);
				bcwf.newLine();
			}
		}
		bcwf.close();
		fcwf.close();
		bcrf.close();
		fcrf.close();
		if(cont != 0) {
			transferir(tempF, caminhof);
			return true;
		}
		
	} catch (Exception e) {
		System.err.println(e);
	}
	return false;
}

}
