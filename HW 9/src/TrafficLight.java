
public enum TrafficLight {
	 RED(1),
	 GREEN(3),
	 YELLOW(50);
	 private final int time;
	 
	 TrafficLight(int r) {
		 this.time=r;
	  
	 }
	 
	 public int getTime() {
	  
		 return time;
	 }
}

