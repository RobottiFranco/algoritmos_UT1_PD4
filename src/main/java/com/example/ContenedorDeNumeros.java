package com.example;

public class ContenedorDeNumeros {

    public static void main(String[] args) {
        // Crear una instancia de la clase NumberHolder
        NumberHolder holder = new NumberHolder();

        // Inicializar las variables miembro
        holder.anInt = 14;
        holder.aFloat = 3.14f;

        // Mostrar el valor de cada variable miembro
        System.out.println("Valor de anInt: " + holder.anInt);
        System.out.println("Valor de aFloat: " + holder.aFloat);
    }
}

class NumberHolder {
    public int anInt;
    public float aFloat;
}
