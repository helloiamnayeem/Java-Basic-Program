/*  6. Suppose a software system excepts valid credentials from user to logged in to the system.
if the user inputs wrong password for 3 times, system will say that
"Your user has been temporary locked". Let the username: admin, password: admin@123  */
package arrayproblems;

import java.util.Scanner;

public class user_password_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String df_username = "admin";
        String df_password = "admin@123";
        
        
            System.out.println("Username: ");
            String username= sc.next();
            
        
            if(username.equals(df_username))
            {
                int flag=0;
                int i=0;
                while(i<3)
                {
                    System.out.println("Password: ");
                    String password=sc.next();
                    
                    if(password.equals(df_password))
                    {
                        System.out.println("welcome");
                        flag=1;
                        break;
                    }else
                    {
                        System.out.println("wrong password");
                    
                    }
                  
                  i++;
                }
                if(flag == 0)
                    System.out.println("your id has been temporarily locked");
            
            
            }else
                System.out.println("wrong username");
        
        
        
    
    }
    
}
