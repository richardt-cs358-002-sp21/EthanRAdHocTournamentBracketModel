
public class TournamentManager {
  private HashMap<String, Tournament> mTournaments = new HashMap<>();
  private static TournamentManager mInstance;
  /**
   * consturctor
   */
  private TournamentManager() {
    // TODO Auto-generated constructor stub
  }
  /**
   * Creates new singleton
   * 
   * @return Returns singleton instance.
   * */
  public static TournamentManager getInstance() {
    if(mInstance == null) {
      mInstance = new TournamentManager();
    }
    return mInstance;
  }
  /**
   * 
   * @param accessCode
   * @return
   */
  public Tournament findTournament(String accessCode) {
    return mTournaments.get(accessCode);
  }
  /**
   * Uses access code to add tournament to array list
   */
  public void addTournament(Tournament tourney) {
    mTournaments.put(tourney.getAccessCode(), tourney);
  }
  /**
   * removes tournament from array list
   */
  public void removeTournament(String code) {
    mTournaments.remove(code);
  }
  
  /**
   * Returns all tournaments
   * @return
   */
  public ArrayList<Tournament> getAllTournaments(){
    ArrayList<Tournament> tournamentList = new ArrayList<>();
    for(Map.Entry<String, tournamentList> elements: mTournaments.entrySet()) {
      tournamentList.add(elements.getValue());
    }
    return tournamentList;
  }

}
