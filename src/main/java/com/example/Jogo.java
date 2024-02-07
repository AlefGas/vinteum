package com.example;

public class Jogo {
    protected Monte monte = new Monte();
    protected Jogador jogador= new Jogador();
    protected Computador computador = New Computador();

    public Jogo() {
        monte.embaralhar();
    }
    public Carta distribuirCartaParaJogador(Jogador jogador){
        if ( jogador.Parou()) return null;
            var carta = monte.virar();
            jogador.receberCarta(carta);
            return carta;
        }
        

    }

    public boolean acabou (){
        var osDoisPararam = jogador.Parou() && computador.Parou();
        var alguemEstorou = jogador.getPontos() > 21 || computador.getPontos() >21;
        return osDoisPararam || alguemEstorou;
    }
    public String resultado(){
        var jogadorEstourou = jogador.getPontos()>21;
        var computadorEstoutou = computador.getPontos()>21;
        
        if(jogadorEstourou && computadorEstoutou || jogador.getPontos() == computador.getPontos()){
        }return "Empatou";

        if (!jogadorEstourou && jogador.getPontos() > computador.getPontos()  ){
            return "voce Ganhou";
        }return "Voce Perdeu";

    }
    
}
