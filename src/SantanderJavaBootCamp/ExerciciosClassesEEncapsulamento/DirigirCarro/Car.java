package SantanderJavaBootCamp.ExerciciosClassesEEncapsulamento.DirigirCarro;

public class Car {

    private boolean start = false;
    private int gear = -1;
    private int speed = 0;

    public boolean isStart() {
        return start;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void startCar(){
        if (isStart()){
            System.out.println("O carro já está ligado.");
            return;
        }

        this.start = true;
        System.out.println("O carro foi ligado.");
    }

    public void turnOffCar(){
        if (!isStart()){
            System.out.println("O carro já está desligado.");
            return;
        } else if (isStart() && gear == -1 && speed == 0){
            this.start = false;
            System.out.println("O carro foi desligado.");
            return;
        }

        System.out.println("O carro não pode ser desligado.");
    }

    public void accelerate(){
        if (!isStart()){
            System.out.println("O carro não está ligado para que você possa acelerar");
            return;
        } else if (this.gear == -1) {
            System.out.println("O carro está em ponto morto");
            return;
        } else if ((this.speed > (20 * getGear())) && this.speed < (20*(getGear() + 1)) || this.speed == 0) {
            this.speed += 1;
            System.out.println("Você acelerou. Sua velocidade é de " + getSpeed() + "KM/H");
            return;
        }

        System.out.println("Não foi possível acelerar o carro");

    }

    public void decelerate(){
        if (!isStart()){
            System.out.println("O carro não está ligado para que você possa desacelerar");
            return;
        } else if (this.gear == -1) {
            System.out.println("O carro está em ponto morto");
            return;
        } else if ((this.speed > (20 * getGear())) && this.speed < (20*(getGear() + 1)) || this.speed == 0) {
            this.speed -= 1;
            System.out.println("Você desacelerou. Sua velocidade é de " + getSpeed() + "KM/H");
            return;
        }

        System.out.println("Não foi possível desacelerar o carro");
    }

    public void gearUp(){
        if (!isStart()) {
            System.out.println("O carro não está ligado para que você possa subir a marcha.");
            return;
        } else if (this.gear == -1) {
            this.gear += 1;
            System.out.println("Você subiu a marcha.");
            return;
        } else if (this.speed == 0){
            System.out.println("Não foi possível trocar de marcha.");
            return;
        } else if (this.speed == (20*(getGear() + 1))){
            this.gear += 1;
            System.out.println("Você subiu a marcha.");
            return;
        }

        System.out.println("Não foi possível trocar de marcha.");

    }

    public void gearDown(){
        if (!isStart()) {
            System.out.println("O carro não está ligado para que você possa descer a marcha.");
            return;

        } else if (this.gear == -1) {
            System.out.println("Não é possivel descer a marcha estando em ponto morto");
            return;
        } else if (this.gear == 0 && this.speed == 0) {
            this.gear -= 1;
            System.out.println("Você reduziu a marcha para ponto morto");
            return;
        } else if (this.speed == (20 * getGear())){
            this.gear -= 1;
            System.out.println("Você reduziu a marcha.");
            return;
        }

        System.out.println("Não foi possível trocar de marcha.");
    }

    public void turnLeft(){
        if (!isStart()){
            System.out.println("O carro não está ligado para que você possa virar a esquerda");
            return;
        } else if (this.speed >= 1 && this.speed <= 40) {
            System.out.println("Você virou a esquerda");
            return;
        }

        System.out.println("Não foi possível virar");
    }

    public void turnRight(){
        if (!isStart()){
            System.out.println("O carro não está ligado para que você possa virar a direita");
            return;
        }
        else if (this.speed >= 1 && this.speed <= 40) {
            System.out.println("Você virou a direita");
            return;
        }

        System.out.println("Não foi possível virar");
    }


}
