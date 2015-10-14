import javax.swing.JOptionPane;

public class HumanPlayer {
     private String name;
     private int runningScore = 0;
     private int dice1;
     private int dice2;
     private int rollScore = 0;
     
     HumanPlayer (String playerName){
         name = playerName;
         runningScore = 0;
        }
     public void setName(String playerName){
         name = playerName;
        }
     public String getName (){
         return name;
        }
     public void setRunningScore(int playerScore){
         runningScore = playerScore;
        }
     public int getRunningScore(){
         return runningScore;
        }
     public int getDice1(){
         return dice1;
        }
     public int getDice2(){
         return dice2;
        }
     public int getRollScore(){
         return rollScore;
        }
     
     public void rollDice(){
         JOptionPane.showMessageDialog(null, "Please roll the dice, " + name);
         dice1= Integer.parseInt(JOptionPane.showInputDialog(
                "Please enter the larger of the two dice values, " + name));
         dice2= Integer.parseInt(JOptionPane.showInputDialog(
                "Please enter the smaller of the two dice values, " + name));
         rollScore = 10*dice1 + dice2;
         runningScore = runningScore + rollScore;
         
        }
    }
         

        
        
        
        
        
   