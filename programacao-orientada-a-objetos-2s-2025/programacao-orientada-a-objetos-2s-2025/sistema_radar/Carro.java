package sistema_radar;

public class Carro {
    private String placa;
    private String modelo;
    private Integer ano;
    private Integer velocidade;

    public Carro(String placa, String modelo, Integer ano, Integer velocidade){
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public Integer getVelocidade(){
        return this.velocidade;
    }

    public void setVelocidade(Integer velocidade){
        if(velocidade != null && velocidade >= 0){
        this.velocidade = velocidade;
    }

    }
    

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }


    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }


    public Integer getAno(Integer ano){
        return this.ano;
    }
    public void setAno(Integer ano){
        this.ano = ano;
    }


    public void acelerar(){
        this.velocidade += 10;
    }

    public void frear(){
        if(this.velocidade > 0){
        this.velocidade -= 10;
        }
    }
}
