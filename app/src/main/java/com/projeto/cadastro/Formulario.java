package com.projeto.cadastro;

public class Formulario {

    private String nome;
    private String telefone;
    private String email;
    private String checkbox;
    private String sexo;
    private String cidade;
    private String uf;

    public Formulario(String nome, String telefone, String email, String checkbox, String sexo, String cidade, String uf)
    {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.checkbox = checkbox;
        this.sexo = sexo;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String getCheckbox(){
        return checkbox;
    }

    public String getSexo(){
        return sexo;
    }

    public String getCidade(){
        return cidade;
    }

    public String getUf(){
        return uf;
    }

    public String toString(){
        return "Nome - " + getNome() + "\n" + "Email - " + getEmail() + "\n" + "CheckBox - " + getCheckbox() + "\n" + "Sexo - " + getSexo() +
                "\n" + "Cidade - " + getCidade() + "\n" + "UF - " + getUf();
    }

}

