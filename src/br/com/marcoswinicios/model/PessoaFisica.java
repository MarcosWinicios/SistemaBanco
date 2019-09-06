package br.com.marcoswinicios.model;

public class PessoaFisica extends Cliente {
	private String cpf;
	
	public void criarConta(boolean situacao, String numero) {
		Conta cc = new Poupanca();
		
	}

	public String getCpf() {
		return cpf;
	}
}
