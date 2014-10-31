package com.jonathanoliveira;

public abstract class Antagonista implements Personagem {

    public abstract String atacar(Personagem atacado);

    public abstract int getDano();

    public abstract int getResistencia();
}

