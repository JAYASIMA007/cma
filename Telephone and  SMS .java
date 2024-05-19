import  java.util.Scanner;

public class TelephoneAndSMSApp { 
  public  static  void  main(String[]  args)  {
     Scanner  scanner  =  new  Scanner(System.in);
    
        System.out.println("Telephone and SMS Application"); 
        System.out.println("=============================");
    
        while  (true)  {
          System.out.println("\nPlease  select  an  option:"); 
          System.out.println("1. Make a phone call"); 
          System.out.println("2. Send an SMS"); 
          System.out.println("3. Exit");
          
          int  option  =  scanner.nextInt();
          scanner.nextLine();  
          
          switch  (option)  { 
            case 1:
              System.out.print("Enter  the  phone  number:  "); 
              String phoneNumber = scanner.nextLine(); 
              makePhoneCall(phoneNumber);
              break; 
            case 2:
              System.out.print("Enter  the  phone  number:  "); 
              phoneNumber = scanner.nextLine(); 
              System.out.print("Enter the message: "); 
              String message = scanner.nextLine(); 
              sendSMS(phoneNumber, message);
              break; 
            case  3:
              System.out.println("Exiting..."); 
              return;
            default:
              System.out.println("Invalid option. Please try again.");
       }
   }
}
  
 private  static  void  makePhoneCall(String  phoneNumber)  { 
    System.out.println("Calling " + phoneNumber + "...");
   
}
  
 private static void sendSMS(String phoneNumber, String message) { 
    System.out.println("Sending  SMS  to "  +  phoneNumber  +  ":  "  +  message);
  }
} 
