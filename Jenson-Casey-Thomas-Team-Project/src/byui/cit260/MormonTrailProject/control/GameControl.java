/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.control;

import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.model.Map;
import byui.cit260.MormonTrailProject.model.Player;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author tcasey
 */
public class GameControl {

    private static Player player;

    public static Player createPlayer(String playerName) {
        Player player = new Player();
        player.setName(playerName);
        return player;

    }

    public static boolean savePlayer(String name) {

        if (playerName.length() < 2) {

            return false;
        }

        BYUICIT260MormonTrailProject.setPlayer(player);

        return true;
    }

    public static void generalStoreMenuView(Player player) {

    }

    public void dailyMiles() {
        int distance = PlayControl.calcDistanceTravelDay(BYUICIT260MormonTrailProject.getCurrentGame().getPace().ordinal());
        BYUICIT260MormonTrailProject.getCurrentGame().addMilesTraveled(distance);
    }

    public static int createNewGame(Player player) {
        if (player == null) {
            return -1;
        }
        Game game = new Game();
        game.setPlayer(player);
        BYUICIT260MormonTrailProject.setCurrentGame(game);
        
        private static Actor [] createActorList() {
            Actor[] actor = new Actor[];
        }
        //actors = new Actors();
        //Save the list of actors in the Game object
        //Assign an actor the player
                
        public static InventoryItem[] createItems(){
            System.out.println("InventoryItem[] called");
        }
        
                
        public static Map createMap(int noOfRows, int noOfColumns){
            if (map == null){
                return -1;
            }
            
                return 1;
        }

    private static class InventoryItem {

        public InventoryItem() {
        }
    }
        
        
    }
    
    public static void createItems(Player player) {
        
    }

    public static void loadGame(Player player) {

    }

    public static void saveGame(Player player) {

    }

    public static void getHelp(Player player) {

    }

    public static void riverCrossing(Player player) {

    }

    public static void riverCrossingSceneMenuView(Player player) {

    }

    public static void riverCrossingView(Player player) {

    }

    public static void DailyTrailStopSceneMenuView(Player player) {

    }

    public static void GameMenuView(Player player) {

    }

    public static void getVegetablesView(Player player) {

    }
    
    public static void gatheringSuccessMenuView(Player player) {

    }
    
    public static void goHuntingView(Player player) {

    }
    
    public static void goHuntingSceneMenuView(Player player) {

    }
    
    public static void handleObstacleView(Player player){

    }
}
 
