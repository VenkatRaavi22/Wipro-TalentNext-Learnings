import java.util.*;
class Member {
    int id;
    String name;
    Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() { 
        System.out.println("Member Details");
        System.out.println("Member ID: " + id);
        System.out.println("Member Name: " + name);
    }
}
class PremiumMember extends Member {
    String type;
    PremiumMember(int id, String name, String type) {
        super(id, name);
        this.type = type;
    }
    void display() { 
        super.display();
        System.out.println("Membership Type: " + type);
    }
}
public class Libsys { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name");
        String name = sc.nextLine();  
        System.out.println("Enter membership type");
        String type = sc.nextLine();  
        PremiumMember pm = new PremiumMember(id, name, type);
        System.out.println();
        pm.display();
    }
}
