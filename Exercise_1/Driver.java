/* [IF-38-01] _ Parlin Nando _ 1103132235 */
import java.util.Scanner;

public class Driver{
	public static void main(String[] args){
		int z,x,m,p;
		String an;
		boolean b = false;
		
		AppStore aps = new AppStore();
		SmartPhone sm = new SmartPhone();
		Scanner s = new Scanner(System.in);
		Scanner f = new Scanner(System.in);
		System.out.println("Set App Memory: ");
		m = s.nextInt();
		sm.setMemory(m);
		do{
		System.out.println(" Application Program ");
		System.out.println("1. Add Apps to store ");
		System.out.println("2. Install to smartphone ");
		System.out.println("3. See Apps list ");
		System.out.println("4. Exit ");
		System.out.print("Choice: ");
		z = s.nextInt();
		switch (z){
			case 1: System.out.print("Please input app name: ");
					an = f.next();
					System.out.print("Please input app size: ");
				x = s.nextInt();
					aps.createNewApp(an,x);
					System.out.println(aps.toString());
					continue;
			case 2: System.out.println(sm.toString());
					System.out.print("Add App ID: ");
					p = s.nextInt();
					sm.addApplication(aps, p);
					System.out.println(sm.toString());
					continue;
			case 3: System.out.print("Please input app id: ");
					p = s.nextInt();
					System.out.println(aps.getApp(p).toString());
					continue;
			case 4: b=true;
					break;
		}
		} while(b=false);
	}
} 

