package uni1a;

import ups.poo.uni2.jordygilse.Investigador;

public class Reportaje extends ContenidoAudiovisual {
    private Investigador investigador;

    // el investigador llega ya creado (agregacion)
    public Reportaje(String titulo, int duracionEnMinutos, String genero, Investigador investigador) {
        super(titulo, duracionEnMinutos, genero);
        this.investigador = investigador;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Reportaje: " + getTitulo());
        System.out.println("Genero: " + getGenero());
        System.out.println("Duracion: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Investigador: " + investigador.getNombre());
    }
}