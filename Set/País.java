package Set;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author instrutor
 */
public class País {
    
    private String nome;

    public País(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final País other = (País) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Set<País> paises = new HashSet<>();
        País p = new País("Brasil");
        País q = new País("Argentina");
        País r = new País("Alemanha");
        País s = new País("Alemanha");
        paises.add(p);
        paises.add(q);
        paises.add(r);
        paises.add(s);
        System.out.println(paises.size());
    }
}
