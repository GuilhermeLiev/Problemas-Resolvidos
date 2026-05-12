package exercise1;

public class Cliente {
	String nome;
	int idade;
	String sexo;
	String email;
	String senha;
	
	public Cliente(String nome1, int idade1, String sexo1, String email1, String senha1) {
		this.nome = nome1;
		this.idade = idade1;
		this.sexo = sexo1;
		this.email = email1;
		this.senha = senha1;
	}
	
	public void imprimeInformacoes() {
		System.out.println("Cliente: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo " + sexo);
		System.out.println("Email: " + email);
		System.out.println("Senha: " + senha);
	}
	

}
