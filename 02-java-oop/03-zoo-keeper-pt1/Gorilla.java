public class Gorilla extends Mammal{

    public Gorilla(int energeyLevel){
        super(energeyLevel);
    }

    public void throwSomething(){
        System.out.println("Gorilla just thrown something...");
        this.energyLevel =- 5;
    }

    public void eatBananas(){
        System.out.println("Gorilla just ate some bananas...");
        this.energyLevel += 5;
    }

    public void climb(){
        System.out.println("Grilla just climbed");
        this.energyLevel -= 10;
    }
    
}
