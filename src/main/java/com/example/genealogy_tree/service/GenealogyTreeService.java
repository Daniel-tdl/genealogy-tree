package com.example.genealogy_tree.service;

import com.example.genealogy_tree.modal.Person;

public class GenealogyTreeService {

    public Person getAncestral(Person person, Integer lastGeneration) {
        Person father = person;
        for (int i = 0; i < lastGeneration; i++) {
            if (father != null) {
                father = father.getFather();
            } else {
                System.out.println("Não foi encontrado uma pessoa para esta geração!");
            }
        }

        return father;
    }
}
