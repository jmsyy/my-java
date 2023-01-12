package src.baseDemo;

class Syetax {
    public static void main(String[] args){
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
