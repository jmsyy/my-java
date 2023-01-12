
package src.baseDemo;
class DrumkitTestDrive {
	public static void main(String[] args) {
		/**
		Drumkit[] d = new Drumkit[1];
		d[0] = new Drumkit();
		if(d[0].snare == true) {
			d[0].playSnare();
			d[0].snare = false;
		}
		d[0].playTopHat();

		String num = "777";
		int pnum = Integer.parseInt(num);
		System.out.println(Integer.parseInt("777"));
		 */
		String originString = "I am origin";
		int[] cellList = {1,2,3};
		for(int cell : cellList) {
			if( cell == 2 ) {
				System.out.println("I  am  2");
			}
			if(originString.equals("I am origin")) {
				System.out.println("Yes");	
			}
			System.out.println(cell);
		}
	}
       
}