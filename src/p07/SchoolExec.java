package p07;

public class SchoolExec {
	public static void main(String[] args) {
		//Object obj = new MiddelSchool(); 
		//MiddelSchool ms = (MiddelSchool)obj;
		//System.out.println(ms.studentType);
		
		School middleSchool = new MiddelSchool();
		middleSchool.name = "양주";
		School highSchool = new HighSchool();
		highSchool.name= "양주";
		School school = new School();
		school.name = "학교";
		
		School[] schools = new School[3];
		schools[0] = middleSchool;
		schools[1] = highSchool;
		schools[2] = school;
		for(int i=0; i<schools.length; i++) {
			System.out.print(schools[i].name);
			if(schools[i] instanceof MiddelSchool) {
				MiddelSchool ms = (MiddelSchool)schools[i];
				ms.studentType="중학교";
				System.out.println(ms.studentType);
			}else if(schools[i] instanceof HighSchool) {
				HighSchool hs = (HighSchool)schools[i];
				hs.studentType="고등학교";
				System.out.println(hs.studentType);
			}else {
				System.out.println(); 
			}
		}
		
		
//		String str1 =new String("양주");
//		String str2 =new String("양주");
//		String str3 =new String("양주");
//		String[] strs = new String[3];
//		strs[0] = str1;
//		strs[1] = str1;
//		strs[2] = str1;
				
	}
}
