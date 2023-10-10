
public class Coordenada {
    private Integer ejeX;
    private Integer ejeY;
    
    public Coordenada(Integer ejeX, Integer ejeY) {
        super();
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }
    public Coordenada() {
        super();
        this.ejeX = 0;
        this.ejeY = 0;
    }
    
    public Integer getEjeX() {
        return ejeX;
    }
    public Integer getEjeY() {
        return ejeY;
    }

    private void setEjeX(Integer ejeX) {
        this.ejeX = ejeX;
    }

    private void setEjeY(Integer ejeY) {
        this.ejeY = ejeY;
    }
    
    
}
