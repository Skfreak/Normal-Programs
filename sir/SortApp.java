import java.util.*;


class  Friend{

private String name;
private DOB dt;

public void setName(String n){
name=n;
}

public void setDOB(int d,int m, int y){
dt = new DOB(d,m,y);
}

public void showFriend(){
System.out.println("Name :" + name +"\n" + "DOB : "+ dt.getDob());
}

//returns an object as a DOB
public DOB getDOB(){return dt;}


}

class DOB{
private int dy;
private int mn;
private int yr;

//over loaded constructor 


DOB(int d, int m, int y){dy=d;mn=m;yr=y;}

public int getYear(){ return yr;}
public int getMonth(){ return mn;}
public int getDay(){ return dy;}

public String getDob(){
return(dy+" : "+ mn + " : " + yr);
}

boolean isSmaller(DOB db){

if(this.getYear() < db.getYear()){
return true;	
}
else if (this.getYear() == db.getYear() && this.getMonth() < db.getMonth() ){
return true;		
}else if (this.getYear() == db.getYear() && this.getMonth() == db.getMonth() && this.getDay() <= db.getDay() ){
return true;		
}else return false;
 
}
}


class SortApp{

public static void main(String args[]){

// to read from keyboard

Scanner in = new Scanner(System.in);

// cretae an array to stor the information of 5 friends 

Friend fs[] = new  Friend[5];


// read the names and date of birth of 5 friends 

for(int i= 0; i<5;i++){
Friend f = new Friend();
System.out.println("Enter the name of your friend");
String n = in.next();
f.setName(n);
System.out.println("Enter the date of birth of your friend");
int d = in.nextInt();
int m = in.nextInt();
int y = in.nextInt();
f.setDOB(d,m,y);
//save the object f in an array fs[]
fs[i]=f;
}

//print the information

for(int i= 0; i<5;i++){
fs[i].showFriend();
}

// code to sort an array fs[] according to date of birth

for(int i = 0; i<5; i++){
for(int j = i+1; j<5;j++){
if(fs[i].getDOB().isSmaller(fs[j].getDOB())){
	Friend f  = new  Friend();
	f=fs[i];
	fs[i]=fs[j];
	fs[j]=f;
}
 
}
}

//print the sorted array

System.out.println("Ordered list");

for(int i= 0; i<5;i++){
fs[i].showFriend();
}

}

}
