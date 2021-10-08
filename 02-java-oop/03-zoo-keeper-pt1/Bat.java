public class Bat extends Mammal {

    public Bat(int energyLevel){
        super(energyLevel);
    }

    public void fly(){
        System.out.println("shbl, wiuihoqwa, cashbca...");
        this.energyLevel -= 50;

    }

    public void eatHumans(){
        System.out.println("It tastes like chicken..");
        this.energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("OMG my legs, my house is gone");
        this.energyLevel += 100;
    }

    
}
