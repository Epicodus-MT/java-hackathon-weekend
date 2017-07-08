import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class MemberTest {

  @Before
  public void tearDown() {
    Member.clear();
  }

  @Test
  public void Member_instantiatesCorrectly() {
    Member myMember = new Member("Walter White");
    assertTrue(myMember instanceof Member);
  }

  @Test
  public void Member_instantiatesWithDescription() {
    Member myMember = new Member("Walter White");
    assertEquals("Walter White", myMember.getDescription());
  }

  @Test
  public void Member_isCompletedEqualsFalseAfterInstantiation() {
    Member myMember = new Member("Walter White");
    assertFalse(myMember.isCompleted());
  }

  @Test
  public void all_returnsAllInstancesOfMember_true() {
    Member firstMember = new Member("Walter White");
    Member secondMember = new Member("Saul Goodman");
    assertTrue(Member.all().contains(firstMember));
    assertTrue(Member.all().contains(secondMember));
  }

  @Test
    public void getId_membersInstantiateWithAnID_1() {
      Member.clear();
      Member myMember = new Member("Walter White");
      assertEquals(1, myMember.getId());
    }

  @Test
  public void find_returnsMemberWithSameId_secondMember() {
    Member firstMember = new Member("Walter White");
    Member secondMember = new Member("Saul Goodman");
    assertEquals(Member.find(secondMember.getId()), secondMember);
  }
}
