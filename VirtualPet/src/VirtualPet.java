// Part A

public class VirtualPet {
    private String name;
    private int energyLevel;
    private int happinessLevel;
    private int weight;
    private int ageYears;
    private int ageMonths;

    public VirtualPet(String name){
        this.name = name;
        this.weight = 5;
        energyLevel = 0;
        happinessLevel = 0;
        ageYears = 0;
        ageMonths = 0;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name + "'s Information: \n Energy: " + energyLevel + "\n Happiness: "
                + happinessLevel + "\n Weight: " + weight + "\n Age: "
                + ageMonths + " months and " + ageYears + " years";
    }

    public void feed() {
        if(energyLevel < 10){
            energyLevel++;
        }

        weight++;
    }

    public int getEnergyLevel(){
        return energyLevel;
    }

    public int getHappinessLevel(){
        return happinessLevel;
    }

    public void play(){
        if(happinessLevel < 10){
            happinessLevel++;
        }

        if(weight > 0){
            weight--;
        }
    }

    public void updateStatus(){
        if(happinessLevel > 0){
            happinessLevel--;
        }

        if(energyLevel > 0){
            energyLevel--;
        }

        ageMonths++;

        if(ageMonths == 12){
            ageYears++;
            ageMonths = 0;
        }


    }

}
