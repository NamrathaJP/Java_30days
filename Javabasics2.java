import java.util.Scanner;

//Input a String 
//Check if entered String is present in Array
//If present print Success else print Failure

public class Javabasics2 {
	public static String forif(String username,String user_array[]) {
		
		
		for (int i = 0;i<user_array.length;i++) {
        	//System.out.println(b[i]);
			
		if (user_array[i].equals(username)) {
        	System.out.println("hi");
            
        }
		
	}
		return "Success: ";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="Hello";
        String b[] = {"abcd", "asdf", "hello"};
        //check if 'a' is present 'b'
        for (int i = 0;i<b.length;i++) {
        	//System.out.println(b[i]);
        	
		if (b[i].equals(a)) {
        	System.out.println("Success: " +b[i]);
       
        
        }
		//else {
        	//System.out.println("Failure");
       
        //}
	}
        //Input string from user
      
        System.out.println("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Your username is "+username);
        for(int i=0; i<b.length;i++) {
        	//System.out.println(b[i]);
	        if (b[i].equalsIgnoreCase(username)) {
	        	System.out.println("Success");
        	}
        	
        	}
        System.out.println("Enter your username: ");
        Scanner scanner1 = new Scanner(System.in);
        String user_name = scanner1.nextLine();
        //create an array of type string with variable c with 4 values
        String c[] = {"qwert","poui","lkji"};
        System.out.println(Javabasics2.forif(user_name, c));
        System.out.println(Javabasics2.forif(user_name, b));
        }

}

