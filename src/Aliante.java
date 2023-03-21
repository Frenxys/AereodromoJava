import java.util.Objects;

public class Aliante extends Aereomobile{
    private int efficienza;

    public Aliante(String sigla,int efficienza) {
        super(sigla);
        setEfficienza(efficienza);
    }

    public void setEfficienza(int efficienza) {
        this.efficienza = efficienza;
    }

    public int getEfficienza() {
        return efficienza;
    }

    @Override
    public String toString() {
        return super.toString()+" efficienza:"+efficienza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        return efficienza ==((Aliante) o).getEfficienza();
    }

}
