package week2.Day2;

public class Car {
	
	public static void main(String[] args) {
		
		Car carObject = new Car();				
		carObject.applyBreak();
		carObject.applyGear();
		carObject.switchOnAc();
		carObject.applyAcclerate();
		}	
	
		public void applyBreak() {
			System.out.println("applyBreak");
		}
		public void applyGear() {
			System.out.println("applyGear");
		}
		public void switchOnAc() {
			System.out.println("switchOnAc");
		}
		public void applyAcclerate() {
			System.out.println("applyAcclerate");
		}

}
