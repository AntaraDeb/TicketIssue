package ticketissue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class PoliceOfficer {
    String ticket;
    String issueTicket(boolean b ){
        int relaxation=0;
        if (b==true){
            relaxation=5;
        }
        System.out.println("Enter speed");
        Scanner sc = new Scanner(System.in);
        int speed= sc.nextInt();
        if(speed<=(60+relaxation)){
            ticket="NO TICKET";
            }
        else if(speed>=(61+relaxation)&&speed<=(80+relaxation)){
            ticket="SMALL TICKET";
        }
        else if(speed>=(81+relaxation)){
            ticket="BIG TICKET";
        } 
        return ticket;
    }
    
}
public class TicketIssue {
    public static void main(String[] args) {
            boolean loop;
            boolean status=false;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Name of Driver");
            String name = sc.nextLine();
            do{
                loop=false;
                try{
                    System.out.println("Enter of Date Of Birth in format dd/mm/yyyy");
                    SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM");
                    Date dateOfBirth;
                    dateOfBirth = dateformat.parse(sc.nextLine());
                    Date todayDate = dateformat.parse(dateformat.format(new Date() ));
                    if(dateOfBirth.equals(todayDate)){
                        status= true;
                    }    
                } catch (ParseException ex) {
                    System.out.println("Inavlid date Format.Enter in format dd/mm/yyyy");
                    loop=true;
                }
            }while(loop);
            PoliceOfficer po= new PoliceOfficer();
            System.out.println("Hello "+name+".You have been issued "+po.issueTicket(status));           
    }
    
}
