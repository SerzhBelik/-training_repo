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
            s.append(TeamMembers[i].getName());
            if (i < this.TeamMembers.length){
                s.append(", ");
            } else s.append(".");
        }
        return s.toString();
    }
    }
