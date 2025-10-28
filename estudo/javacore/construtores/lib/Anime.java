package javacore.construtores.domain;

public class Anime{
	private String tipo;
	private int episodio;
	private String nome;
	private String genero;
	private String estudio;
	
	// Construtores são os inicializadores do objetos
	// Com a presença dos construtores eu não preciso mais do 
	// metódo init
	// Construtores não tem retorno, se tiver retorno passa a ser um 
	// metódo 
	
	public Anime(){
		System.out.println("Construtor sem argumentos");
	}

        public Anime(String nome, String tipo, int episodio){
                this();
                this.nome = nome;
                this.tipo = tipo;
                this.episodio = episodio;
        }


	public Anime(String nome, String tipo, int episodio, String genero)
	{
                this(nome, tipo, episodio);
        	this.genero = genero;			
	}

        public Anime(String nome, String tipo, int episodio, String genero, String estudio)
        {
                this(nome, tipo, episodio, genero);
                this.estudio = estudio ;
        }

        public void imprime(String nome, String tipo, int episodio)
	{
                System.out.println(this.nome);
                System.out.println(this.tipo);
                System.out.println(this.episodio);
        }


	public void imprime()
	{
		System.out.println(this.nome);
		System.out.println(this.tipo);
		System.out.println(this.episodio);
		System.out.println(this.genero);
		System.out.println(this.estudio);
	}

	public void setEstudio(String estudio){
		this.estudio = estudio;
	}

	public String getEstudio(){
		return estudio;
	}
	
	public void setGenero(String genero){
		this.genero = genero;
	}

	public String getGenero(){
		return genero;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public String getTipo(){
		return tipo;
	}

	public void setEpisodio(int episodio){
		this.episodio = episodio;
	}

	public int getEpisodio(){
		return episodio;
	}
}
