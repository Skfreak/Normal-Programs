
//super class 


abstract class Player{

// common data-items

protected String name;
protected int age;

//default constructor


Player(){}

// overloaded constructor to assign name and age

Player(String n, int a){
name = n;
age = a;
}

// method to assign name and age

public void setPlayerInfo(String n, int a){
name = n;
age = a;
}

// method to print name and age

public void printPlayerInfo(){
System.out.println("Name: " + name + "\n Age:" +  age);
}



public void printInfo(){
System.out.println("Name: " + name + "\n Age:" +  age);
}

// abstract behavior, we do not know how player plays? we only know player plays!

abstract public void play(int n);


}


// subclass  Bowler "is a" player


class Bowler extends Player{

// extra data item special in Bowler

private int wickets;

Bowler(){}


// overloaded constructor 

/* before being an instance of subclass be an instance of super class
constructor of super class is required to be called using super() */


Bowler(String n, int a, int w){
super(n,a);
wickets += w;

}

// when bowler plays earn wickets


public void play( int n){
wickets += n;
}


// method to print all the information of bowler, call hidden method of super class 

public void printInfo(){
super.printInfo();	//to call hidden method printInfo()
this.printWickets();	//to print wickets
}


public void printWickets(){
System.out.println("Wickets : " + wickets);
}

}

class Batsman extends Player{

// extra data item special in Batsman

private int runs;


Batsman(){}


// overloaded constructor 

/* before being an instance of subclass be an instance of super class
constructor of super class is required to be called using super() */

Batsman(String n, int a, int r){
super(n,a);
runs += r;
}

// when batsman plays earn runs

public void play(int n){
runs += n;
}

public void printRuns(){
System.out.println("Runs : " + runs);
}

}


/*
create an application, create objects of batsman and bowler, assign them values and print their information.

*/

class CricketApp{

public static void main(String arg[]){

Player p; //reference of a super class

// Player p = new Player(); // not a vlaid line, Player is an abstract class, can't instantiate it

Batsman bt = new  Batsman(); // object of a subclass

bt.setPlayerInfo("Sachin", 40); //initaialize vlaues using method

bt.printPlayerInfo();// print the information

p=bt;// assign a role of batsman to selected player

p.play(34);// selected player is a Batsman, will score runs

bt.printRuns();

Bowler bl =  new Bowler();
bl.setPlayerInfo("Jadeja",30);
bl.printPlayerInfo();

p=bl;// assign a role of bowler to selected player

p.play(3);// selected player is a Bowler, will score wickets

bl.printWickets(); // p the reference of a super class can not call method printwickets() of a subclass

Batsman bt1 = new  Batsman("Dhoni",35,5678);//initialize vlaues using overloaded constructor

Bowler bl1 =  new Bowler("Ankit",30,23);

p=bt1;// assign a role of batsman to selected player

p.play(345);

p=bl1;// assign a role of bowler to selected player

p.play(5);

bt1.printPlayerInfo();// calling method of a superclass by suclass object bt1
bt1.printRuns(); // p the reference of a super class can not call method printruns() of a subclass

//single method to print all the information, 

// here p is holding bl1, an object of a Bowler, a subclass

p.printInfo();// printInfo belongs to Bowler will be executed


// bl1=p; // not a valid line

/*
object of sub class can be assigned to reference of a super class 
but reverse is not true, Every Bowler is a Player,all the Players are not bowlers!
*/

/* If we declare an abstarct method in a class then class is required to be declared abstract but reverse is not true.

An abstract class may or may not have abstract methods!

An abstact class can't be instiated! How to use it? By extending it in other classes.
*/


}
}






