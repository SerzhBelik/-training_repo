package HomeWork1;

public class TeamMember {
    private  String name;
    private  String passedStatus = DID_NOT_PASS;
    private final static String DID_NOT_PASS = "did not pass obstacle course";
    private final static String PASSED = "passed obstacle course";
    private final static String DISCQUAL = "disqualified";

    TeamMember(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public String getPassedStatus(){
        return this.passedStatus;
    }

}
