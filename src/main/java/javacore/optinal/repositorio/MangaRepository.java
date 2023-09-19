package javacore.optinal.repositorio;

import javacore.optinal.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    public static List<Manga> mangas =List.of(new Manga(1, "dragon ball", 500), new Manga(2, "jujutsu kaizen", 20));

    public static Optional<Manga> findById(Integer id){
        return findby(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title){
        return findby(m -> m.getTitle().equals(title));
    }

    private static Optional<Manga> findby(Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangas) {
            if(predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);

    }
}
