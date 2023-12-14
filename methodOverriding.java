class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Sports obj = new Sports();
        Soccer obj1 = new Soccer();
        System.out.println("Generic Sports");
        obj.getNumberOfTeamMembers();
        System.out.println("Soccer Class");
        obj1.getNumberOfTeamMembers();


    }
}
