import java.util.Scanner;
class facto{
public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
System.out.print("Enter an integer: ");
 int n=scanner.nextInt();
 long fac=1;
 if(n==0){
    System.out.println(fac);
 }
else{
      for(int i=1;i<=n;i++){
  fac*=i;
}
System.out.println(fac);
}
}
}