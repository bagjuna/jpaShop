package jpabook.jpashop.service;

import jakarta.persistence.EntityManager;
import jpabook.jpashop.domain.item.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemUpdateTest {

    @Autowired
    private EntityManager em;

    @Test
    public void updateTest() {
        Book book = em.find(Book.class, 1L);
        book.setName("dfasdf");

    }

}