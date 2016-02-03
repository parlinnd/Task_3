/* [IF-38-01] _ Parlin Nando _ 1103132235 */
public class Application{
	private String appName;
	private int appSize;
	
	public void Application(String appName, int appSize){
		this.appName = appName;
		this.appSize = appSize;
	}
	
	public String getappName() {
		return appName;
	}
	
	public int getappSize() {
		return appSize;
	}
	
	public String toString(){
		return ("Application name: "+appName+", Size: "+appSize);
	}
	
}

