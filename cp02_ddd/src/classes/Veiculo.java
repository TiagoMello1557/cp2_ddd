package classes;
import java.util.Objects;
import java.util.Random;

public class Veiculo {
    Random random = new Random();
    private final String id = String.valueOf(random.nextInt(10000));
    private String placa;
    private String modelo;
    private String capacidade;
    private Motorista motorista;

    public Veiculo(String placa, String modelo, String capacidade) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    public String getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
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
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(id, veiculo.id) && Objects.equals(placa, veiculo.placa) && Objects.equals(modelo, veiculo.modelo) && Objects.equals(capacidade, veiculo.capacidade) && Objects.equals(motorista, veiculo.motorista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, placa, modelo, capacidade, motorista);
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id='" + id + '\'' +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidade='" + capacidade + '\'' +
                ", motorista=" + motorista +
                '}';
    }
}
