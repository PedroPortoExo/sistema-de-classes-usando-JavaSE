package backEnd01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Funcionarios {
	protected String nomeT;
	protected String idade;
	protected int cpf;
	protected String planoSaude;
	protected int telefone;
	protected String endereço;
	protected double receita;
	protected String horario;

	public Funcionarios() {
		super();
	}

	public Funcionarios(String nomeT, String idade, int cpf, String planoSaude, int telefone, String endereço,
			double receita, String horario) {
		super();
		this.nomeT = nomeT;
		this.idade = idade;
		this.cpf = cpf;
		this.planoSaude = planoSaude;
		this.telefone = telefone;
		this.endereço = endereço;
		this.receita = receita;
		this.horario = horario;
	}

	public boolean verifcpfFunc(String caminho, String cpf) {
		caminho = caminho + "Funcionarios.txt";
		try (BufferedReader bcr = new BufferedReader(new FileReader(caminho))) {
			while (bcr.ready()) {
				String line = bcr.readLine();
				String vet[] = line.split(":");
				line = line.trim();
				String login = vet[5];
				if (login.equalsIgnoreCase(cpf)) {
					return true;
				}
			}
			bcr.close();

		} catch (Exception e) {
			System.err.println(e);
		}
		return false;
	}

	public boolean verifcpfClie(String caminho, String cpf) {
		caminho = caminho + "Clientes.txt";
		try (BufferedReader bcr = new BufferedReader(new FileReader(caminho))) {
			while (bcr.ready()) {
				String line = bcr.readLine();
				String vet[] = line.split(":");
				line = line.trim();
				String login = vet[5];
				if (login.equalsIgnoreCase(cpf)) {
					return true;
				}
			}
			bcr.close();

		} catch (Exception e) {
			System.err.println(e);
		}
		return false;
	}

	public boolean verifGerente(String caminho, String cpf) {
		caminho = caminho + "Funcionarios.txt";
		try (BufferedReader bcr = new BufferedReader(new FileReader(caminho))) {
			while (bcr.ready()) {
				String line = bcr.readLine();
				String vet[] = line.split(":");
				String login = vet[5];
				if (login.equalsIgnoreCase(cpf)) {
					if (vet[15].equalsIgnoreCase("Gerente")) {
						return true;
					}
				}
			}
			bcr.close();

		} catch (Exception e) {
			System.err.println(e);
		}
		return false;
	}

	public boolean verifMedico(String caminho, String cpf) {
		caminho = caminho + "Funcionarios.txt";
		try (BufferedReader bcr = new BufferedReader(new FileReader(caminho))) {
			while (bcr.ready()) {
				String line = bcr.readLine();
				String vet[] = line.split(":");
				if (vet[5].equalsIgnoreCase(cpf)) {
					if (vet[15].equalsIgnoreCase("Medico")) {
						return true;
					}
				}
			}
			bcr.close();

		} catch (Exception e) {
			System.err.println(e);
		}
		return false;
	}

	public boolean verifAssistente(String caminho, String cpf) {
		caminho = caminho + "Funcionarios.txt";
		try (BufferedReader bcr = new BufferedReader(new FileReader(caminho))) {
			while (bcr.ready()) {
				String line = bcr.readLine();
				String vet[] = line.split(":");
				if (vet[5].equalsIgnoreCase(cpf)) {
					if (vet[15].equalsIgnoreCase("Assistente")) {
						return true;
					}
				}
			}
			bcr.close();

		} catch (Exception e) {
			System.err.println(e);
		}
		return false;
	}

	public boolean casdastrarGerente(String caminho, String nomeT, String idade, String cpf, String planoSaude,
			String telefone, String endereço, double receita, String horario) {
		try {
			caminho = caminho + "Funcionarios.txt";
			BufferedWriter bccw = new BufferedWriter(new FileWriter(caminho, true));
			bccw.write("Nome:" + nomeT + ":Idade:" + idade + ":CPF:" + cpf + ":Plano:" + planoSaude + ":TEL:" + telefone
					+ ":Endereço:" + endereço + ":R$:" + receita + ":Prof:Gerente" + ":HR:" + horario);
			bccw.newLine();
			bccw.close();
			return true;
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return false;

	}

	public boolean casdastrarMedicos(String caminho, String nomeT, String idade, String cpf, String planoSaude,
			String telefone, String endereço, double receita, String horario) {
		try {
			caminho = caminho + "Funcionarios.txt";
			BufferedWriter bccw = new BufferedWriter(new FileWriter(caminho, true));
			bccw.write("Nome:" + nomeT + ":Idade:" + idade + ":CPF:" + cpf + ":Plano:" + planoSaude + ":TEL:" + telefone
					+ ":Endereço:" + endereço + ":R$:" + receita + ":Prof:Medico" + ":HR:" + horario);
			bccw.newLine();
			bccw.close();
			return true;
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return false;

	}

	public boolean casdastrarAssistentes(String caminho, String nomeT, String idade, String cpf, String planoSaude,
			String telefone, String endereço, double receita, String horario) {
		try {
			caminho = caminho + "Funcionarios.txt";
			BufferedWriter bccw = new BufferedWriter(new FileWriter(caminho, true));
			bccw.write("Nome:" + nomeT + ":Idade:" + idade + ":CPF:" + cpf + ":Plano:" + planoSaude + ":TEL:" + telefone
					+ ":Endereço:" + endereço + ":R$:" + receita + ":Prof:Assistente" + ":HR:" + horario);
			bccw.newLine();
			bccw.close();
			return true;
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return false;

	}

	public boolean casdastrarClientes(String caminho, String nomeT, String idade, String cpf, String planoSaude,
			String telefone, String endereço, double despeza, String prescrição) {
		try {
			caminho = caminho + "Clientes.txt";
			BufferedWriter bccw = new BufferedWriter(new FileWriter(caminho, true));
			bccw.write("Nome:" + nomeT + ":Idade:" + idade + ":CPF:" + cpf + ":Plano:" + planoSaude + ":TEL:" + telefone
					+ ":Endereço:" + endereço + ":R$:" + despeza + ":Prescrição medica :" + prescrição + ":Cliente");
			bccw.newLine();
			bccw.close();
			return true;
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return false;

	}
	public boolean verifLetra(String verifL) {
		if (verifL.contains("a") || verifL.contains("b") || verifL.contains("c") || verifL.contains("d")
				|| verifL.contains("e") || verifL.contains("f") || verifL.contains("g") || verifL.contains("h")
				|| verifL.contains("i") || verifL.contains("j") || verifL.contains("k") || verifL.contains("l")
				|| verifL.contains("m") || verifL.contains("n") || verifL.contains("o") || verifL.contains("p")
				|| verifL.contains("q") || verifL.contains("r") || verifL.contains("s") || verifL.contains("t")
				|| verifL.contains("u") || verifL.contains("v") || verifL.contains("w") || verifL.contains("x")
				|| verifL.contains("y") || verifL.contains("z")) {
			return true;
		}
		return false;
	}

	public boolean verifNome(String nome) {
		if (nome.contains("@") || nome.contains("-") || nome.contains("0") || nome.contains("1") || nome.contains("2")
				|| nome.contains("3") || nome.contains("4") || nome.contains("5") || nome.contains("6")
				|| nome.contains("7") || nome.contains("8") || nome.contains("9")) {
			return false;
		} else {
			if (nome.length() >= 4) {
				return true;
			}
		}
		return false;

	}

	public boolean verifIdade(String idade) {
		if (idade.length() <= 3) {
			if (verifLetra(idade)) {
				return false;
			} else {
				if (idade.contains("0") || idade.contains("1") || idade.contains("2") || idade.contains("3")
						|| idade.contains("4") || idade.contains("5") || idade.contains("6") || idade.contains("7")
						|| idade.contains("8") || idade.contains("9")) {
					return true;
				}
			}

		}
		return false;

	}

	public boolean verifCPF(String cpf) {
		if (verifLetra(cpf)) {
			return false;
		} else {

			if (cpf.contains("0") || cpf.contains("1") || cpf.contains("2") || cpf.contains("3") || cpf.contains("4")
					|| cpf.contains("5") || cpf.contains("6") || cpf.contains("7") || cpf.contains("8")
					|| cpf.contains("9") || cpf.contains(".") || cpf.contains("-")) {
				if (cpf.length() == 11) {
					return true;
				} else {
					if (cpf.length() == 14 && cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-') {
						return true;
					}
				}

			}

		}

		return false;

	}
	public boolean verifTel(String tel) {
		if (verifLetra(tel)) {
			return false;
		} else {

			if (tel.contains("0") || tel.contains("1") || tel.contains("2") || tel.contains("3") || tel.contains("4")
					|| tel.contains("5") || tel.contains("6") || tel.contains("7") || tel.contains("8")
					|| tel.contains("9") || tel.contains("(") || tel.contains(")") || tel.contains("-")) {
				if (tel.length() == 11) {
					return true;
				} else {
					if (tel.length() == 14 && tel.charAt(0) == '(' && tel.charAt(3) == ')' && tel.charAt(9) == '-') {
						return true;
					}
				}

			}

		}

		return false;

	}

	protected String getNomeT() {
		return nomeT;
	}

	protected void setNomeT(String nomeT) {
		this.nomeT = nomeT;
	}

	protected String getIdade() {
		return idade;
	}

	protected void setIdade(String idade) {
		this.idade = idade;
	}

	protected int getCpf() {
		return cpf;
	}

	protected void setCpf(int cpf) {
		this.cpf = cpf;
	}

	protected String getPlanoSaude() {
		return planoSaude;
	}

	protected void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}

	protected int getTelefone() {
		return telefone;
	}

	protected void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	protected String getEndereço() {
		return endereço;
	}

	protected void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	protected double getReceita() {
		return receita;
	}

	protected void setReceita(double receita) {
		this.receita = receita;
	}

	protected String getHorario() {
		return horario;
	}

	protected void setHorario(String horario) {
		this.horario = horario;
	}

}
