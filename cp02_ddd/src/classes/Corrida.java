package classes;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Random;

public class Corrida {
    Random random = new Random();
    private final String id = String.valueOf(random.nextInt(10000));
    private LocalDateTime dataHora;
    private String pontoPartida;
    private String pontoDestino;
    private String distancia;
    private double valor;
    private StatusCorrida statusCorrida;
    private Passageiro passageiro;
    private Motorista motorista;

    public Corrida() {
    }

    public Corrida(LocalDateTime dataHora, String pontoPartida, String pontoDestino, String distancia, double valor, StatusCorrida statusCorrida, Passageiro passageiro, Motorista motorista) {
        this.dataHora = dataHora;
        this.pontoPartida = pontoPartida;
        this.pontoDestino = pontoDestino;
        this.distancia = distancia;
        this.valor = valor;
        this.statusCorrida = statusCorrida;
        this.passageiro = passageiro;
        this.motorista = motorista;
    }

    public void criarCorrida() {
        dataHora = LocalDateTime.now();
        calcularDistancia();
        calcularValor();
    }

    public void calcularDistancia() {
        distancia = pontoPartida + " até " + pontoDestino;
    }

    public void calcularValor() {
        valor = distancia.length();
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getPontoPartida() {
        return pontoPartida;
    }

    public void setPontoPartida(String pontoPartida) {
        this.pontoPartida = pontoPartida;
    }

    public String getPontoDestino() {
        return pontoDestino;
    }

    public void setPontoDestino(String pontoDestino) {
        this.pontoDestino = pontoDestino;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public StatusCorrida getStatusCorrida() {
        return statusCorrida;
    }

    public void setStatusCorrida(StatusCorrida statusCorrida) {
        this.statusCorrida = statusCorrida;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Corrida corrida = (Corrida) o;
        return Double.compare(valor, corrida.valor) == 0 && Objects.equals(id, corrida.id) && Objects.equals(dataHora, corrida.dataHora) && Objects.equals(pontoPartida, corrida.pontoPartida) && Objects.equals(pontoDestino, corrida.pontoDestino) && Objects.equals(distancia, corrida.distancia) && statusCorrida == corrida.statusCorrida && Objects.equals(passageiro, corrida.passageiro) && Objects.equals(motorista, corrida.motorista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataHora, pontoPartida, pontoDestino, distancia, valor, statusCorrida, passageiro, motorista);
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "id='" + id + '\'' +
                ", dataHora=" + dataHora +
                ", pontoPartida='" + pontoPartida + '\'' +
                ", pontoDestino='" + pontoDestino + '\'' +
                ", distancia='" + distancia + '\'' +
                ", valor=" + valor +
                ", statusCorrida=" + statusCorrida +
                ", passageiro=" + passageiro +
                ", motorista=" + motorista +
                '}';
    }
}
