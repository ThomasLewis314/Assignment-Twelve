import java.util.Scanner;


class Main
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasNumber = false;
        boolean hasSpecialCharacter = false;
        System.out.print("Enter your password here : ");
        String password = scnr.nextLine();

        if (password.length() > 16)
        {
            System.out.println("Password given is too large. 8-16 characters are required");
        }
        else if (password.length() < 8)
        {
            System.out.println("Password given is too small. 8-16 characters are required");
        }
        for (char c : password.toCharArray())
        {
            int charNum = (int) c;
            if ((charNum >= 97) && (charNum <= 122))
            {
                hasLowercase = true;
            }
            else if ((charNum >= 65) && (charNum <= 90))
            {
                hasUppercase = true;
            }
            else if ((charNum >= 48) && (charNum <= 57))
            {
                hasNumber = true;
            }
            else
            {
                switch (charNum)
                {
                    case 126 : 
                    case 33 : 
                    case 64 : 
                    case 35 :
                    case 36 : 
                    case 37 : 
                    case 94 : 
                    case 38 : 
                    case 42 : 
                    case 40 : 
                    case 41 : 
                    case 45 : 
                    case 43 : 
                    case 95 : 
                    {
                        hasSpecialCharacter = true;
                        break;
                    } 
                    default :
                    {
                        break;
                    }
                }
            }
        }

        if ((hasLowercase == true) && (hasUppercase == true) && (hasNumber == true) && (hasSpecialCharacter == true))
        {
            System.out.println("Password successfully made!");
        }
        else
        {
            System.out.println("Invalid Password");
            System.out.println("Requirements Missing are : ");
            if (hasLowercase == false)
            {
                System.out.println("   Password is missing a lowercase character");
            }
            if (hasUppercase == false)
            {
                System.out.println("   Password is missing an uppercase character");
            }
            if (hasNumber == false)
            {   
                System.out.println("   Password is missing a number character");
            }
            if (hasSpecialCharacter == false)
            {
                System.out.println("   Password is missing a special character. ~!@#$%^&*()-=+_");
            }
        }
    }
}