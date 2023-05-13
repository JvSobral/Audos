package estudos.alura.audos.main;

import estudos.alura.audos.modelos.Musica;
import estudos.alura.audos.modelos.Podcast;
import estudos.alura.audos.modelos.Preferidas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Musica musica = new Musica();
        musica.setTitulo("Gravity");
        musica.setArtista("Jonh Meyer");

        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
            
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();

        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Flow");
        podcast.setHost("3K");

        for (int i = 0; i < 3000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();

        }

        System.out.println(musica.getCurtidas());
        System.out.println(musica.getClassificacao());
        System.out.println(podcast.getCurtidas());
        System.out.println(podcast.getClassificacao());

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(musica);
        preferidas.inclui(podcast);




    }



}
