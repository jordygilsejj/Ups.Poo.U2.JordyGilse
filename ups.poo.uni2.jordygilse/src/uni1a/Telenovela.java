package uni1a;
 
import java.util.ArrayList;
 
import ups.poo.uni2.jordygilse.Actor;
 
public class Telenovela extends ContenidoAudiovisual {
    private ArrayList<Actor> actores;
 
    public Telenovela(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        actores = new ArrayList<Actor>();
    }
 
    public void agregarActor(Actor actor) {
        actores.add(actor);
    }
 
    @Override
    public void mostrarDetalles() {
        System.out.println("Telenovela: " + getTitulo());
        System.out.println("Genero: " + getGenero());
        System.out.println("Duracion: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Actores:");
        for (Actor a : actores) {
            System.out.println("- " + a.getNombre());
        }
    }
}
 