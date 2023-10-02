package Exemplo;

public abstract class Animal {
	private String cadastroMunicipal;
	private String nome;
	private String dono;
	public String getCadastroMunicipal() {
		return cadastroMunicipal;
	}
	public void setCadastroMunicipal(String cadastroMunicipal) {
		this.cadastroMunicipal = cadastroMunicipal;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public abstract String emiteSom();
	

}
