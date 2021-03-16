
public class TeamManager {
  
  private int idealTeamSize;
  private int minTeamSize;
  private int maxTeamSize;

  public TeamManager() {
    
    idealTeamSize = 2;
    minTeamSize = 2;
    maxTeamSize = 2;
  }
    /**
     * Method for setting three integer variables
     * @param ideal Perferable team size
     * @param min Minimum team size
     * @param max Maximum team size
     */
    
    public void setSize(int ideal, int min, int max) {
      idealTeamSize = ideal;
      minTeamSize = min;
      maxTeamSize = max;
    }
    /**
     * Get ideal team size
     * 
     * @return idealTeamSize
     */
    public int getIdealTeamSize() {

      return idealTeamSize;

    }

    /**
     * Get minimum team size
     * 
     * @return minTeamSize
     */
    public int getMinTeamSize() {

      return minTeamSize;

    }

    /**
     * Get maximum team size
     * 
     * @return maxTeamSize
     */
    public int getMaxTeamSize() {

      return maxTeamSize;

    }
  }
