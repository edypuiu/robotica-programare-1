public class Animal {
    private String caracteristici;
    private int varsta;
    private String nume;

    @Override public String toString() {
        return "Animal{" + nume + ", " + varsta + ", " + caracteristici + '\'' + '}';
    }

    public Animal(String caracteristici, int varsta, String nume) {
        this.caracteristici = caracteristici;
        this.varsta = varsta;
        this.nume = nume;
    }

    public String getCaracteristici() {return caracteristici;}
    public void setCaracteristici(String caracteristici) {this.caracteristici = caracteristici;}

    public int getVarsta() {return varsta;}
    public void setVarsta(int varsta) {this.varsta = varsta;}

    public String getNume() {return nume;}
    public void setNume(String nume) {this.nume = nume;}
}

