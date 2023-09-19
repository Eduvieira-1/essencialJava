package javacore.optinal.test;

import javacore.optinal.dominio.Manga;
import javacore.optinal.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        //Fazendo uma busca por titulo se existir alterar
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("dragon ball");
        mangaByTitle.ifPresent(m -> m.setTitle("dragon ball z goku o brabo"));
        System.out.println(mangaByTitle);


        //se o ID nao existir retornar uma exceção
        Manga mangaById = MangaRepository.findById(1).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        //buscando um titulo se nao existir, crie esse titulo
        Manga newManga = MangaRepository.findByTitle("naruto").orElseGet(() -> new Manga(3, "naruto", 20));
        System.out.println(newManga);
    }


}
