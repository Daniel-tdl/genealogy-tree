package com.example.genealogy_tree.modal;

public class Person {

    private final String nome;
    private final Person father;

    public Person(String nome, Person father) {
        this.father = father;
        this.nome = nome;
    }

    public Person getFather() {
        return father;
    }

    public String getNome() {
        return nome;
    }
}
