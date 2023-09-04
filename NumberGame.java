import java.util.Random;
import java.util.Scanner;



class Game {
    public int number;
    public int inputNumber;
    public int NoOfGuesses=0;

    public int getNoOfGuesses(){
        return NoOfGuesses;
    }
    public void SetNoOfGuesses(int NoOfGuesses){
        this.NoOfGuesses =NoOfGuesses;
    }
    Game(){
        Random rand=new Random();
        this.number=rand.nextInt( 100);
    }
    void TakeUserInput(){
        System.out.println("Guess the Number");
        Scanner sc =new Scanner(System.in);
        inputNumber =sc.nextInt();

    }
    boolean isCorrectNumber(){
        NoOfGuesses ++;
        if (inputNumber ==number){
            System.out.format("Yes you guessed it right,it was %d\nYou guessed it in %d attempt",number,NoOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("the no is too low....");
        }
        else if(inputNumber>number){
            System.out.println(" the no is too high.....");  
        }
        return false;
        
    }
}
public class NumberGame{
    public static void main(String[]args) {
        Game g =new Game();
        boolean b =false;
        while(!b){
            g.TakeUserInput();
            b =g.isCorrectNumber();
        }
}
}
