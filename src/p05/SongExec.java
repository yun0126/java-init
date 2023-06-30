package p05;
//1등인 노래부른사람과노래 꼴등인 노래부른사람과노래를 출력해라
public class SongExec {
	
	public static void main(String[] args) {
		
		Song[] songs = new Song[5];
		
		/*
		 * null null null null null
		 * 0	1	 2	  3	   4 				
		 */
		
	
		
		songs[0] = new Song();
		songs[0].name = "Ditto";
		songs[0].singer = "뉴진스";
		songs[0].rank = 1;
              
		songs[1] = new Song();
		songs[1].name = "OMG";
		songs[1].singer = "뉴진스";
		songs[1].rank =2;
		
		songs[2] = new Song();
		songs[2].name = "mmm";
		songs[2].singer = "이수린";
		songs[2].rank = 34;
		
		songs[3] = new Song();
		songs[3].name = "HypeBoy";
		songs[3].singer = "뉴진스";
		songs[3].rank = 2;
		
		songs[4] = new Song();
		songs[4].name = "Merry Go";
		songs[4].singer = "DPR IAN";
		songs[4].rank =5;
		
		/*int minRank = songs[0].rank;
		int minIdx = 0;
		
		int maxRank = songs[0].rank;
		int maxIdx=0;
		
		for(int i =1; i<songs.length; i++) {
			if(minRank>songs[i].rank) {
				minRank = songs[i].rank;
				minIdx = i;
			}
			if(maxRank<songs[i].rank) {
				maxRank = songs[i].rank;
				maxIdx = i;
			}
		}
		
		System.out.println("일등:"+songs[minIdx].singer+ "의"+ songs[minIdx].name);
		System.out.println("꼴등:"+songs[maxIdx].singer+ "의"+ songs[maxIdx].name);      
              */
		
		
		
		Song fSong = songs[0];
		Song lSong = songs[0];
		
		
		for(int i =1; i<songs.length; i++) {
			if(fSong.rank> songs[i].rank) {
				fSong = songs[i];
			}
			if(lSong.rank<songs[i].rank) {
				lSong = songs[i];
			}
		}
		
		System.out.println("일등:"+ fSong.singer+ "의"+  fSong.name);
		System.out.println("꼴등:"+ lSong.singer + "의"+  lSong.name);      
		
		
		
		
              
	}
}
