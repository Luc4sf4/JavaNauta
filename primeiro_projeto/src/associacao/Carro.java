package associacao;

public class Carro {

    private Motor motor;

    public Carro(Motor motor){
        this.motor = motor;
    }

    public Carro(int cilindradas){
        this.motor = new Motor(cilindradas);
    }

    public void mostrarCilindradas(){
        System.out.println("Carro com motor de " + motor.getCilidradas() + "cilindradas");
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
