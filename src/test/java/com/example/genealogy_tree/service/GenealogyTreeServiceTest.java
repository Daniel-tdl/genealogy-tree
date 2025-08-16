package com.example.genealogy_tree.service;

import com.example.genealogy_tree.modal.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GenealogyTreeServiceTest {

    @InjectMocks
    private GenealogyTreeService genealogyTreeService;

    @Test
    void test_success() {
        Person tatara = new Person("tatara", null);
        Person trisa = new Person("trisa", tatara);
        Person bisa = new Person("bisa", trisa);
        Person avo = new Person("avo", bisa);
        Person father = new Person("pai", avo);

        Person rePerson = genealogyTreeService.getAncestral(father, 4);

        Assertions.assertEquals("tatara", rePerson.getNome());
    }
}
