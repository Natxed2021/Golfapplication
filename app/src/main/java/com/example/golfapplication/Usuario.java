package com.example.golfapplication;

public class Usuario {

    private String Skinsdejuego;
    private String Usuario;
    private int numero;
    private double golpes;

    public Usuario(String skinsdejuego) {
        Skinsdejuego = skinsdejuego;
    }

    public String getSkinsdejuego() {
        return Skinsdejuego;
    }

    public void setSkinsdejuego(String skinsdejuego) {
        Skinsdejuego = skinsdejuego;
    }
}
