import java.util.Scanner;
public class Currency_Converter {
    public static void main(String []args){
        System.out.print("1.Rupees\n2.Dollars\n3.Euro\n4.Dirham\n5.Yen\n6.Stop the Program\n");
        Scanner in=new Scanner(System.in);
        int flag=1;
        do{
          System.out.println("Enter Your Choice");
          int choice;
          double amt,dollars,rupees,euro,dirham,yen;
          choice=in.nextInt();
         switch (choice) {
           case 1:
              System.out.println("Enter the amount in Rupees:\n");
              amt=in.nextDouble();
              if(amt>=0){
               dollars=amt/83.40245;
               euro=amt/89.194748;
               dirham=amt/22.683533;
               yen=amt/0.536227;
               System.out.printf("Dollars %.3f\nEuro    %.3f\nDirham  %.3f\nYen     %.3f\n\n",dollars,euro,dirham,yen);
              }
              else System.out.println("Invalid Amount");
              break;

            case 2:
              System.out.println("Enter the amount in USD:\n");
              amt=in.nextDouble();
              if(amt>=0){
               rupees=amt*83.40245;
               euro=amt*0.932876;
               dirham=amt*3.6729;
               yen=amt*158.095;
               System.out.printf("Rupees  %.3f\nEuro    %.3f\nDirham  %.3f\nYen     %.3f\n\n",rupees,euro,dirham,yen);
              }
              else System.out.println("Invalid Amount");
              break;
            
            case 3:
              System.out.println("Enter the amount in Euro:\n");
              amt=in.nextDouble();
              if(amt>=0){
               dollars=amt/0.93506;
               rupees=amt*89.194748;
               dirham=amt* 3.927983;
               yen=amt*169.478;
               System.out.printf("Dollars  %.3f\nRupees   %.3f\nDirham   %.3f\nYen      %.3f\n\n",dollars,rupees,dirham,yen);
              }
              else System.out.println("Invalid Amount");
              break;
            
            case 4:
              System.out.println("Enter the amount in Dirham:\n");
              amt=in.nextDouble();
              if(amt>=0){
               dollars=amt/3.6729;
               rupees=amt*22.683533;
               euro=amt/3.927983;
               yen=amt*43.045;
               System.out.printf("Dollars  %.3f\nRupees   %.3f\nEuro     %.3f\nYen      %.3f\n\n",dollars,rupees,euro,yen);
              }
              else System.out.println("Invalid Amount");
              break;

            case 5:
              System.out.println("Enter the amount in Yen:\n");
              amt=in.nextDouble();
              if(amt>=0){
               dollars=amt/158.095;
               rupees=amt*0.536227;
               euro=amt/169.478;
               dirham=amt/43.045;
               System.out.printf("Dollars  %.3f\nRupees   %.3f\nEuro     %.3f\nDirham   %.3f\n\n",dollars,rupees,euro,dirham);
              }
              else System.out.println("Invalid Amount");
              break;
            
            default:
              System.out.println("Invalid Choice");  
              flag=0;
              break;
         }
        }while(flag==1);

    }
}