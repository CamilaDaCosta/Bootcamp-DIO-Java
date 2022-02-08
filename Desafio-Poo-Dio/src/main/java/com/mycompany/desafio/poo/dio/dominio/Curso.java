package com.mycompany.desafio.poo.dio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXp() {
       return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\n===== CURSO =====\nTitulo: "+getTitulo()
                +"\nDescrição: "+getDescricao()
                + "\nCarga Horária: " + cargaHoraria;
    }
}
