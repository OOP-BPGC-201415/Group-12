import java.util.ArrayList;

public class Participant extends Login {

	public Participant(String username, String password_hash,
			StudentDetail details, Event event, Team team,
			ArrayList<Fixture> fixtures, Boolean isCaptain) {
		super(username, password_hash);
		this.details = details;
		this.event = event;
		this.team = team;
		this.fixtures = fixtures;
		this.isCaptain = isCaptain;
	}

	private StudentDetail details;
	private Event event;
	private Team team;
	private ArrayList<Fixture> fixtures;
	private Boolean isCaptain;

	public boolean registerForAcco() {
		return false;
	}

	public String getReminders() {
		return null;
		
	}

	public ArrayList<Fixture> viewMyFixture() {
		return this.getFixtures();
	}

	public StudentDetail getDetails() {
		return details;
	}
	public Participant(){
		
	}
	public void setDetails(StudentDetail details) {
		this.details = details;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Boolean getIsCaptain() {
		return isCaptain;
	}

	public void setIsCaptain(Boolean isCaptain) {
		this.isCaptain = isCaptain;
	}

	public void setFixtures(ArrayList<Fixture> fixtures) {
		this.fixtures = fixtures;
	}

	public ArrayList<Fixture> getFixtures() {
		return fixtures;
	}
}