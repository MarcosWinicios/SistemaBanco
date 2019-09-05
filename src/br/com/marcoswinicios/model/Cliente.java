package br.com.marcoswinicios.model;
import java.util.ArrayList;

public class Cliente {
	private String nome;
	private String endereco;
	private String email;
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public Cliente() {
		
	}

	public Cliente(String nome, String endereco, String email) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}

	public Cliente(String nome, String endereco, String email, ArrayList<Produto> produtos) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.produtos = produtos;
	}
	
	
}
