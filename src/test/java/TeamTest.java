import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void team_instantiatesCorrectly_true() {
    Team testTeam = new Team("Baby Got Hack");
    assertTrue(testTeam instanceof Team);
  }

  @Test
  public void getName_teamInstantiatesWithName_BabyGotHack() {
    Team testTeam = new Team("Baby Got Hack");
    assertEquals("Baby Got Hack", testTeam.getName());
  }

  @Test
  public void all_returnsAllInstancesOfTeam_true() {
    Team firstTeam = new Team("Baby Got Hack");
    Team secondTeam = new Team("404 Not Found");
    assertTrue(Team.all().contains(firstTeam));
    assertTrue(Team.all().contains(secondTeam));
  }

  @Test
  public void addMember_addsMemberToList_true() {
    Team testTeam = new Team("Epicodus");
    Member testMember = new Member("Walter White");
    testTeam.addMember(testMember);
    assertTrue(testTeam.getMembers().contains(testMember));
  }

  @Test
  public void find_returnsNullWhenNoTaskFound_null() {
    assertTrue(Team.find(123) == null);
  }
}
