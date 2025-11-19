package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        System.out.println("Simulação");

        Carro opala = new Carro("ACLR300", "Comodoro", 76, 0);

        Radar radar = new Radar(60, "Pistão Sul");

        radar.avaliarVelocidade(opala);

        opala.acelerar(); //10
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar(); //70
        

        radar.avaliarVelocidade(opala);

        opala.frear(); //60

        radar.avaliarVelocidade(opala);
    }
    
}
