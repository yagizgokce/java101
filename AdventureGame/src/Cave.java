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