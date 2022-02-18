/*
  Pratik - Sayı Tahmin Oyunu
  Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
*/


import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int result = (int)(Math.random() * 100);
        
        int guess, numOfGuess = 0;
        
        System.out.println("You can make 5 guesses. Good Luck!");
        
        while (numOfGuess <= 5) {
            System.out.print("Enter a number in range of 0 and 100: ");
            guess = input.nextInt();
            
            if (guess == result) {
                System.out.print("YOU WIN!!!");
                break;
            } else {
                numOfGuess +=1;
                if (4 < numOfGuess) {
                System.out.println("Sorry, GAME OVER!!!");
                break;
                }
                System.out.println("Please try again!");
                if (result < guess) {
                    if (result <= (guess - 5)) {
                        System.out.println("Reduce your guess by 5 or more!");
                    } else {
                        System.out.println("Reduce your guess by 5 or less!");
                    }
                } else if (guess < result) {
                    if ((guess + 5) < result) {
                        System.out.println("Increase your guess by 5 or more!");
                    } else {
                        System.out.println("Increase your guess by 5 or less!");
                    }
                }
            }
        }
    }
}

