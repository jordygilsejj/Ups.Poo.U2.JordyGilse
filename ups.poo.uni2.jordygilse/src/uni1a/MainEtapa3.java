package uni1a;

import ups.poo.uni2.jordygilse.Actor;
import ups.poo.uni2.jordygilse.Investigador;

public class MainEtapa3 {
    public static void main(String[] args) {
        Telenovela telenovela = new Telenovela("La Hija del Mariachi", 45, "Drama");
        telenovela.agregarActor(new Actor("Maria Lopez"));
        telenovela.agregarActor(new Actor("Carlos Ruiz"));

        Anime anime = new Anime("Naruto", 24, "Accion");
        anime.agregarTemporada(1, 35);
        anime.agregarTemporada(2, 48);

        Investigador investigador = new Investigador("Ana Torres");
        Reportaje reportaje = new Reportaje("Ecuador Oculto", 60, "Periodismo", investigador);

        telenovela.mostrarDetalles();
        System.out.println();
        anime.mostrarDetalles();
        System.out.println();
        reportaje.mostrarDetalles();
    }
}