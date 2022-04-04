package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class choosePet {
    private Scanner scanner = new Scanner(System.in);
    private int choiceMaker;

    public ArrayList<Talkable> chosenPet()
    {
        ArrayList<Talkable> theList = new ArrayList<Talkable>();
        for(int i = 1; i <= 3; i++)
        {
            choiceMaker = petChoice();
            if(choiceMaker == 1)
            {
                theList.add(new Cat(miceKilled(), petName()));
            }
            else
            {
                theList.add(new Dog(isDogFriendly(), petName()));
            }
        }
        return theList;
    }

    private int petChoice(){
        System.out.print("Do you want a cat(input 1) or a dog(input 2)?");
        int input = Integer.parseInt(scanner.nextLine());
        return input;
    }

    private String petName(){
        System.out.print("What is your pet's name?");
        String input = scanner.nextLine();
        return input;
    }

    private boolean isDogFriendly(){
        System.out.print("Your dog is friendly (1 for true/0 for false)?");
        int response = Integer.parseInt(scanner.nextLine());
        boolean input = (response == 1);
        return input;
    }

    private int miceKilled(){
        System.out.print("How many mice has your cat killed?");
        int input = Integer.parseInt(scanner.nextLine());
        return input;
    }
}
