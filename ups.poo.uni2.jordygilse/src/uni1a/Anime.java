package uni1a;
 
import java.util.ArrayList;
 
import ups.poo.uni2.jordygilse.Temporada;
 
public class Anime extends ContenidoAudiovisual {
    private ArrayList<Temporada> temporadas;
 
    public Anime(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        temporadas = new ArrayList<Temporada>();
    }
 
    // el anime crea sus temporadas (composicion)
    public void agregarTemporada(int numero, int episodios) {
        temporadas.add(new Temporada(numero, episodios));
    }
 
    @Override
    public void mostrarDetalles() {
        System.out.println("Anime: " + getTitulo());
        System.out.println("Genero: " + getGenero());
        System.out.println("Duracion: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Temporadas:");
        for (Temporada t : temporadas) {
            System.out.println("- Temporada " + t.getNumero() + ": " + t.getEpisodios() + " episodios");
        }
    }
}