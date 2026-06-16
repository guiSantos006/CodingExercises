package SantanderJavaBootCamp.ExerciciosClassesEEncapsulamento.PetShop;

public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;


    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet dentro da máquina para iniciar o banho.");
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + "está limpo!");
    }

    public void addWater(){
        if (this.water > 28){
            System.out.println("A máquina atingiu sua capacidade máxima de água.");
        }

        water += 2;
        System.out.println("A máquina foi abastecida com 2 litros d'água.");
    }

    public void addShampoo(){
        if (this.shampoo > 8){
            System.out.println("A máquina atingiu sua capacidade máxima de água.");
        }

        shampoo += 2;
        System.out.println("A máquina foi abastecida com 2 litros d'água.");
    }

    public boolean hasPet(){
        return pet != null;
    }

    public boolean isClean() {
        return clean;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A máquina está suja, para colocar o pet é necessário lava-la");
            return;
        }
        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + "está na máquina nesse momento");
            return;
        }

        this.pet = pet;
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " está limpo");
        this.pet = null;
    }

    public void cleanMachine(){
        if (clean){
            System.out.println("A máquina já está limpa.");
            return;
        }

        System.out.println("A máquina foi limpa com sucesso.");
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
    }
}
