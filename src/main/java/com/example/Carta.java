package com.example;
Public class Carta {
    public int numero;
    private naipe Naipe;

    public Carta(int numero, naipe Naipe){
        this.numero= numero;
        this.naipe= naipe;

    }
    
    public String imagePath(){
        return "classic-cards/"+numero +naipe +".png"
    }


public int getNUmero(){
    return this.numero;
}

public void setNumero(){
    this.numero = numero;
}



}