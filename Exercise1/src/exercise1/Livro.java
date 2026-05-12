package exercise1;

public class Livro {
	String titulo;
	String autor;
	int ano;
	double preco;
	int paginas;
	
	
    public Livro(String titulo1, String autor1, int ano1, double preco1, int paginas1) {
        this.titulo = titulo1;
        this.autor = autor1;
        this.ano = ano1;
        this.preco = preco1;
        this.paginas = paginas1;
	


    }
    
  public double calcularPrecoPorPagina() {
	  return preco/paginas;
	  
    }
  
  public void informacoes() {
	  System.out.println("Titulo: " + titulo);
	  System.out.println("Autor: " + autor);
	  System.out.println("Ano: " + ano);
	  System.out.println("Preço: " + preco);
	  System.out.println("Paginas: " + paginas);
  }
}


    
    
    
    
    
    
    
    