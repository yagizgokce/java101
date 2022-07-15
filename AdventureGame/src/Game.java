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
        boolean action = true;
        while (action){
            System.out.println("\n######Locations######");
            System.out.println("Select Location \n1- Safe House \n2- Tool Store \n3- Cave \n4- Forrest \n5- River \n6- Mine \n0- Exit Game ");
            int selectLoc = input.nextInt();
            switch (selectLoc){
                case 0:
                    System.out.println("\nYou Gave Up ");
                    location = null;
                    action = false;
                    break;
                case 1:
                    location = new SafeHome(player);
                    break;
                case 2:
                    location =  new ToolStore(player);
                    break;
                case 3:
                    if (player.getInventory().isAward("Food")){
                        System.out.println("You cannot go Cave anymore");
                        location = null;
                    }else{
                        location = new Cave(player);
                    }
                    break;
                case 4:
                    if(player.getInventory().isAward("Firewood")){
                        System.out.println("You cannot go Forrest anymore");
                        location = null;
                    }else{
                        location = new Forrest(player);
                    }
                    break;
                case 5:
                    if(player.getInventory().isAward("Water")){
                        System.out.println("You cannot go River anymore");
                        location = null;
                    }else{
                        location = new River(player);
                    }
                    break;
                case 6:
                    location = new Mine(player,Mine.randomAwardGenarator());
                    break;
                default:
                    System.out.println("Please Enter Valid Value");

            }
            if(location!= null && location.getName().equals("Safe House") && player.getInventory().checkAwards() ){
                System.out.println("\nWin");
                player.printPlayerInfo();
                break;
            }
            if(location!= null && !location.onLocation()){
                System.out.println("Game Over");
                break;
            }
        }


    }
}
