package backEnd01;

import java.io.BufferedReader;
import java.io.FileReader;

public class Assistentes extends Funcionarios{

	
	public boolean imprimaHorarios(String caminho) {
		caminho = caminho + "Funcionarios.txt";
		try {
			BufferedReader bccr = new BufferedReader(new FileReader(caminho));
			String line;
			int cont = 0 ;
			while (bccr.ready()) {
				line = bccr.readLine();
				String loc[] = line.split(":");
				if(loc[15].equalsIgnoreCase("medico")) {
				String vet[] = line.split(":");
				System.out.printf("Nome:%s,Tel:%s,Hora:%s %n",vet[1],vet[9],vet[17]+":"+vet[18]);
				cont++;
				}
			}
			bccr.close();
			if(cont >= 1) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
 public void imprimirEndereço(String caminho , String paciente) {
	 caminho = caminho + "Clientes.txt";
	 try {
		BufferedReader bccr = new BufferedReader(new FileReader(caminho));
		String line;
		while(bccr.ready()) {
			line = bccr.readLine();
			String loc [] = line.split(":");
			if(loc[5].equalsIgnoreCase(paciente)) {
			 String vet[] = line.split(":");
			 System.out.println("Endereço: "+vet[11]);
			}
		}
		bccr.close();
	} catch (Exception e) {
		System.err.println(e);
	}
 }
 public void imprimirPrecrição(String caminho, String paciente) {
	 caminho = caminho + "Clientes.txt";
	 try {
		BufferedReader bccr = new BufferedReader(new FileReader(caminho));
		String line;
		while(bccr.ready()) {
			line = bccr.readLine();
			String loc [] = line.split(":");
			if(loc[5].equalsIgnoreCase(paciente)) {
			 String vet[] = line.split(",");
			 System.out.println("Prescrição Medica"+vet[15]);
			}
		}
		bccr.close();
	} catch (Exception e) {
		System.err.println(e);
	} 
 }
}
