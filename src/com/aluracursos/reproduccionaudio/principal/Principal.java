package com.aluracursos.reproduccionaudio.principal;

import com.aluracursos.repoduccionAudio.modelos.Cancion;
import com.aluracursos.repoduccionAudio.modelos.MisFavoritos;
import com.aluracursos.repoduccionAudio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Ji Ji Ji");
        miCancion.setInterprete("Patricio Rey y sus redonditos de ricota");

        Podcast miPodcast = new Podcast();
        miPodcast.setConductor("Gabriela Aguilar");
        miPodcast.setTitulo("Cafe.Tech");

        for (int i = 0; i < 500; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 1000; i++) {
            miCancion.reproduce();
        }

        for (int i = 0; i < 500; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 10000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);

    }
}
