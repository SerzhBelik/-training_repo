package HomeWork1;

public class Team {
    private String teamName;
    private String[] TeamMembers;
    private int taemScore = 0;
    Team(String teamName, String ... teamMemberName){
        this.teamName = teamName;
        TeamMembers = new String[teamMemberName.length];
        for(int i = 0; i < teamMemberName.length; i++) {
            TeamMembers[i] = teamMemberName[i];
        }

    }

//    String getTeamMembersInfo(){
//
//    }
    }
