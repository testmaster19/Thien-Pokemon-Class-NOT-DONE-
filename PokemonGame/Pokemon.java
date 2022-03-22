package PokemonGame;
import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;



/*
Instance fields - characteristics of your Pokemon (e.g., Name, moves, health, …) WORK IN PROGRESS
Constructors - ways to construct your Pokemon (overloaded constructors?) DONE
Methods - what your Pokemon can do (functionality - e.g., train, “get” and “set” methods) Work in progress
*/
public class Pokemon {
// Pokemon Animal = new Pokemon("Thien",100,100,50,30);

  //privates variaables here
  private String Name;
  private int Health; 
  private int ATTACK;
  private int DEFENSE; 
  //private String Conditioning; //decision string in Main.java "Y" || "N"

  //Private Modes
  //private boolean BattleMode; //true or false battlemode
  //+===============================================+
  //String BattleOn = "y";

  //methods constructors here
  public Pokemon (String name, int health, int attack, int defense) {
    Name = name;
    Health = health;
    ATTACK = attack;
    DEFENSE = defense;
    //Conditioning = decision;
    //User if Statement if user would like to battle (If Yes toggle Off, else toggle On)
    // if (BattleOn.equals(Conditioning)) {
    //   System.out.println("You are in Battle Mode~!");
    //   BattleMode = true;
    // } else {
    //   BattleMode = false;
    // }
  }
  

  // public String toString()
  // {
  //   return Name + "\n\t" + Health + "\n\t" +ATTACK + "\n\t" + DEFENSE;
  // }

  //mutator
  public void setName(String name) {
    Name = name;
  }

  //Accessor
  public String getName() {
    return Name;
  }
  
  // In Current Battle mode (ON)
  public void setHealth(int health) {
    //If statement for battle health???
    //set Health = 100
    // if (health > 0) {
    //   Health = 100;
    // } else {
    //   Health = 0;
    // }
    
  }
  

  public int getHealth() {
    return Health;
  }


  public void setAtt(int attack) {

  }

  public int getAtt() {
    return ATTACK;
  }

  public void setDef(int defense) {
   
  }

  public int getDEF() {
    return DEFENSE;
  }



  //Battle Mode
  // Returns true if battlemode is in service, false if it is not.
  // public boolean isinBattleMode(){
  //   //returns false
  //   return battlemode;
  // }

  // public void toggleBattle() {
  //   battlemode =!battlemode;
  // }


 //get stats
 public void getStats() {
   System.out.println("Pokemon Name: " + Name);
   System.out.println("Health: " + Health);
   System.out.println("Attack: "+ ATTACK);
   System.out.println("Defense: "+ DEFENSE);
 }

}