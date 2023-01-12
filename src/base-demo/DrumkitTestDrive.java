class DrumkitTestDrive {
	public static void main(String[] args) {
		Drumkit[] d = new Drumkit[1];
		d[0] = new Drumkit();
		if(d[0].snare == true) {
			d[0].playSnare();
			d[0].snare = false;
		}
		d[0].playTopHat();
	}
       
}