package HomeWork1;

public class TeamMember {
    private  String name;
    private  String passedStatus = DID_NOT_PASS;
    final static String DID_NOT_PASS = "did not pass obstacle course";
    final static String PASSED = "passed obstacle course";
    static String DISCQUAL = "disqualified";

    TeamMember(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public String getPassedStatus(){
        return this.passedStatus;
    }

    public void setPassedStatus(String passedStatus){
        this.passedStatus = passedStatus;
    }

}
