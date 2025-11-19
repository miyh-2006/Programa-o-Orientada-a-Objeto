package sistema_iptu;

public class Imovel {
    private Municipio municipio;
    private Double areaM2;
    private Integer vagas;

    public Double calcularIPTU(){
        return (this.areaM2 * this.municipio.getPrecoM2()) * 1.005;
    }

    public Imovel(Municipio municipio, Integer vagas) {
        this.municipio = municipio;
        this.vagas = vagas;
    }

    public Municipio getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Integer getVagas() {
        return this.vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }
    
}
