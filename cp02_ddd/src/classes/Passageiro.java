package classes;

import java.util.Objects;

public class Passageiro extends Usuario{
    private String endereco;

    public Passageiro() {
    }

    public Passageiro(String nome, String senha, String cpf, String endereco) {
        super(nome, senha, cpf);
        this.endereco = endereco;
    }

    public void solicitarCorrida(Corrida corrida, String pontoPartida, String pontoDestino) {
        corrida.setPassageiro(this);
        corrida.setPontoPartida(pontoPartida);
        corrida.setPontoDestino(pontoDestino);
        corridas.add(corrida);
        setTotalCorridas(corridas.size());
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Passageiro that = (Passageiro) o;
        return Objects.equals(endereco, that.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), endereco);
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "endereco='" + endereco + '\'' +
                '}';
    }
}
