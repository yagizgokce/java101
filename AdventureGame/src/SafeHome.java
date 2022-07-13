public class SafeHome extends Location{
    public SafeHome(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are at Safe House");
        System.out.println("Your health is "+ getPlayer().getHealth());
        System.out.println("You are healing now");
        healPlayer();
        System.out.println("Your health is "+ getPlayer().getHealth());
        return true;
    }
    public void healPlayer(){
        String hero = getPlayer().getHeroName();
        for(Heros h: Heros.heros()){
            if(h.getHeroName() == hero){
                getPlayer().setHealth(h.getHealth());
            }
        }
    }
}
