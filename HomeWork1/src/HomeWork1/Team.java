package HomeWork1;

public class Team {
    private String teamName;
    private TeamMember[] TeamMembers;
    private int taemScore = 0;
    Team(String teamName, TeamMember ... teamMemberName){
        this.teamName = teamName;
        TeamMembers = new TeamMember[teamMemberName.length];
        for(int i = 0; i < teamMemberName.length; i++) {
            TeamMembers[i] = teamMemberName[i];
        }

    }

    public String getTeamMembersInfo(){
        StringBuilder s = new StringBuilder("Team " + teamName + " consist: ");

        for (int i =0; i < this.TeamMembers.length; i++){

                if(i!=0) s.append(", ");
                s.append(TeamMembers[i].getName());

        }
        s.append(".");
        return s.toString();
    }

    public String getWhoPassed(){
        StringBuilder s = new StringBuilder("Course passed: ");
        int j = 0;
        for (int i =0; i < this.TeamMembers.length; i++){
            if(TeamMembers[i].getPassedStatus().equals(TeamMember.PASSED)) {
                if(j!=0) s.append(", ");
                s.append(TeamMembers[i].getName());
                j++;
            } else continue;
        }
        s.append(".");
        return s.toString();
    }
    }
