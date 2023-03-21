import java.util.Objects;

public abstract class Aereomobile implements CMP{
    private String sigla;
    public Aereomobile(String sigla){
        setSigla(sigla);
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    @Override
    public boolean superiore(Aereomobile x) {
        if(this instanceof Aliante && x instanceof Aliante){
            if(((Aliante)this).getEfficienza()>((Aliante) x).getEfficienza()){
                return true;
            }
            else if(((Aliante)this).getEfficienza()<((Aliante) x).getEfficienza()){
                return false;
            }
            else{
                return false;
            }
        }
        else if(this instanceof Aereomotore && x instanceof Aereomotore){
            if(((Aereomotore)this).getPotenza()>((Aereomotore) x).getPotenza()){
                return true;
            }
            else if(((Aereomotore) this).getPotenza()<((Aereomotore) x).getPotenza()){
                return false;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "sigla:"+sigla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(sigla, ((Aereomobile) o).getSigla());
    }

}
