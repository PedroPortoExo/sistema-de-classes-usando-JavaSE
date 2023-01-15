package frontEnd01;

import java.util.Scanner;
import backEnd01.Pagando;
import backEnd01.Gerente;
import backEnd01.Medicos;
import backEnd01.Agenda;
import backEnd01.Assistentes;
import backEnd01.Clientes;
import backEnd01.Consulta;
import backEnd01.Funcionarios;

public class Consultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// File caminhok= new File(".");
		// String caminhoOrig = caminhok.getAbsolutePath();
		// caminhoOrig = caminhoOrig.replace(".","");
		// caminhoOrig = caminhoOrig + "Hospital\\";
		String caminho = "C:\\Users\\pedro\\OneDrive\\Documentos\\Hospital\\";
		Scanner receba = new Scanner(System.in);
		String op;
		do {
			System.out.println("Bem vindo ao Hospital:");
			System.out.println("Digite seu cpf (apenas os numeros) para login");
			System.out.println("Digite cpf 1 para Gerente");
			System.out.println("Digite cpf 2 ao 5 para Medico");
			System.out.println("Digite cpf 5 ao 9 para Assistente");
			System.out.println("Digite cpf 10 ao 13 para Clientes");
			System.out.println("\nS - para sair..");
			op = receba.nextLine();
			Funcionarios g = new Funcionarios();
			if (g.verifcpfFunc(caminho, op)) {
				System.out.println("Login concluido");
				if (g.verifGerente(caminho, op)) {
					System.out.println("Bem vindo Gerente, oque deseja fazer?:");
					System.out.println("0 - Cadastrar Gerente");
					System.out.println("1 - Cadastrar Medicos");
					System.out.println("2 - Cadastrar Assistentes");
					System.out.println("3 - Cadastrar Pacientes");
					System.out.println("4 - Transferir dados para outro arquivo");
					System.out.println("5 - Relatorio de Funcionarios");
					System.out.println("6 - Relatorio de Pacientes");
					System.out.println("7 - Demitir Funcionario");
					System.out.println("8 - Alterar Horario de Trabalho");
					System.out.println("9 - Bonus Salarial Medico");
					System.out.println("10 - Bonus Salarial Assistente");
					String opGe = receba.nextLine();
					switch (opGe) {
					case "0": {
						System.out.println("Cadastrando...");
						String nomeT;
						String idade;
						String cpf;
						String telefone;
						do {
						System.out.print("Digite o Nome:");
						nomeT = receba.nextLine();
						nomeT = nomeT.replace("  ", " ");
						}while(!g.verifNome(nomeT));
						do {
						System.out.print("Digite a Idade:");
						idade = receba.nextLine();	
						}while(!g.verifIdade(idade));
						do {
							System.out.print("Digite o CPF:");
							cpf = receba.nextLine();
						}while(!g.verifCPF(cpf)); 
						System.out.print("Diga o Plano de Saude:");
						String planoSaude = receba.nextLine();
						do {
							System.out.print("Digite o Telefone:");
						   telefone = receba.nextLine();
						}while(!g.verifTel(telefone)); 						
						System.out.print("Digite o Endereço:");
						String endereço = receba.nextLine();
						double receita = Double.parseDouble("0");
						System.out.print("Digite o Horario de Trabalho:");
						String horario = receba.nextLine();
						if (g.casdastrarGerente(caminho, nomeT, idade, cpf, planoSaude, telefone, endereço,receita,
								horario)) {
							System.out.println("Cadastrado com sucesso!!\n");
						} else {
							System.out.println("Falha no Cadastro!.\n");
						}
						break;
					}
					case "1": {
						System.out.println("Cadastrando...");
						String nomeT;
						String idade;
						String cpf;
						String telefone;
						do {
						System.out.print("Digite o Nome:");
						nomeT = receba.nextLine();
						nomeT = nomeT.replace("  ", " ");
						}while(!g.verifNome(nomeT));
						do {
						System.out.print("Digite a Idade:");
						idade = receba.nextLine();	
						}while(!g.verifIdade(idade));
						do {
							System.out.print("Digite o CPF:");
							cpf = receba.nextLine();
						}while(!g.verifCPF(cpf)); 
						System.out.print("Diga o Plano de Saude:");
						String planoSaude = receba.nextLine();
						do {
							System.out.print("Digite o Telefone:");
						   telefone = receba.nextLine();
						}while(!g.verifTel(telefone)); 						
						System.out.print("Digite o Endereço:");
						String endereço = receba.nextLine();
						double receita = Double.parseDouble("0");
						System.out.print("Digite o Horario de Trabalho:");
						String horario = receba.nextLine();
						if (g.casdastrarMedicos(caminho, nomeT, idade, cpf, planoSaude, telefone, endereço,receita,
								horario)) {
							System.out.println("Cadastrado com sucesso!!\n");
						} else {
							System.out.println("Falha no Cadastro!.\n");
						}
						break;
					}
					case "2": {
						System.out.println("Cadastrando...");
						String nomeT;
						String idade;
						String cpf;
						String telefone;
						do {
						System.out.print("Digite o Nome:");
						nomeT = receba.nextLine();
						nomeT = nomeT.replace("  ", " ");
						}while(!g.verifNome(nomeT));
						do {
						System.out.print("Digite a Idade:");
						idade = receba.nextLine();	
						}while(!g.verifIdade(idade));
						do {
							System.out.print("Digite o CPF:");
							cpf = receba.nextLine();
						}while(!g.verifCPF(cpf)); 
						System.out.print("Diga o Plano de Saude:");
						String planoSaude = receba.nextLine();
						do {
							System.out.print("Digite o Telefone:");
						   telefone = receba.nextLine();
						}while(!g.verifTel(telefone)); 						
						System.out.print("Digite o Endereço:");
						String endereço = receba.nextLine();
						double receita = Double.parseDouble("0");
						System.out.print("Digite o Horario de Trabalho:");
						String horario = receba.nextLine();
						if (g.casdastrarAssistentes(caminho, nomeT, idade, cpf, planoSaude, telefone, endereço, receita,
								horario)) {
							System.out.println("Cadastrado com sucesso!!\n");
						} else {
							System.out.println("Falha no Cadastro!.\n");
						}
						break;
					}
					case "3": {
						System.out.println("Cadastrando...");
						String nomeT;
						String idade;
						String cpf;
						String telefone;
						do {
						System.out.print("Digite o Nome:");
						nomeT = receba.nextLine();
						nomeT = nomeT.replace("  ", " ");
						}while(!g.verifNome(nomeT));
						do {
						System.out.print("Digite a Idade:");
						idade = receba.nextLine();	
						}while(!g.verifIdade(idade));
						do {
							System.out.print("Digite o CPF:");
							cpf = receba.nextLine();
						}while(!g.verifCPF(cpf)); 
						System.out.print("Diga o Plano de Saude:");
						String planoSaude = receba.nextLine();
						do {
							System.out.print("Digite o Telefone:");
						   telefone = receba.nextLine();
						}while(!g.verifTel(telefone)); 						
						System.out.print("Digite o Endereço:");
						String endereço = receba.nextLine();
						double despeza = Double.parseDouble("0");
						String prescrição = "Nenhuma";
						if (g.casdastrarClientes(caminho, nomeT, idade, cpf, planoSaude, telefone, endereço, despeza,
								prescrição)) {
							System.out.println("Cadastrado com sucesso!!\n");
						} else {
							System.out.println("Falha no Cadastro!.\n");
						}
						break;
					}
					case "4": {
						Gerente gg = new Gerente();
						System.out.println("Digite o arquivo que queira transferir:");
						String origem = receba.nextLine();
						System.out.println("Digite para onde o arquivo sera transferido caso não haja ira ser criado:");
						String destino = receba.nextLine();
						gg.transferirDados(caminho, origem, destino);
						break;
					}
					case "5": {
						Gerente gg = new Gerente();
						gg.relatorioFuncionarios(caminho);
						break;
					}
					case "6": {
						Gerente gg = new Gerente();
						gg.relatorioClientes(caminho);
						break;
					}
					case "7": {
						Gerente gg = new Gerente();
						System.out.println("Digite o CPF do funcionario/a que deseja demitir:");
						int cpf = Integer.parseInt(receba.nextLine());
						if (gg.demitirFunc(caminho, cpf)) {
							System.out.println("Demitido com Sucesso!\n");
						} else {
							System.out.println("Falha no procedimento\n");
						}
						break;
					}
					case "8": {
						Gerente gg = new Gerente();
						System.out.println("Digite o Cpf do Funcionario/a que deseja alterar o Horario");
						String cpf = receba.nextLine();
						System.out.println("Digite o novo Horario");
						String hora = receba.nextLine();
						if (gg.mudarHora(caminho, cpf, hora)) {
							System.out.println("Mudado com Sucesso!!\n");
						} else {
							System.out.println("Falha no Procedimento!!\n");
						}
						break;
					}
					case "9": {
						System.out.println("Digite o CPF do Medico/a:");
						String cpf = receba.nextLine();
						System.out.println("Digite o valor do Bonus");
						double pix = Double.parseDouble(receba.nextLine());
						Gerente gg = new Gerente();
						if (gg.depositMed(caminho, cpf, pix)) {
							System.out.println("Depositado com sucesso!\n");
						} else {
							System.out.println("Falha no Procedimento!\n");
						}
						break;
					}
					case "10": {
						System.out.println("Digite o CPF da/o Assistente:");
						String cpf = receba.nextLine();
						System.out.println("Digite o valor do Bonus");
						double pix = Double.parseDouble(receba.nextLine());
						Gerente gg = new Gerente();
						if (gg.depositAss(caminho, cpf, pix)) {
							System.out.println("Depositado com sucesso!\n");
						} else {
							System.out.println("Falha no Procedimento!\n");
						}
						break;
					}
					default: {
						System.out.println("opção invalida");
					}

					}
				} else {
					if (g.verifMedico(caminho, op)) {
						Medicos m = new Medicos();
						System.out.println("Bem vindo Doutor, oque deseja fazer?:");
						System.out.println("1 - Cadastrar Cliente");
						System.out.println("2 - Cadastrar Assistente");
						System.out.println("3 - Prescrição medica e confirmar consulta");
						String opMed = receba.nextLine();
						switch (opMed) {
						case "1": {
							System.out.println("Cadastrando...");
							String nomeT;
							String idade;
							String cpf;
							String telefone;
							do {
							System.out.print("Digite o Nome:");
							nomeT = receba.nextLine();
							nomeT = nomeT.replace("  ", " ");
							}while(!g.verifNome(nomeT));
							do {
							System.out.print("Digite a Idade:");
							idade = receba.nextLine();	
							}while(!g.verifIdade(idade));
							do {
								System.out.print("Digite o CPF:");
								cpf = receba.nextLine();
							}while(!g.verifCPF(cpf)); 
							System.out.print("Diga o Plano de Saude:");
							String planoSaude = receba.nextLine();
							do {
								System.out.print("Digite o Telefone:");
							   telefone = receba.nextLine();
							}while(!g.verifTel(telefone)); 						
							System.out.print("Digite o Endereço:");
							String endereço = receba.nextLine();
							double despeza = Double.parseDouble("0");
							System.out.println("Digite a Prescrição Medica: , caso não haja ainda digite nenhuma:");
							String prescrição = receba.nextLine();
							if (g.casdastrarClientes(caminho, nomeT, idade, cpf, planoSaude, telefone, endereço,despeza,
									prescrição)) {
								System.out.println("Cadastrado com sucesso!!\n");
							} else {
								System.out.println("Falha no Cadastro!.\n");
							}
							break;
						}
						case "2": {
							System.out.println("Cadastrando...");
							String nomeT;
							String idade;
							String cpf;
							String telefone;
							do {
							System.out.print("Digite o Nome:");
							nomeT = receba.nextLine();
							nomeT = nomeT.replace("  ", " ");
							}while(!g.verifNome(nomeT));
							do {
							System.out.print("Digite a Idade:");
							idade = receba.nextLine();	
							}while(!g.verifIdade(idade));
							do {
								System.out.print("Digite o CPF:");
								cpf = receba.nextLine();
							}while(!g.verifCPF(cpf)); 
							System.out.print("Diga o Plano de Saude:");
							String planoSaude = receba.nextLine();
							do {
								System.out.print("Digite o Telefone:");
							   telefone = receba.nextLine();
							}while(!g.verifTel(telefone)); 						
							System.out.print("Digite o Endereço:");
							String endereço = receba.nextLine();
							double receita = Double.parseDouble("0");
							System.out.print("Digite o Horario de Trabalho:");
							String horario = receba.nextLine();
							if (g.casdastrarAssistentes(caminho, nomeT, idade, cpf, planoSaude, telefone, endereço,
									receita, horario)) {
								System.out.println("Cadastrado com sucesso!!\n");
							} else {
								System.out.println("Falha no Cadastro!.\n");
							}
							break;
						}
						case "3": {
							System.out.println("Digite o cpf do paciente : ");
							String cpf = receba.nextLine();
							System.out.println("Escreve a precrição para o paciente :");
							String prescrição = receba.nextLine();
							if (m.prescrição(caminho, cpf, prescrição)) {
								System.out.println("Prescrição adicionada com sucesso!");
								Consulta cn = new Consulta();
								System.out.println("Paciente foi consultado ? escolha a opção");
								System.out.println("1 - Sim");
								System.out.println("2 - Não");
								String opcn = receba.nextLine();
								if (opcn.equalsIgnoreCase("1")) {
									System.out.println("Valor da Consulta");
									String valor = receba.nextLine();
									if (cn.consultar(caminho, cpf, valor)) {
										System.out.println("Consulta registrada com sucesso\n");
									} else {
										System.out.println("Falha no Procedimento\n");
									}
								}
							} else {
								System.out.println("Falha no Procedimento\n");
							}
							break;
						}
						default: {
							System.out.println("opção invalida");
						}
						}
					} else {
						if (g.verifAssistente(caminho, op)) {
							System.out.println("Bem vindo/a Assistente, oque deseja fazer?:");
							Assistentes a = new Assistentes();
							System.out.println("1 - Cadastrar Cliente");
							System.out.println("2 - Marca consulta");
							System.out.println("3 - Desmarca consulta");
							System.out.println("4 - Entregar Produtos");
							System.out.println("5 - Verificar se o Medico passou prescrição");
							System.out.println("6 - Pagamento Cliente");
							String opAss = receba.nextLine();
							switch (opAss) {
							case "1": {
								System.out.println("Cadastrando...");
								String nomeT;
								String idade;
								String cpf;
								String telefone;
								do {
								System.out.print("Digite o Nome:");
								nomeT = receba.nextLine();
								nomeT = nomeT.replace("  ", " ");
								}while(!g.verifNome(nomeT));
								do {
								System.out.print("Digite a Idade:");
								idade = receba.nextLine();	
								}while(!g.verifIdade(idade));
								do {
									System.out.print("Digite o CPF:");
									cpf = receba.nextLine();
								}while(!g.verifCPF(cpf)); 
								System.out.print("Diga o Plano de Saude:");
								String planoSaude = receba.nextLine();
								do {
									System.out.print("Digite o Telefone:");
								   telefone = receba.nextLine();
								}while(!g.verifTel(telefone)); 						
								System.out.print("Digite o Endereço:");
								String endereço = receba.nextLine();
								double despeza = Double.parseDouble("0");
								System.out.println("Digite a Prescrição Medica: , caso não haja ainda digite nenhuma:");
								String prescrição = receba.nextLine();
								if (g.casdastrarClientes(caminho, nomeT, idade, cpf, planoSaude, telefone, endereço,
										despeza, prescrição)) {
									System.out.println("Cadastrado com sucesso!!\n");
								} else {
									System.out.println("Falha no Cadastro!.\n");
								}
								break;
							}
							case "2": {
								System.out.println("Horarios dos Medicos :");
								if (a.imprimaHorarios(caminho)) {
									System.out.println("Digite 1 para agendar consulta ");
									String opAg = receba.nextLine();
									if (opAg.equalsIgnoreCase("1")) {
										Agenda ag = new Agenda();
										System.out.println("Digite o CPF do Cliente:");
										String cpf = receba.nextLine();
										if (ag.verAgendado(caminho, cpf)) {
											System.out.println("Ja agendado:");
											ag.agendamento(caminho, cpf);
										} else {
											System.out.println("Agendar : ");
											System.out.println("Digite o cpf do Cliente");
											String cpfCl = receba.nextLine();
											System.out.println("Digite o Nome do Medico:");
											String nomeMed = receba.nextLine();
											System.out.println("Digite o CPF Medico:");
											String cpfMed = receba.nextLine();
											System.out.println("Digite o Horario para agendar:");
											String hora = receba.nextLine();
											if (ag.agendar(caminho, cpfCl, nomeMed, cpfMed, hora)) {
												System.out.println("Agendamento Realizado!!\n");
											} else {
												System.out.println("Falha no Procedimento\n");
											}
										}

									}

								} else {
									System.out.println("Falha no Procedimento\n");
								}
								break;
							}
							case "4": {
								System.out.println("Digite o cpf do paciente para puxar o endereço");
								String cpf = receba.nextLine();
								a.imprimirEndereço(caminho, cpf);
								break;
							}
							case "5": {
								System.out.println("Digite o cpf do paciente para verificar a prescrição medica");
								String cpf = receba.nextLine();
								a.imprimirPrecrição(caminho, cpf);
								break;
							}
							case "6": {
								System.out.println("Pagando...");
								Pagando cp = new Pagando();
								System.out.println("Informe o CPF do Cliente");
								String cpf = receba.nextLine();
								if (cp.pixCP(caminho, cpf)) {
								System.out.println("Operação concluida\n");
								} else {
									System.out.println("Falha no Procedimento\n");
										}
									}
								}
								break;
							}
						}
					}
				}
			 else {
				if (g.verifcpfClie(caminho, op)) {
					System.out.println("Login concluido");
					System.out.println("Bem vindo oque deseja ?  :");
					System.out.println("Caso queira ver a prescrição passa pelo seu medico digite 1");
					System.out.println("Caso queira marcar consulta fale com uma assistente.");
					System.out.println("Caso queira verificar se a consulta foi paga digite 2");
					String opClie = receba.nextLine();
					switch (opClie) {
					case "1": {
						Clientes c = new Clientes();
						c.verPrescrição(caminho, op);
						break;
					}
					case "2": {
						Clientes c = new Clientes();
						c.checarConsulta(caminho, op);
						break;
					}

					default: {
						System.out.println("opção invalida\n");
					}
					}

				} else {
					if (!op.equalsIgnoreCase("S")) {
						System.out.println("Não possui conta , Cadastre-se digitando 1:");
						System.out.println("Caso não queira digite 2");
						String opUser = receba.nextLine();
						switch(opUser) {
						case"1":{
						System.out.println("Cadastrando...");
						String nomeT;
						String idade;
						String cpf;
						String telefone;
						do {
						System.out.print("Digite o Nome:");
						nomeT = receba.nextLine();
						nomeT = nomeT.replace("  ", " ");
						}while(!g.verifNome(nomeT));
						do {
						System.out.print("Digite a Idade:");
						idade = receba.nextLine();	
						}while(!g.verifIdade(idade));
						do {
							System.out.print("Digite o CPF:");
							cpf = receba.nextLine();
						}while(!g.verifCPF(cpf)); 
						System.out.print("Diga o Plano de Saude:");
						String planoSaude = receba.nextLine();
						do {
							System.out.print("Digite o Telefone:");
						   telefone = receba.nextLine();
						}while(!g.verifTel(telefone)); 						
						System.out.print("Digite o Endereço:");
						String endereço = receba.nextLine();
						double despeza = Double.parseDouble("0");
						String prescrição = "nenhuma";
						if (g.casdastrarClientes(caminho, nomeT, idade, cpf, planoSaude, telefone, endereço, despeza,
								prescrição)) {
							System.out.println("Cadastrado com sucesso!!\n");
						} else {
							System.out.println("Falha no Cadastro!.\n");
						}
							break;
						}
						case "2" :{
							System.out.println("Obrigado por nos visitar!\n");
							break;
						}
						default:
							System.out.println("Opção invalida\n");
						}
						
					}

				}
			}

		} while (!op.equalsIgnoreCase("S"));
		System.out.println("FIM...");
		receba.close();
	}
}
