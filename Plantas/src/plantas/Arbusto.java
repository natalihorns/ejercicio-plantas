
package plantas;

public class Arbusto extends Planta{

    double anchoArbusto;
    boolean esDomestico;
    String variedadDeArbusto;
    String colorHojas;
    String sePodaONo;

    public Arbusto() {
    }

    public Arbusto(double anchoArbusto, boolean esDomestico, String variedadDeArbusto, String colorHojas, String sePodaONo, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadDeArbusto = variedadDeArbusto;
        this.colorHojas = colorHojas;
        this.sePodaONo = sePodaONo;
    }

    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadDeArbusto() {
        return variedadDeArbusto;
    }

    public void setVariedadDeArbusto(String variedadDeArbusto) {
        this.variedadDeArbusto = variedadDeArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public String getSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(String sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    
    
    
    
    @Override
    protected void decirLoQueSoy() {
        
        System.out.println("Hola soy un Arbusto");
    }
    
}
