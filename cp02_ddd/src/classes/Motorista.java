package classes;

import java.util.List;
import java.util.Objects;

public class Motorista extends Usuario{
    private Veiculo veiculo;

    public Motorista() {
    }

    public Motorista(String nome, String senha, String cpf, Veiculo veiculo) {
        super(nome, senha, cpf);
        this.veiculo = veiculo;
    }

    public void aceitarCorrida(Corrida corrida){
        corrida.setMotorista(this);
        corridas.add(corrida);
        setTotalCorridas(corridas.size());
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorista motorista = (Motorista) o;
        return Objects.equals(veiculo, motorista.veiculo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), veiculo);
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "veiculo=" + veiculo +
                '}';
    }
}
