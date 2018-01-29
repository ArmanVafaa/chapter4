package Chapter4;

import java.util.Scanner;

public class Chapter4 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a Letter");
        String myChar = input.next();

        if(Character.isLetter(myChar.charAt(0))) {




            switch (myChar.charAt(0)) {
                case 'a':
                    System.out.println(myChar + " is a vowel");
                    break;
                case 'A':
                    System.out.println(myChar + " is a vowel");
                    break;
                case 'e':
                    System.out.println(myChar + " is a vowel");
                    break;
                case 'E':
                    System.out.println(myChar + " is a vowel");
                    break;
                case 'i':
                    System.out.println(myChar + " is a vowel");
                    break;
                case 'I':
                    System.out.println(myChar + " is a vowel");
                    break;
                case 'u':
                    System.out.println(myChar + " is a vowel");
                    break;
                case 'U':
                    System.out.println(myChar + " is a vowel");
                    break;
                case 'o':
                    System.out.println(myChar + " is a vowel");
                    break;
                case 'O':
                    System.out.println(myChar + " is a vowel");
                    break;
                default:
                    System.out.println(myChar + " is a consonant");



            }
        }
        else
            System.out.println(myChar + " is not a letter");




    }
}
