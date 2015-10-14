import javax.swing.JOptionPane;
import java.util.Random;

public class BeatThatWhile{
    
    public static void main (String args[]){
        String tempName = JOptionPane.showInputDialog("Enter name of Human Player:");
        HumanPlayer humanPlayer = new HumanPlayer(tempName);
        tempName = JOptionPane.showInputDialog("Enter name of Computer Player:");
        ComputerPlayer computerPlayer = new ComputerPlayer(tempName);
        int rounds = Integer.parseInt(JOptionPane.showInputDialog
            ("Enter number of rounds:"));;
        
        int round = 1;
        while (round <= rounds) {
            humanPlayer.rollDice();
            computerPlayer.rollDice();
            JOptionPane.showMessageDialog(null, "RESULTS OF ROUND" + round + ".\n"
                +"Human player" + humanPlayer.getName() + "rolled"
                + humanPlayer.getDice1() + "and" + humanPlayer.getDice2()
                +"\nfor a roll score of" + humanPlayer.getRollScore()
                + " and a current total score of" + humanPlayer.getRunningScore()
                + "\n\nComputer player" + computerPlayer.getName() + "rolled"
                + computerPlayer.getDice1() + "and" + computerPlayer.getDice2()
                + "\nfor a roll score of " + computerPlayer.getRollScore()
                + " and a current total score of " + computerPlayer.getRunningScore());
            round++;
        }
        if (humanPlayer.getRunningScore() > computerPlayer.getRunningScore()) {
            JOptionPane.showMessageDialog(null, "GAME OVER! HUMAN WINS!\n"
                +humanPlayer.getName() + ": " + humanPlayer.getRunningScore() + "\n"
                +computerPlayer.getName() + ": " + computerPlayer.getRunningScore());
            }
        else if (computerPlayer.getRunningScore() > humanPlayer.getRunningScore()) {
            JOptionPane.showMessageDialog(null, "GAME OVER! COMPUTER WINS!\n"
                +computerPlayer.getName() + ": " + computerPlayer.getRunningScore() + "\n"
                +humanPlayer.getName() + ": " + humanPlayer.getRunningScore());
            }
        else {
            JOptionPane.showMessageDialog(null, "GAME OVER! HUMAN AND COMPUTER TIE!\n"
                + humanPlayer.getName() + ": " + humanPlayer.getRunningScore() + "\n"
                + computerPlayer.getName() + ": " + computerPlayer.getRunningScore());
            }
            
            
        
        }
}


