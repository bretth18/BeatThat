import javax.swing.JOptionPane;
import java.util.Random;


public class ComputerPlayer{
    private String name;
    private int runningScore;
    private int dice1;
    private int dice2;
    private int rollScore = 0;
    
    ComputerPlayer (String computerName) {
        name = computerName;
        runningScore = 0;
    }
    public void setName(String computerName) {
        name = computerName;
    }
    public String getName(){
        return name;
    }
    public void setRunningScore(int computerScore){
        runningScore = computerScore;
    }
    public int getRunningScore() {
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
        Random r = new Random();
        dice1 = r.nextInt(6)+1;
        dice2 = r.nextInt(6)+1;
        if (dice1 > dice2) {
            rollScore = 10*dice1 + dice2;
            runningScore = runningScore + rollScore;
        }
        else{
            rollScore = dice1 + 10*dice2;
            runningScore = runningScore + rollScore;
        }
    }
}
    
    
    
    
    
    
    
    
