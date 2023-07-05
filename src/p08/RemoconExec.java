package p08;

public class RemoconExec {
	public static void main(String[] args) {
		
//		AirconRemocon ar = new AirconRemocon();
//		TvRemocon tv = new TvRemocon();
//		
//		Remote r1 = ar;
//		Remote r2 = tv;
//		Remote[] remotes = new Remote[2];
//		remotes[0] = r1;
//		remotes[1] = r2;
		
		
		Remote[] remotes = new Remote[2];
		remotes[0] =new AirconRemocon();
		remotes[1] =new TvRemocon();
		
		
		for (int i= 0; i<remotes.length; i++) {
			remotes[i].on();
			if(remotes[i] instanceof  AirconRemocon) {
				 AirconRemocon ar = ( AirconRemocon)remotes[i];
				 ar.TempUp();
				 ar.TempDown();
			}else if(remotes[i] instanceof TvRemocon) {
				TvRemocon tv = (TvRemocon)remotes[i];
				tv.ChUp();
				tv.ChDown();
			}
			
			remotes[i].off();
			
			
		}
	}

}
