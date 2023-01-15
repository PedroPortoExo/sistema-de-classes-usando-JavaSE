package backEnd01;

import java.io.BufferedReader;
import java.io.FileReader;

public class Clientes{

	public void verPrescrição(String caminho, String paciente) {
		caminho = caminho + "Clientes.txt";
		try {
			BufferedReader bccr = new BufferedReader(new FileReader(caminho));
			String line;
			while (bccr.ready()) {
				line = bccr.readLine();
				String loc[] = line.split(":");
				if (loc[5].equalsIgnoreCase(paciente)) {
					String vet[] = line.split(":");
					System.out.println("Prescrição Medica: "+vet[15]);
				}
			}
			bccr.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	public void checarConsulta(String caminho , String cpf) {
		caminho = caminho + "Consultas.txt";
		try {
			BufferedReader bccr = new BufferedReader(new FileReader(caminho));
			String line;
			while (bccr.ready()) {
				line = bccr.readLine();
				String loc[] = line.split(":");
				if (loc[5].equalsIgnoreCase(cpf)) {
					String vet[] = line.split(":");
					System.out.println("Verificando... :"+vet[21]);
				}
			}
			bccr.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
