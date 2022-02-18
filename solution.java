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
        
        int guess;
        
        
        while (true) {
            System.out.print("Enter a number in range of 0 and 100: ");
            guess = input.nextInt();
            
            if (guess == result) {
                System.out.print("YOU WIN!!!");
                break;
            } else {
                System.out.print("Please try again!");
            }
        }
    }
}
