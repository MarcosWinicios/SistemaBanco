package br.com.marcoswinicios.model;

public abstract class Conta implements Produto{
	private double saldo;
	private String numero;
	private boolean situacao;
	@Override
	public double valorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}

	public abstract void sacar();
	
	public abstract void depositar();
	
	public abstract void desativar();
	
	public abstract void transferir();

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
