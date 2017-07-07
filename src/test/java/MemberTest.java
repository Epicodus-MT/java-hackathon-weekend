import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class MemberTest {

  @Before
  public void tearDown() {
    Member.clear();
  }

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member myMember = new Member("Walter White");
    assertEquals(true, myMember instanceof Task);
  }
  //
  // @Test
  // public void Member_instantiatesWithDescription_String() {
  //   Member myMember = new Member("Walter White");
  //   assertEquals("Daniel Loomb", myMember.getDescription());
  // }
  //
  // @Test
  // public void isDeleted_isFalseAfterInstantiation_false() {
  //   Member myMember = new Member("Walter White");
  //   assertEquals(false, myMember.isDeleted());
  // }
  //
  // @Test
  // public void all_returnsAllInstancesOfMember_true() {
  //   Member firstMember = new Member("Walter White");
  //   Member secondMember = new Member("Saul Goodman");
  //   assertEquals(true, Member.all().contains(firstMember));
  //   assertEquals(true, Member.all().contains(secondMember));
  // }
  //
  // @Test
  //   public void getId_membersInstantiateWithAnID_1() {
  //     Member.clear();
  //     Member myMember = new Member("Walter White");
  //     assertEquals(1, myMember.getId());
  //   }
  //
  // @Test
  // public void find_returnsMemberWithSameId_secondMember() {
  //   Member firstMember = new Member("Walter White");
  //   Member secondMember = new Member("Saul Goodman");
  //   assertEquals(Member.find(secondMember.getId()), secondMember);
  // }
}
