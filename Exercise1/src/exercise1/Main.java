package exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livro[] livros = new Livro[3];
        for (int i = 0; i < livros.length; i++) {
            System.out.println("Cadastro do Livro " + (i + 1));
            System.out.print("Título: ");
            String titulo = sc.nextLine();
            System.out.print("Autor: ");
            String autor = sc.nextLine();
            System.out.print("Ano: ");
            int ano = sc.nextInt();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            System.out.print("Páginas: ");
            int paginas = sc.nextInt();
            sc.nextLine(); // quebra de linha nextLine

            livros[i] = new Livro(titulo, autor, ano, preco, paginas);
        }

        Cliente[] clientes = new Cliente[3];
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Cadastro cliente " + (i + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine(); // quebra de linha depois de nextInt
            System.out.print("Sexo: ");
            String sexo = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Senha: ");
            String senha = sc.nextLine();

            clientes[i] = new Cliente(nome, idade, sexo, email, senha);
        }

        sc.close();

        System.out.println("\nPreço por página:");
        for (Livro livro : livros) {
            System.out.println(livro.titulo + ": " + livro.calcularPrecoPorPagina());
        }

        System.out.println("\nInformações dos Livros:");
        for (Livro livro : livros) {
            livro.informacoes();
            System.out.println("---------------------------------------");
        }

        System.out.println("\nInformações dos Clientes:");
        for (Cliente cliente : clientes) {
            cliente.imprimeInformacoes();
            System.out.println("-----------------------------------");
        }
    }
}
