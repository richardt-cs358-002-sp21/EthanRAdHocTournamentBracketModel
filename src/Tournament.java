
public class Tournament {
  public static final int MAX_TEAMS = 256;
  private String mName;
  private String mStartDate = ""; 
  private String mEndDate = "";
  private TeamManager mTeamManager;
  private String mAccessCode = "";
  private ArrayList<Participant> mUnattachedParticipants;
  
  /**
   * Constructor tournament, name, start, end required
   * 
   * @param name  - name of the tournament as a string
   * @param start - state date of the tournament as a string
   * @param end   - end date of the tournament as a string
   */
  public Tournament(String name, String startDate, String endDate) {
    generateAccessCode();
    setDates(startDate, endDate);
    mName = name;
    mStartDate = startDate;
    mEndDate = endDate;
    mTeamManager = new TeamManager();
    mUnattachedParticipants = new ArrayList<Participant>();
  }
  
  /**
   * Add participant to list of unattached participants
   * @param participant 
   * */
  public void addParticipant(Participant participant) {
    mUnattachedParticipants.add(participant);
  }
  
  private static int mAccessCodeCounter = 1111;

  private void generateAccessCode() {

       mAccessCode = Integer(mAccessCodeCounter).toString();

       mAccessCodeCounter++;
       /**
        * Get mAccessCode;
        * @return
        */
       public String getAccessCode() {
         return mAccessCode;
       }
       
     /**
      * Set mStartdate and mEndDate
      * @param start
      * @param end
      */
     public void setDates(string start, string end) {
       mStartDate = start;
       mEndDate = end;
     }
     
     /**
      * Get mStartDate
      * @return
      */
     public Date getStartDate() {
       return mStartDate;
     }
     
     /**
      * Get mEndDate
      * @return
      */
     public Date getEndDate() {
       return mEndDate;
     }
     
     /**
      * setter for tournament mName
      * @param name
      */
     public void setName(String name) {
       mName = name;
     }
     
     /**
      * Get Tournament name
      * @return
      */
     public String getName() {
       return mName;
     }
     /**
      * Get team manager
      * @return team manager
      * */
     public TeamManager getTeamManager() {
       return mTeamManager;
     }
     /**
      * Get array list of participants
      * @return
      */
       public ArrayList<Participant> getUnattachedParticipants() {
         return mUnattachedParticipants;
       }
  }
}
