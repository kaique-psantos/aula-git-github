package model;

public class Cliente {
    int codigo;
    String nome;
    String CPF;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public Cliente(String nome, String cpf, int codigo){
        this.nome = nome;
        this.CPF = cpf;
        this.codigo = codigo;
    }

    public Cliente(){
        
    }

}