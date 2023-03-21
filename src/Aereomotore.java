import java.util.Objects;

public class Aereomotore extends Aereomobile{
    private double potenza;     // Cavalli

    public Aereomotore(String sigla,double potenza) {
        super(sigla);
        setPotenza(potenza);
    }

    public void setPotenza(double potenza) {
        this.potenza = potenza;
    }

    public double getPotenza() {
        return potenza;
    }

    @Override
    public String toString() {
        return super.toString()+" potenza:"+potenza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aereomotore that = (Aereomotore) o;
        return Double.compare(that.potenza,((Aereomotore) o).getPotenza()) == 0;
    }

}
