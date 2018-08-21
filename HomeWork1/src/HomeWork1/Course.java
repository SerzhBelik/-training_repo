package HomeWork1;

public class Course {
    private double[] barriersHeight;
    private int barriersNumber;
    Course(int barriersNumber){
        barriersHeight = new double[barriersNumber];
        this.barriersNumber = barriersNumber;
        for(int i = 0; i<barriersNumber; i++){
        barriersHeight[i] = Math.random()+1;
        }


    }

    public void doIt(Team team){
        for(int i = 0; i<team.TeamMembers.length; i++){
            for (int j = 0; j<barriersNumber; j++){
                if(getJumpHeight()>barriersHeight[j]){
                    team.TeamMembers[i].personalScore += (int)(barriersHeight[j]*100);
                    team.taemScore += team.TeamMembers[i].personalScore;
                } else {
                    team.TeamMembers[i].setPassedStatus(TeamMember.DISCQUAL);
                    break;
                }
            }
        }
    }

    public double getJumpHeight() {
        return Math.random()+1.2;
    }
}
