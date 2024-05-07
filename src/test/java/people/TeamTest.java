package people;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TeamTest {

  Team team;
/*

  @BeforeAll
  static void setUp() {
    System.out.println("Set Up");
  }
*/

  @BeforeEach
  void createInstance() {
    team = new Team();
    //System.out.println("Create Team before each test");
  }
/*
  @AfterAll
  static void cleanUp() {
    System.out.println("Clean Up");
  }

  @AfterEach
  void afterEach() {
    System.out.println("After each test");
  }*/

  @Test
  @DisplayName("Add member with valid input")
  void callAddMemberWithValidParameters() {
    System.out.println("Test add member");
    team.addMember("Jane", 30);
    assertEquals(1, team.getTeamSize());
    team.addMember("Jane", 30);
    assertEquals(2, team.getTeamSize());
  }


  @Test
  @DisplayName("Add member with invalid input")
  void callAddMemberWithInvalidParameters() {
    assertThrows(IllegalArgumentException.class, () -> team.addMember(null, 20));
    assertThrows(IllegalArgumentException.class, () -> team.addMember("", 20));
    assertThrows(IllegalArgumentException.class, () -> team.addMember("Name", -2));

  }

  @Test
  @DisplayName("filter members by name")
  void testMembersByName() {
    team.addMember("Jane", 30);
    team.addMember("Will", 20);
    team.addMember("Nancy", 19);
    team.addMember("jane", 40);

    assertEquals(2, team.getMembersByName("jane").size());
    assertEquals(0, team.getMembersByName("John").size());
    assertEquals(0, team.getMembersByName(null).size());
  }
}