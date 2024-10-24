package classes;

import java.util.*;

public class ControleDados {
    List<Passageiro> passageiros = new ArrayList<>();
    List<Motorista> motoristas = new ArrayList<>();
    List<Corrida> corridas = new ArrayList<>();

    public ControleDados() {
    }

    public ControleDados(List<Passageiro> passageiros, List<Motorista> motoristas, List<Corrida> corridas) {
        this.passageiros = passageiros;
        this.motoristas = motoristas;
        this.corridas = corridas;
    }

    public void motoristaComMaisCorridas() {
        Optional<Motorista> motoristaComMaisCorridas = motoristas.stream()
                .flatMap(motorista -> motorista.getC.stream())
                .max(Comparator.comparingInt(Usuario::getTotalCorridas));
    }

    public int calcularTotalCorridas() {
       return corridas.size();
    }

    public List<Corrida> getCorridas() {
        return corridas;
    }

    public List<Motorista> getMotoristas() {
        return motoristas;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public void setMotoristas(List<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    public void setCorridas(List<Corrida> corridas) {
        this.corridas = corridas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ControleDados that = (ControleDados) o;
        return Objects.equals(passageiros, that.passageiros) && Objects.equals(motoristas, that.motoristas) && Objects.equals(corridas, that.corridas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passageiros, motoristas, corridas);
    }

    @Override
    public String toString() {
        return "ControleDados{" +
                "passageiros=" + passageiros +
                ", motoristas=" + motoristas +
                ", corridas=" + corridas +
                '}';
    }
}
