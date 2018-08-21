package HomeWork1;

public class Main {

    public static void main(String[] args) {
        TeamMember teamMember1 = new TeamMember("Alex");
        TeamMember teamMember2 = new TeamMember("Bob");
        TeamMember teamMember3 = new TeamMember("Jane");
        TeamMember teamMember4 = new TeamMember("Kate");
        teamMember4.setPassedStatus(TeamMember.PASSED);
        teamMember2.setPassedStatus(TeamMember.PASSED);

        Course c = new Course(4); // Создаем полосу препятствий
        Team team = new Team("Atlanta", teamMember1, teamMember2, teamMember3, teamMember4); // Создаем команду

        c.doIt(team); // Просим команду пройти полосу
//        System.out.println(teamMember1.getPassedStatus());
//            team.showResults(); // Показываем результаты
        }
    }

