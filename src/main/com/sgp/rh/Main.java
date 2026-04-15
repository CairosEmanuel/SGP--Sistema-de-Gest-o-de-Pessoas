package com.SGP.rh;

public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Cauã", "000.000.000-00", 2000.0);
        Gerente ger = new Gerente("Diretor", "111.111.111-11", 5000.0, "1234");

        System.out.println("--- Dados Iniciais ---");
        System.out.println("Funcionario: " + func.getNome() + " | Salário: " + func.getSalario());
        System.out.println("Gerente: " + ger.getNome() + " | Salário: " + ger.getSalario());

        func.aplicarAumento(10);
        ger.aplicarAumento(10);

        System.out.println("\n--- Após Aumento de 10% ---");
        System.out.println("Novo Salário Funcionario: " + func.getSalario());
        System.out.println("Novo Salário Gerente (c/ bônus): " + ger.getSalario());
    }
}