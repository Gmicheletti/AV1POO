package br.av1;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Socio {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private List<Dependente> listDependentes = new LinkedList<>();

    public void addDependente(Dependente d){
        listDependentes.add(d);
    }

    public Socio(){

    }

    public Socio(int id, String nome, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Dependente> getDependentes() {
        return listDependentes;
    }

    public void setDependentes(List<Dependente> listDependentes) {
        this.listDependentes = listDependentes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return id == socio.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Socio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
