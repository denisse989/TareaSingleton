package TareaFactory;

public class Origen {

    private String pais;
    private String ciudad;
    private String nombreAeropuerto;


    public Origen() {

    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombreAeropuerto() {
        return nombreAeropuerto;
    }
    public void setNombreAeropuerto(String nombreAeropuerto) {
        this.nombreAeropuerto = nombreAeropuerto;
    }
    public void showInfo() {
            System.out.println("Pais de Origen : "+pais);
            System.out.println("Ciudad de Origen : "+ciudad);
            System.out.println("Nombre del Origen : "+nombreAeropuerto);

    }
}
