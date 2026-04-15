package com.SGP.rh;

public class Gerente extends Funcionario {
    private String senha;

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public void aplicarAumento(double percentual) {
        super.aplicarAumento(percentual + 2);
    }
}