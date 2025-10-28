package javacore.associacao.domain;

public class Seminario{
    private String nome;
    private String endereco;
    private Professor[] professores;

    public Seminario(String nome){
        this.nome = nome;
    }

    public Seminario(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public Professor[] getProfessores(){
		return professores;	
	}
}