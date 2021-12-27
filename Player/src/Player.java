import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

 class Player implements Comparable<Player> {
      private String name;
      private Date datOfBirth;
      private String skill;
      private int numberOfMatches;
      private int runs;
      private int wickets;
      private String nationality;
      private Double powerRating;
     
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDatOfBirth() {
		return datOfBirth;
	}
	public void setDatOfBirth(Date datOfBirth) {
		this.datOfBirth = datOfBirth;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(Double powerRating) {
		this.powerRating = powerRating;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(String name, Date datOfBirth, String skill, int numberOfMatches, int runs, int wickets,
			String nationality, Double powerRating) {
		super();
		this.name = name;
		this.datOfBirth = datOfBirth;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}
	
		
	
      public static Player createPlayer(String details) throws NumberFormatException, ParseException
      { 
    	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy"); 
    	Player player=new Player(details.split(",")[1],sdf.parse(details.split(",")[2]),details.split(",")[3],Integer.parseInt(details.split(",")[4]),Integer.parseInt(details.split(",")[5]),Integer.parseInt(details.split(",")[6]),details.split(",")[7],Double.parseDouble(details.split(",")[8]));  
		return player;
    	  
      }
     class match implements Comparator<Player>
     {
    	 public int compare(Player p1,Player p2)
    	 {
			return numberOfMatches;  
    		 
			
    		 
    	 }
     }
	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		return 0;
	}
      
}
