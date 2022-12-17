package org.example;

import java.math.BigDecimal;

public class AnalistaNegocio extends Colaborador {

    private BigDecimal bonus = new BigDecimal("500");

    public AnalistaNegocio() {
        this.salarioBase = new BigDecimal("7000");
    }

    @Override
    public BigDecimal salario() {
        return this.salarioBase.add(bonus);
    }
}
