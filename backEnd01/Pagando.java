package backEnd01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Pagando {

	public Pagando() {
		super();
	}

	public void pixconfirmCP(String caminho, String cpfCl, double pix) {

		try {
			String caminhoC = caminho + "Clientes.txt";
			FileReader fcr = new FileReader(caminhoC);
			BufferedReader bcr = new BufferedReader(fcr);
			String tempC = caminhoC.replace(".txt", "temp.txt");
			FileWriter fcw = new FileWriter(tempC);
			BufferedWriter bcw = new BufferedWriter(fcw);
			while (bcr.ready()) {
				String line = bcr.readLine();
				String vet[] = line.split(":");
				if (vet[5].equalsIgnoreCase(cpfCl)) {
					String nomeT = vet[1];
					String idade = vet[3];
					String planoSaude = vet[7];
					String telefone = vet[9];
					String endereço = vet[11];
					double despeza = Double.parseDouble(vet[13]);
					String prescrição = vet[15];
					if (pix <= 0) {
						System.out.println("Falha no pix");
					} else {
							despeza = despeza - pix;
							bcw.write("Nome:" + nomeT + ":Idade:" + idade + ":CPF:" + cpfCl + ":Plano:" + planoSaude
									+ ":TEL:" + telefone + ":Endereço:" + endereço + ":R$:" + despeza
									+ ":Prescrição medica :" + prescrição + ":Cliente");
							bcw.newLine();
						}
				} else {
					bcw.write(line);
					bcw.newLine();
				}
			}			
			bcw.close();
			fcw.close();
			bcr.close();
			fcr.close();
			Gerente g = new Gerente();
			g.transferir(tempC, caminhoC);
		} catch (Exception e) {
			System.err.println(e);
		}

	}

	public boolean pixCP(String caminho, String cpfCl) {
		String caminhoCons = caminho + "Consultas.txt";
		try {
			FileReader fcr = new FileReader(caminhoCons);
			BufferedReader bvc = new BufferedReader(fcr);
			String tempCons = caminhoCons.replace(".txt", "temp.txt");
			FileWriter fcw = new FileWriter(tempCons);
			BufferedWriter bvw = new BufferedWriter(fcw);
			int cont = 0;
			double pix = 0;
			while (bvc.ready()) {
				String line = bvc.readLine();
				String vet[] = line.split(":");
				if (vet[5].equalsIgnoreCase(cpfCl)) {
					String nomeC = vet[1];
					String idadeC = vet[3];
					String cpfC = vet[5];
					String planoC = vet[7];
					String tel = vet[9];
					String endereçoC = vet[11];
					String nomeMed = vet[13];
					String cpfMed = vet[15];
					String hora = vet[17] + ":" + vet[18];
					pix = Double.parseDouble(vet[20]);
					bvw.write("Nome:" + nomeC + ":Idade:" + idadeC + ":CPF:" + cpfC + ":Plano:" + planoC + ":TEL:"
							+ tel + ":Endereço:" + endereçoC + ":Nome Medico:" + nomeMed + ":CPF Medico:" + cpfMed
							+ ":HR:" + hora + ":R$:" + pix + ": Pago");
					bvw.newLine();
					Gerente g = new Gerente();
					g.depositMed(caminho, cpfMed, pix);
					pixconfirmCP(caminho, cpfCl, pix);
					cont++;

				} else {
					bvw.write(line);
					bvw.newLine();
				}
			}
			bvc.close();
			bvw.close();

			if (cont != 0) {
				Gerente g = new Gerente();
				g.transferir(tempCons, caminhoCons);
				return true;
			}

		} catch (Exception e) {
			System.err.println(e);
		}
		return false;
	}

}