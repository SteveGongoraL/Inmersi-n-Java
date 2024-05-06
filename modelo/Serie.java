package modelo;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEnMinutosPorEpisodio;

    // GET y SET para Temporada
    public int getTemporadas(){
        return temporadas;
    }
    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    // GET y SET para Episodios por temporada
    public int getEpisodiosPorTemporada(){
        return episodiosPorTemporada;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    // GET y SET para Duracion en minutos por episodio
    public int getDuracionEnMinutosPorEpisodio(){
        return duracionEnMinutosPorEpisodio;
    }
    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio){
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }

    // Sobrescribir un metodo
    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return duracionEnMinutosPorEpisodio * episodiosPorTemporada * temporadas;
    }

}
