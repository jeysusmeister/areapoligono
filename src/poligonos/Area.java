package poligonos;

public class Area {
    
    private double baseR, alturaR, baseT, alturaT, ladoC, radio;

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public Area(){}
    
    public Area(double baseR, double alturaR, double baseT, double alturaT, double ladoC, double radio) {
        this.baseR = baseR;
        this.alturaR = alturaR;
        this.baseT = baseT;
        this.alturaT = alturaT;
        this.radio = radio;
        this.ladoC = ladoC;
    }
    
    public void setBaseR(double baseR) {
        this.baseR = baseR;
    }

    public void setAlturaR(double alturaR) {
        this.alturaR = alturaR;
    }

    public void setBaseT(double baseT) {
        this.baseT = baseT;
    }

    public void setAlturaT(double alturaT) {
        this.alturaT = alturaT;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getBaseR() {
        return baseR;
    }

    public double getAlturaR() {
        return alturaR;
    }

    public double getBaseT() {
        return baseT;
    }

    public double getAlturaT() {
        return alturaT;
    }

    public double getRadio() {
        return radio;
    }
    
}
