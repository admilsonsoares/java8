package optional;

import java.util.Optional;

public class Pessoa {

    private String name;

    private Optional<String> cpf;

    public Pessoa() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(Optional<String> cpf) {
        this.cpf = cpf;
    }

    public Optional<String> getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
