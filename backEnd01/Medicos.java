package backEnd01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Medicos extends Funcionarios {
	private String prescrição;

	public Medicos() {
		super();
	}

	public Medicos(String nomeT, String idade, int cpf, String planoSaude, int telefone, String endereço,
			double saldo,String horario, String prescrição) {
		super(nomeT, idade, cpf, planoSaude, telefone, endereço, saldo, horario);
		this.prescrição = prescrição;
	}

	public boolean prescrição(String caminho, String paciente, String prescrição) {
		caminho = caminho + "Clientes.txt";
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
				if (vet[5].equalsIgnoreCase(paciente)) {
					vet[15] = line.replace("nenhuma", prescrição);
					bcw.write(vet[15]);
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
			if (cont != 0) {
				Gerente g = new Gerente();
				g.transferir(temp, caminho);
				return true;
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return false;
	}
	protected String getPrescrição() {
		return prescrição;
	}

	protected void setPrescrição(String prescrição) {
		this.prescrição = prescrição;
	}

}
