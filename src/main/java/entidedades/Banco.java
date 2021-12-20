package entidedades;

import java.awt.*;
import java.io.LineNumberInputStream;

public class Banco {


    private String nome;


    public Banco(String nome) {
        this.nome = nome;
    }

    public Banco() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
