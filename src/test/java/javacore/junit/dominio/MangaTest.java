package javacore.junit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {
        private Manga manga1;
        private Manga manga2;

        @BeforeEach
        public void setUp(){
            manga1 = new Manga("jujutsu", 24);
            manga2 = new Manga("jujutsu", 24);

        }

        @Test
        public void acessors_ReturnData_WhenInitialized(){
            Assertions.assertEquals("jujutsu", manga1.name());
            Assertions.assertEquals(24, manga1.episodes());
        }

}