package com.dh.banco;

public class Main {

    public static void main(String[] args) {

        EmpleadoBanco manejadorBase = new EjecutivoCuenta().setSigEmpleadoBanco(new Gerente().setSigEmpleadoBanco(new Director()));
        EmpleadoBanco gerente = new Gerente().setSigEmpleadoBanco(new Director());

        manejadorBase.procesarSolicitud(900);
        System.out.println("---------------------");
        gerente.procesarSolicitud(900);

    }
}
