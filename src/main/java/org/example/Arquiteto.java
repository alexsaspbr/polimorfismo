package org.example;

import java.math.BigDecimal;

public class Arquiteto extends Colaborador {

    private BigDecimal bonus = new BigDecimal("1000");

    public Arquiteto() {
        this.salarioBase = new BigDecimal("15000");
    }

    @Override
    public BigDecimal salario() {
        return salarioBase.add(bonus);
    }
}
