/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;


/**
 *
 * @author Llauderes Account
 */

import java.util.Scanner;
public class sampleQuiz {
    String questions[]={"It is a Multiplayer Online Battle Arena ( MOBA ) game. It is produced and printed by Shanghai Moonton Technology in Shanghai , China.",
                        "What's the max number of marks Brody can stack on an enemy?",
                        "Which of the following heroes doesn't have a animal companion?",
                        "Where does Mobile Legends BangBang's heroes fight?",
                        "How a Noob/AFK players be punished?" };
    String choices[][]={{"A. League of Legends",
                        "B. Mobile Legends : Bang Bang",
                        "C. DOTA : Defense of the Ancient"},
                        {"A. 6",
                        "B. 4",
                        "C. 10"},
                        {"A. Lapu-Lapu.",
                        "B. Roger.",
                        "C. Popol and Kupa."},
                        {"A. Land of Dawn.",
                        "B. Land of Storms.",
                        "C. Light of Dawn."},
                        {"A. They will lose gold.",
                        "B. I don't know because I'm noob.",
                        "C. Their Credit Score will go down."},
                        };
    char answer[]={'b', 'b', 'c', 'a', 'c'};
    int score=0;
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        sampleQuiz game = new sampleQuiz();
        int items=5;
        
        for(int i=0; i<items; i++){
            game.loadQuestion(i);
            System.out.print("Select your Answer: ");
            String option = in.next();
            game.validateAnswer(i, option);
        }
        System.out.println("\n=====Your Total SCORE: " + game.score);
        
    }
    public void loadQuestion(int num){
        System.out.println((num+1) + ". " + questions[num]);
        for(int i=0; i<3; i++){
            System.out.println("\t" + choices[num][i]);
        }
    }
    public void validateAnswer(int num, String ans){
        if(ans.length() != 1){
            System.out.println("---> Incorrect.");
        } else{
            char pick = Character.toLowerCase(ans.charAt(0));
            if(pick == answer[num]){
                System.out.println("---> Correct.");
                score++;
            } else {
                System.out.println("---> Incorrect.");
            }
        }
        
    }
}
