import java.lang.String;

public class Car {
    private String name;
    private String model;
    private String stare;
    private String combustibil;
    private boolean an;

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }

    public void setAn(boolean an) { this.an = an; }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public String getStare() {
        return stare;
    }

    public boolean getAn() { return an; }
}
