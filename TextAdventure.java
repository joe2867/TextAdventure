import java.util.*;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Chara", 100, 0);
  }

  public void play()
  {
    String input;
    // start of adventure. You can change this if you like
    console.setImage("Chara.png");
    // ask the user for their name.
    System.out.println("Name the brat\n");
    input = inScanner.nextLine();
    ourHero.changeName(input);
    console.setImage("forest.jpg");
    // Change ourHero's name
    // ADD CODE HERE
    
    // describe the starting situation. Feel free to change this
    System.out.println("You wake up to find yourself on the edge of a shadowy forest with the sun nearly set. \nYou see what looks like a city in the distance. \nWhat would you like to do? \ncity: go towards the city\nforest: turn around and re-enter the forest\nnap: go back to sleep\n" + ourHero.getName() + ": ");
    input = inScanner.nextLine();
    if(input.equals("city")){
      enterZone1();
    }else if(input.equals("forest")){
      enterZone2();
    }else if(input.equals("nap")){
      enterZone4();
    }else{
      System.out.println("With so many possibilties you decide the best course of action is to jump into a hole in a random mountain and start killing as many monsters as you can find");
      for(int i = 0; i < 105; i ++){
        ourHero.defeatMonster();
      }
      console.setImage("Charac.png");
      System.out.println(":)");
      gameEnd();
    }
    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE

  }

  private void enterZone1()
  {
    console.setImage("mountains.jpg");
    System.out.println("As you make your way to the city you end up taversing mountains. as you close your way to the the\n top of the mountain for a better view but a thunderstom is approching\n on your left you see an open cave you might be able to seek shelter in or you can pull out an umbrella\n what would you like to do?\n cave: stay a night in a cave\n umbrella: pull your ubrella in the middle of a thunderstorm\n" + ourHero.getName() + ": ");
    String i = inScanner.nextLine();
    if(i.equals( "cave")){
      System.out.println("You enter the cave to wait out the storm");
      console.setImage("cave.jpg");
      System.out.println("You hear a noise do you decide to investigate\nyes:\n" + ourHero.getName() + ": ");
      i = inScanner.nextLine();
      if(i.equals("yes")){
        System.out.println("You've been ambushed by the cave bozo What do you do\n fight;\n   ¯]_(ツ)_[¯:\n" + ourHero.getName() + ": ");
        console.setImage("enemy1.jpg");
        i = inScanner.nextLine();
        if(i.equals("fight")){
          System.out.println("You poke the enemy with your knife\nYOU WON!\ngained 150 exp");
          ourHero.defeatMonster();
          System.out.println("After whatever that was you decide to leave the cave to continue to the city");
          i = inScanner.nextLine();
          enterZone3();
        }else{
          System.out.println("You stare at the cave bozo.\nit stares back you... MENACINGLY\nGame over");
        }
      }else{
        System.out.println("You decide not to investigate and leave the cave the continue on your quest to the lost city of polutica");
        enterZone3();
      }
    }else if(i.equals("umbrella")){
      System.out.println("You pull out your umbrella and hold it over your head... Lightning immeditly strikes you");
      gameEnd();
    }else{
      System.out.println("While pondering whether to seek shelter from the weather rain starts pouring and slides you down the mountain leading to the forest");
      enterZone2();
    }
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  }

  private void enterZone2()
  {
    // change image
    console.setImage("forest.jpg");
    System.out.println("As you enter the forest you see nothing but trees and can only hear unknown animal like noises");
    System.out.println("As you make your way to what looks like and exit you're suddenly blocked by a tall figure\n\"Hello " +ourHero.getName() + ". Did you think I was just gonna let you leave this forest? Well to be fair you probobly didn't even know I was here\"\n\"You really want to know why\"");
    String f = inScanner.nextLine();
    System.out.println("\"I remeber the candy bar wrapper you forgot to throw out when you where three\"");
    f = inScanner.nextLine();
    console.setImage("bossf.png");
    System.out.println("\"Time for some eco warior justice\"\nCaptain planet wants to mess you up\n what will " + ourHero.getName() + " do\nsmack: slap this eco nutcase across the face\nact:\n" + ourHero.getName() + ": ");
    f = inScanner.nextLine();
    if(f.equals("smack")){
      System.out.println("\"OW my jaw line! Don't you know how long it takes to get ready everyday. now I got to do my makeup again");
      System.out.println("YOU WON?\ngained 0 exp\nGame over");
      gameEnd();
    }else if(f.equals("act")){
      System.out.println("You dodge out of the way of captain planets charge attack\nOW this tree I rammed into really hurt my headfdfs. now if youll exscus escuse mre I think I'm just gonna lay here for a while\"\nYOU WON!\n gained 1000 exp\n Game over");
      ourHero.defeatMonster();
      gameEnd();
    }else{
      System.out.println("\"I can see you cowering at my mighty mightyness so I will let you off with a warning this time...\n But if you ever do this again I will kick your but\nSee ya\"\nYou feel slightly disapoitned that you didn't get to beat him up\n Game over");
    }

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone3()
  {
    console.setImage("city.jpg");
    System.out.println("You walk into the concrete jungle and notice a sign that says\n\"Welcome to Polutica the number 1 urban wastland\"\nin the center of some random park you see a really angry middle age woman standing next to a chest and decide for some reason to wak up to her");
    String c = inScanner.nextLine();
    System.out.println("The ugly woman notices you and says\n\"Your after the treasure I just found aren't you well now that wont do. I found this treasure for my sweet angle little timmy\"\nBehind the woman you can see a board with a wanted poster that reads\n\"WANTED \'Little timmy\" suspected to be involved in terrorism\"");
    System.out.println("The behemouth of a hag redirects your attention back to her\n\"EXUSE ME. DO YOU THINK THAT YOU CAN JUST IGNORE ME. WELL NO I SAY IT'S ABOUT TIME SOMEONE TEACHES YOU TO RESPECT MAH AUTHORITA\"\n");
    c = inScanner.nextLine();
    console.setImage("boss.jpg");
    System.out.println("\"I'M GONNA SPEAK TO YOUR MANAGER!!!\"\nThe overstimulated karen decides to assult you\n what will " + ourHero.getName() + " do\nfight:\nact:\nitem:\nmercy:\n" + ourHero.getName() + ": ");
    c = inScanner.nextLine();
    if(c.equals("fight")){
      System.out.println("You attempt to slash the entitled old hag but end up tripping face foward on a yellow flower\nGame over");
      gameEnd();
    }else if(c.equals("act")){
      System.out.println("You attemtp to challenge the karen to a dance off only for her to pull a taser out of her purse and tase you\nGame over");
      gameEnd();
    }else if(c.equals("item")){
      System.out.println("You pull a bomb out of your back pocket and throw it at the karen.");
      System.out.println("YOU WON\nGained 500 exp");
      ourHero.defeatMonster();
      c = inScanner.nextLine();
      System.out.println("As you open up the chest and look in you see the treasure that you wasted an entire day looking for");
      c = inScanner.nextLine();
      console.setImage("treasure.png");
      System.out.println("The limited endition WEEGEE trophy\nit proboly could sell for 40 dollars on ebay\nGame over");
      gameEnd();
    }else if(c.equals("mercy")){
      System.out.println("You spare the karen.\n\"ARE YOU THREATENING ME!?\"\nThe karen chooses violence and punts you like a football\nGame over");
      gameEnd();
    }else{
      System.out.println("You stare blankly at the karen\n She see's this as a challenge and pokes you in the eyes");
      gameEnd();
    }

    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone4()
  {
    System.out.println("You decide to take a nap in this unknown area\ntrusting that a random animal wont come and attack to you fall asleep");
    console.setImage("dream1.jpg");
    System.out.println("You look around to see a pink landscape\npink houses pink fields and some psycopath with a flame thrower running around... lovely\n suddenly some big human like figure comes towards you and says hello\nsay hello back?\n" + ourHero.getName() + ": ");
    String d = inScanner.nextLine();
    if((d != "hello") || (d != "yes")){
      System.out.println("YOU HAVE JUST VIOLATED RULE NUMBER ONE OF PYROLAND. NOT RETURNING A GREETING\n now time for punishment\n suddenly you see a metor coming straight at you\nGame over\n it's all in your head right?");
      gameEnd();
    }else{
      System.out.println("The big pink figure walks away satified.\n to your right you see a carosel and decide to walk over to it.\nthere are two unocupied seats lefts. one resembeling a dolphin and the other a horse\nwhich will " + ourHero.getName() + " chose\n" + ourHero.getName() + ": ");
      d = inScanner.nextLine();
      if(d.equals("horse")){
        System.out.println("as the carosell starts you can feel your body waking up");
        enterZone5();
      }else if(d.equals("dolphin")){
        System.out.println("as the carosell starts you can feel your body waking up");
        enterZone6();
      }else{
        System.out.println("while trying to make up your mind the ride seats become full and you are left with nothing\nGame over");
        gameEnd();
      }
    }

    
  }

  private void enterZone5()
  {
    console.setImage("plains.png");
    System.out.println("As you look around you see what looks like blockey houses and what looks like squidwards long lost cousin\nas you are taking in your surroundings you feel a tap on your shoulder");
    String p = inScanner.nextLine();
    System.out.println("PUNCH!");
    p = inScanner.nextLine();
    console.setImage("boss2.png");
    System.out.println("\"I AM STEVE\"...\nok buddy\nwhat will " + ourHero.getName() + "do:\nmock:this is just jack blakc in a blue shirt\nfight:\n" + ourHero.getName() + ": ");
    p = inScanner.nextLine();
    if(p != "mock"){
      System.out.println("\"Steve\" throws an ugly cgi sheep at you\n you end up exlpoding from cringe\ngame over\nugly sonic 2.0 am I right lads or am I right lads");
      gameEnd();
    }else{
      System.out.print("You can't stop laughing at how bad of a steve costume this is\n\"hey my multibillion dollar corporation is trying its best. you didn't need to be so rude\"\n\"Steve\" goes off to cry in shame\nGame over");
      ourHero.defeatMonster();
      gameEnd();
    }
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone6()
  {
    console.setImage("ocean.jpg");
    System.out.println("You end up waking up on a raft in some ocean\nYou spot a fishing poll next to you\nDo you want to fish\n" + ourHero.getName() + ": ");
    String o = inScanner.nextLine();
    if(o != "yes"){
      System.out.println("Why\nGame over");
      gameEnd();
    }else{
      int m =(int) ((Math.random() * 3) + 1);
      if(m != 3){
        System.out.println("An aquatic monster jumps out at you\nYou quickly doged at defeated it");
        ourHero.defeatMonster();
        gameEnd();
      }else{
        System.out.println("As the raft pulls up to shore you realized you caught nothing while you were out there\nGame over");
        gameEnd();
      }
    }
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void gameEnd()
  {
    // ADD CODE HERE

    inScanner.close();
    System.out.print("Enemys defeated: " + ourHero.getMonstersDefeated());
  }
}