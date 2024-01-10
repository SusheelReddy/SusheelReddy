import java.util.Scanner;

public class Email {

    private String firstname;
    private String lastname;
    private String department;
    private String password;
    private String email;
    private int defaultpasswordlength = 10;
    private int EmailCapacity = 600;
    private String alternateEmail;

    private String ChangePassword;

    //constructor to receive firstname and lastname
    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = Setdepartment();
        this.password = Setrandompassword(defaultpasswordlength);

//        System.out.println(this.firstname + " " + this.lastname + " " + this.department + " " + this.password);
          System.out.println("Your Password is:"+this.password);
        //combine elements to join email.
        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department.toLowerCase() + "." + "cook" + "." + "com";
//        System.out.println(email);
    }

    //Ask for department
    private String Setdepartment() {
        System.out.println("DepartmentCode:" + "1.Sales" + "\n2.developnment" + "\n3.accounting" + "\n4.none");
        Scanner in = new Scanner(System.in);
        int depchoice = in.nextInt();
        if (depchoice == 1) {
            return "sales";
        } else if (depchoice == 2) {
            return "developnment";
        } else if (depchoice == 3) {
            return "accounting";
        } else {
            return "";
        }
    }

    // Generate Random Password
    private String Setrandompassword(int length) {
        String PasswordSet = "QWERTYUIOPLKJHGFDSAZXCVBNM1234567890!@#$%";
        char[] passwor = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * PasswordSet.length());
            passwor[i] = PasswordSet.charAt(rand);
        }
        return new String(passwor);
    }

    //Set mailbox capacity
    public void SetMailBoxCapacity(int capacity) {
        this.EmailCapacity = capacity;
    }

    //set alternate mailid
     public  void SetAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void SetChangePassword(String ChangePassword) {
        this.ChangePassword = ChangePassword;
    }

    public int GetMailboxCapacity() {
        return EmailCapacity;
    }

    public String GetAlternateEmail() {
        return alternateEmail;
    }

    public String GetChangePassword(){
        return ChangePassword;
    }

    public String ShowInfo(){
        return "EmpName:"+firstname+" "+lastname+"\n"+"EmaiID:"+ email+"\n"+"EmailCapacity:"+EmailCapacity;
    }
}
