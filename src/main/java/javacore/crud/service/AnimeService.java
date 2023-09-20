package javacore.crud.service;

import javacore.crud.dominio.Anime;
import javacore.crud.dominio.Producer;
import javacore.crud.repository.AnimeRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
    private static final Scanner SC = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all: ");
        String name = SC.nextLine();
        List<Anime> animes = AnimeRepository.findByName(name);
        AnimeRepository.findByName(name).forEach(p -> System.out.printf("[%d] - %s %d %s%n", p.getId(), p.getName(), p.getEpisodes(), p.getProducer().getName()));
    }

    private static void delete() {
        System.out.println("Type the id of the anime you want to delete");
        int id = Integer.parseInt(SC.nextLine());
        System.out.println("Are you sure ? S/N");
        String choice = SC.nextLine();
        if ("s".equalsIgnoreCase(choice)) {
            AnimeRepository.delete(id);
        }
    }

    private static void save(){
        System.out.println("Type the name of the anime");
        String name = SC.nextLine();
        System.out.println("Type the number of the episodes");
        int episodes = Integer.parseInt(SC.nextLine());
        System.out.println("Type the id of the anime");
        Integer producerId = Integer.parseInt(SC.nextLine());
        Anime anime = Anime.builder()
                .name(name)
                .episodes(episodes)
                .producer(Producer.builder().id(producerId).build())
                .build();
        AnimeRepository.save(anime);
    }

    private static void update(){
        System.out.println("Type the id of the object you want to update");
        Optional<Anime> animeOptional = AnimeRepository.findById(Integer.parseInt(SC.nextLine()));
        if(animeOptional.isEmpty()){
            System.out.println("Anime not found");
            return;
        }
        Anime animeFromDb = animeOptional.get();
        System.out.println("test");
        System.out.println("Anime found " + animeFromDb);
        System.out.println("Type the new name or enter to keep the same:");
        String name = SC.nextLine();
        name = name.isEmpty() ? animeFromDb.getName() : name;

        System.out.println("Type the new number of episodes");
        int episodes = Integer.parseInt(SC.nextLine());

        Anime animeToUpdate = Anime.builder()
                .id(animeFromDb.getId())
                .episodes(episodes)
                .producer(animeFromDb.getProducer())
                .name(name)
                .build();

        AnimeRepository.update(animeToUpdate);
    }
}
