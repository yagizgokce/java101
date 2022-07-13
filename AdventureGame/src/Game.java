import java.util.Scanner;
public class Game {
    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Welcome ");
        System.out.print("Please Enter Name: ");
        String playerName = input.nextLine().toUpperCase();
        Player player = new Player(playerName);
        System.out.println("Are you ready " + player.getName());
        player.selectHero();
        Location location = null;
        while (true){
            System.out.println("\n######Locations######");
            System.out.println("Select Location \n1- Safe House \n2- Tool Store \n3- Cave \n4- Forrest \n5- River \n0- Exit Game");
            int selectLoc = input.nextInt();
            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHome(player);
                    break;
                case 2:
                    location =  new ToolStore(player);
                    break;
                case 3:
                    if(!player.getInventory().isAward("Food")) {
                        location = new Cave(player);
                        break;
                    }else{
                        System.out.println("\nYou cannot go Cave anymore");
                        selectLoc = input.nextInt();
                    }
                case 4:
                    if(!player.getInventory().isAward("Firewood")) {
                        location = new Forrest(player);
                        break;
                    }else{
                        System.out.println("\nYou cannot go Forrest anymore");
                        selectLoc = input.nextInt();
                    }
                case 5:
                    if(!player.getInventory().isAward("Water")) {
                        location = new River(player);
                        break;
                    }else{
                        System.out.println("\nYou cannot go River anymore");
                        selectLoc = input.nextInt();
                    }
                default:
                    System.out.println("Please Enter Valid Value");

            }
            if (location == null){
                System.out.println("\nYou Gave Up ");
                break;
            }
            if(!location.onLocation()){
                System.out.println("Game Over");
                break;
            }
        }


    }
}
