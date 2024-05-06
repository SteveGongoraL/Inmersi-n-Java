package modelo;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;
    private String sinopsis;
    private int tiempoDeDuracionEnMinutos;

    // GET y SET para Nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // GET y SET para Fecha de lanzamiento
    public int getFechaDeLanzamiento(){
        return fechaDeLanzamiento;
    }
    public void setFechaDeLanzamiento(int fechaDeLanzamiento){
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    //GET para Evaluacion
    public double getEvaluacion(){
        return evaluacion;
    }

    // GET y SET para Incluido en el plan basico
    public boolean getIncluidoEnElPlanBasico(){
        return incluidoEnElPlanBasico;
    }
    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico){
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    // GET y SET para Sinopsis
    public String getSinopsis(){
        return sinopsis;
    }
    public void setSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }

    // GET y SET para Tiempo de duración en minutos
    public int getTiempoDeDuracionEnMinutos(){
        return tiempoDeDuracionEnMinutos;
    }
    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos){
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    // Metodo
    public void muestraFichaTecnica(){
        System.out.println("\n-- Ficha Técnina --");
        System.out.println("Nombre del titulo: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Tiempo de duración: " + getTiempoDeDuracionEnMinutos() + " minutos");
    }
}
