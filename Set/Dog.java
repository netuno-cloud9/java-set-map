package Set;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author instrutor
 */
public class Dog {
    private int age;

    public Dog(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.age;
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
        final Dog other = (Dog) obj;
        if (this.age != other.age) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dog{" + "age=" + age + '}';
    }
    
    public static void main(String[] args) {
        //Set<Dog> dset = new HashSet<Dog>();
        Set<Integer> dset = new LinkedHashSet<>();
        dset.add(2);
        dset.add(1);
        dset.add(3);
        dset.add(5);
        dset.add(4);
        for(Integer d:dset){
            System.out.println(d);
        }
    }
}
