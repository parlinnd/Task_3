/* [IF-38-01] _ Parlin Nando _ 1103132235 */
public class Member {
	private String name;
	private String specialization;
	private int projectWorked = 0;
	
	public Member(String name){
		this.name = name;
	}
	
	public Member (String name, String specialization) {
		this.name = name;
		this.specialization = specialization;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
    public int getprojectWorked() {
        return projectWorked;
    }
	
    public void setprojectWorked(int projectWorked) {
        this.projectWorked=projectWorked;
    }
	
	public String toString() {
		return ("Member "+name+" specialized in "+specialization+" and already worked on "+projectWorked+" project(s)");
	}
}

