package classes;

import java.util.*;

public class Usuario {
    Random random = new Random();
    private final String id = String.valueOf(random.nextInt(10000));
    private String nome;
    private String senha;
    private String cpf;
    private int totalCorridas;
    protected ArrayList<Corrida> corridas = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nome, String senha, String cpf) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
    }

    public void setTotalCorridas(int totalCorridas) {
        this.totalCorridas = totalCorridas;
    }

    public int getTotalCorridas() {
        return totalCorridas;
    }

    public void exibirCorridasPorStatus(StatusCorrida statusCorrida) {
        corridas.stream()
                .filter(corrida -> corrida.getStatusCorrida().equals(statusCorrida))
                .forEach(System.out::println);
    }

    public void exibirCorridasPorStatusOrdenadoValor(StatusCorrida statusCorrida) {
        corridas.stream()
                .filter(corrida -> corrida.getStatusCorrida().equals(statusCorrida))
                .sorted(Comparator.comparing(Corrida::getStatusCorrida))
                .forEach(System.out::println);
    }

    public void exibirCorridasPorStatusOrdenadoDataHora(StatusCorrida statusCorrida) {
        corridas.stream()
                .filter(corrida -> corrida.getStatusCorrida().equals(statusCorrida))
                .sorted(Comparator.comparing(Corrida::getDataHora))
                .forEach(System.out::println);
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id) && Objects.equals(nome, usuario.nome) && Objects.equals(senha, usuario.senha) && Objects.equals(cpf, usuario.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, senha, cpf);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
