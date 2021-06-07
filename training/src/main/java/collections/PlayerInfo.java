package collections;

class PlayerInfo implements Comparable<PlayerInfo> {

    String name;
    int experience;

    public PlayerInfo(String name, int experience){
        this.name = name;
        this.experience = experience;
    }

    public String getName(){
        return name;
    }

    public int getExperience(){
        return experience;
    }

    public int compareTo(PlayerInfo player){
        return this.getExperience() - player.getExperience();
    }
}
