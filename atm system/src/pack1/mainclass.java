package pack1;

import java.util.Scanner;

public class mainclass {
     public static void main (String[] args){
         atmoperationinter op=new atmoperationimpl();
         int atmnumber=12345;
         int atmpin=123;
         Scanner in=new Scanner(System.in);
         System.out.print("welcome to atm machine .!!!\n");

         System.out.print("enter atm number: ");
         int atmNumber=in.nextInt();
         System.out.print("enyer pin: ");
         int pin =in.nextInt();
         if((atmnumber==atmnumber)&&(atmpin==pin)) {
             while(true) {
                 System.out.println("1.view Available Balance\n2.withdraw Amount\n3.deposit amount\n4.view ministatement\n5.exit");
             System.out.println("enter choice");
             int ch=in.nextInt();
             if(ch==1){
 op.viewBalance();
             }
             else if(ch==2){
System.out.println("enter amount to withdraw");
double withdrawAmount=in.nextDouble();
op.withdrawAmount(withdrawAmount);

             }else if(ch==3){
System.out.println("enter amount to deposit:");
double depositAmount=in.nextDouble();
op.depositAmount(depositAmount);
                 }
             else if(ch==4){

                 }
             else if(ch==5){
System.out.println("collect your atm card\n thank you");
System.exit(0);
                 }
             }
         }
         else{
             System.out.println("incorrect choice");
             System.exit(0);
         }
     }
}
