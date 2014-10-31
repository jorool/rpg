package com.jonathanoliveira;

public interface Personagem {

    String nome = "";
    int quantidadeVida = 0;

    int getDano();

    int getResistencia();

    String atacar(Personagem personagem);

    int reagir(int reducao);

}
