import java.util.ArrayList;
import java.util.List;

public class Jogador{
    private int pontos;
    private List<Carta> cartas = new ArrayList<>();
    private boolean parou;
    
    
    public void receberCarta(Carta carta){
        cartas.add(carta);
        pontos += carta.getNUmero();
    }
    public void parar(){
        parou = true;
    }
    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    public List<Carta> getCartas() {
        return cartas;
    }
    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }
    public boolean Parou() {
        return parou;
    }
    public void setParou(boolean parou) {
        this.parou = parou;
    }
    

    }