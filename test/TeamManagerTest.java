import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import cs358.tournament.model.Participant;
import cs358.tournament.model.TeamManager;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TeamManagerTest {

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
  }

  @AfterAll
  static void tearDownAfterClass() throws Exception {
  }

  @BeforeEach
  void setUp() throws Exception {
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  void TeamManagerTest() {
    TeamManager teamManager = new TeamManager();
    teamManager.setSizes(2, 2, 2);
    Assertions.assertEquals(2, teamManager.getIdealTeamSize());
    Assertions.assertEquals(2, teamManager.getMinTeamSize());
    Assertions.assertEquals(2, teamManager.getMaxTeamSize());
  }

}
