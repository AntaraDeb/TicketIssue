package ticketissue;



public class TicketIssue {
    public static void main (String [] args) {
        int speed= Integer.parseInt(args[0]);
        boolean isBirthday = Boolean.parseBoolean(args[1]);
        issueTicket(speed, isBirthday);
    }
    static void issueTicket(int speed, boolean isBirthday){
        int relaxation=0;
        if (isBirthday==true){
            relaxation=5;
        }
        System.out.println("Enter speed");
        if(speed<=(60+relaxation)){
            System.out.println("NO TICKET");
            }
        else if(speed>=(61+relaxation))
        {
            if(speed<=(80+relaxation))
                System.out.println("SMALL TICKET");
            else if(speed>=(81+relaxation))
                System.out.println("BIG TICKET");       
        }
        
    }
}
