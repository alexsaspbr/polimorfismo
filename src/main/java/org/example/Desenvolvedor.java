package org.example;

import java.math.BigDecimal;

public class Desenvolvedor extends Colaborador {

    public Desenvolvedor(){
        this.salarioBase = new BigDecimal("5000");
    }

    @Override
    public BigDecimal salario() {
        return this.salarioBase;
    }

}
