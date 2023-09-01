package com.example.tdrevision;

import com.example.tdrevision.entity.Game;
import com.example.tdrevision.repository.GameRepository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Connecter à la bdd
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_config");

        // Appel au repo dédié aux transactions des jeux
        GameRepository gameRepo = new GameRepository(emf);

        // Création de nouveaux éléments en bdd
        Game game1 = new Game("Loup Garou","Le but d'une manche est d'être le premier à poser toutes les tuiles de son chevalet sur la table.");
        Game game2 = new Game("Uno","L’un des jeux les plus populaires des soirées jeux de société avec ses villageois, loups garous, maire, sorcière, petite fille...");
        Game game3 = new Game("Skribbl","Il est possible de crier “Uno !” quand un joueur s’apprête à gagner la partie.");
        Game game4 = new Game("Blanc Manger Coco","La règle est très simple : dessinez des objets avec votre souris et faites deviner le plus de mots aux autres joueurs !");
        Game game5 = new Game("Rummikub","Un joueur tire une carte où figure un texte à trous que les autres joueurs doivent remplir avec des mots pour construire la phrase la plus drôle possible.");

        gameRepo.create(game1);
        gameRepo.create(game2);
        gameRepo.create(game3);
        gameRepo.create(game4);
        gameRepo.create(game5);

        //System.out.println(game);

        ArrayList<Game> gamesAll = (ArrayList<Game>) gameRepo.findAll();
        for (Game game : gamesAll) {
            System.out.println("<li><a href='#'>"+game.getNom()+"</a></li>");
        }
    }
}
