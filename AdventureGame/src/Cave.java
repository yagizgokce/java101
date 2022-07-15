import java.util.Random;

public class Cave extends BattleLocation{
    public Cave(Player player) {
        super(player, "Cave", "Food", Characters.getObstaclesByName("Zombie"),3);
    }

}
class Forrest extends BattleLocation{
    public Forrest(Player player) {
        super(player, "Forrest", "Firewood", Characters.getObstaclesByName("Vampire"), 3);
    }
}

class River extends BattleLocation{
    public River(Player player) {
        super(player, "River", "Water", Characters.getObstaclesByName("Bear"), 3);
    }
}

class Mine extends BattleLocation{
    public Mine(Player player,String award) {
        super(player, "Mine", award, Characters.getObstaclesByName("Snake"), 5);
    }
    public static String randomAwardGenarator(){
        Random r = new Random();
        int prob =  r.nextInt(100)+1;
        int toolProb = r.nextInt(100)+1;
        if( prob <=15 ){
            // Silahlar
            if(toolProb <= 20){
                return Weapons.getWeaponsByID(3).getName();
            }
            else if(toolProb <= 50){
                return Weapons.getWeaponsByID(2).getName();
            }
            else{
                return Weapons.getWeaponsByID(1).getName();
            }
        }
        else if(prob <= 30){
            // Zırhlar
            if(toolProb <= 20){
                return Weapons.getWeaponsByID(3).getName();
            }
            else if(toolProb <= 50){
                return Weapons.getWeaponsByID(3).getName();
            }
            else{
                return Weapons.getWeaponsByID(1).getName();
            }
        }
        else if(prob <= 55){
            // Para
            if(toolProb <= 20){
                return "10" ;
            }
            else if(toolProb <= 50){
                return "5";
            }
            else{
                return "1";
            }
        }
        else {
            return "Empty" ;
        }
    }

}
