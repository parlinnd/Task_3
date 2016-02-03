/* [IF-38-01] _ Parlin Nando _ 1103132235 */
public class Project {
	private String projectName;
	private Member[] teamMember;
	private int nTeam = 0;
	private boolean releaseStatus;
	
	public Project (String projectName) {
		this.projectName = projectName;
		teamMember = new Member[5];
		releaseStatus = false;
	}
	
	public void addMember(Member m) {
		teamMember[nTeam] = m;
		nTeam++;
	}
	
	public boolean isReleased () {
	return releaseStatus;
	}
	
	public void releaseApp() {
		releaseStatus = true;
	}
	
	public String toString() {
        String stat;
        if(releaseStatus = true) {
            stat = "Released";
        }
        else {
            stat = "in Progress";
        }
		return ("Project "+projectName+" status is "+stat+" with team member of "+nTeam);
	}
}
