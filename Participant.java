class Participant{
String name;
int roll;
Participant(String n,int j){
name=n;
roll=j;
}
public String toString(){
return "Name: "+name+" Roll: "+roll;
}
public static void main(String[] args){
 Participant s1= new Participant("Vallabh",12);
 System.out.println(s1);
 System.out.println(s1.toString());
}
}