// Part A

public class VirtualPet {
    private String name;
    private int energyLvl;
    private int happinessLvl;
    private int weight;
    private int ageYears;
    private int ageMonths;

    public VirtualPet(String name){
        this.name = name;
        this.weight = 5;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name + "'s Information: \n Energy: " + energyLvl + "\n Happiness: "
                + happinessLvl + "\n Weight: " + weight + "\n Age: "
                + ageMonths + " months and " + ageYears + " years";
    }

    public void feed() {
        energyLvl++;
        weight++;

        if (energyLvl > 10) {
            energyLvl = 10;
        }
        else if(energyLvl < 0){
            energyLvl = 0;
        }
    }

    public int getEnergyLevel(){
        return energyLvl;
    }

    public int getHappinessLevel(){
        return happinessLvl;
    }

    public void play(){
        happinessLvl++;
        weight--;
        if(energyLvl > 10){
            energyLvl = 10;
        }
        if(weight < 5){
            weight = 5;
        }
    }

    public void updateStatus(){
        happinessLvl--;
        energyLvl--;
        ageMonths++;

        if(energyLvl > 10){
            energyLvl = 10;
        }

        if(happinessLvl > 10){
            happinessLvl = 10;
        }

        if(ageMonths == 12){
            ageYears++;
            ageMonths = 0;
        }


    }




}
