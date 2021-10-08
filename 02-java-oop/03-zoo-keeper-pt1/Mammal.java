public class Mammal {
    public int energyLevel;

    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }
    
    public int diasplayEnergy(){
        System.out.println(this.energyLevel);
        return this.energyLevel;

    }
    
}
