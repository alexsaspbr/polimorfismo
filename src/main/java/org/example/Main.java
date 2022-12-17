package org.example;

public class Main {
    public static void main(String[] args) {

        Colaborador d = new Desenvolvedor();
        Colaborador a = new Arquiteto();
        AnalistaNegocio n = new AnalistaNegocio();
        //Gerente g = new Gerente();

        salarioColaborador(d);
        salarioColaborador(a);
        salarioColaborador(n);

    }

    public static void salarioColaborador(Colaborador colaborador){
        System.out.println(colaborador.salario());
    }

}