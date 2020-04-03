package com.ricky.hangman;

import java.util.Arrays;

import java.util.List;
import java.util.Random;


public class Guess
{
    public static String userLetterGuess ="Y";
    public static String password;
    public static String categoryOfAnswer;


    public static String  setPassword()
    {
        List<String> cityPasswords = Arrays.asList("BUFFALO", "DENVER","KYOTO", "MADISON","DELHI",
                "BEIJING", "CHICAGO","BOSTON","DETROIT","AUSTIN","PARIS","BANGKOK","LONDON",
                "SEOUL","MILAN", "MADRID", "BALI", "DUBAI", "MIAMI", "BETHESDA", "MOSCOW", "JACKSON", "AUGUSTA", "BOISE");
        List<String> animalPasswords = Arrays.asList("JAGUAR", "LION", "PUMA", "CHEETAH", "BEAR",
                "WOLF", "HORSE", "BISON", "DOLPHIN", "EAGLE", "LOBSTER", "MONKEY", "DUCK", "RABBIT",
                "SPIDER", "TURKEY", "SNAKE", "SHARK", "CHICKEN");
        List<String> adjPasswords = Arrays.asList("JUMP", "SWIM", "ATTACK", "EXPLODE", "BUILD", "FOLLOW",
                "MANAGE", "LAUGH", "DANCE","DESTROY", "APPLY", "CONJURE", "ORDER", "PREPARE" ,"QUALIFY",
                "VACUUM", "PROMISE","FORGIVE");
        List<String> moviePasswords = Arrays.asList("FARGO", "BABE", "MEMENTO", "CRASH", "ROCKY",
                "BATMAN", "TRAFFIC", "JAWS","AIRHEADS", "ALADDIN",  "BAMBI", "CLICK", "DUMBO",
                "FROZEN", "GREASE", "HANCOCK", "JUNO", "POWDER", "SPEED", "RUDY", "TAKEN", "WANTED",
                "ARRIVAL", "MOANA", "JOKER");

        Random ran = new Random();
        int pickaList = ran.nextInt(4);
        if (pickaList ==0)
        {
            password = cityPasswords.get(ran.nextInt(cityPasswords.size()));
            categoryOfAnswer = "City";
        }
        else if (pickaList==1)
        {
            password =animalPasswords.get(ran.nextInt(animalPasswords.size()));
            categoryOfAnswer = "Animal";
        }
        else if (pickaList ==2)
        {
            password = adjPasswords.get(ran.nextInt(adjPasswords.size()));
            categoryOfAnswer = "Verb";
        }
        else
        {
            password = moviePasswords.get(ran.nextInt(adjPasswords.size()));
            categoryOfAnswer = "Movie";
        }
        return password;

    }

}


