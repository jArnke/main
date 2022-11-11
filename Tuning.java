import java.util.ArrayList;
public class Tuning{
	private GuitarString[] strings;
	
	public Tuning(){
		strings = new GuitarString[6];
		strings[5] = new GuitarString(7);
		strings[4] = new GuitarString(0);
		strings[3] = new GuitarString(5);
		strings[2] = new GuitarString(10);
		strings[1] = new GuitarString(2);
		strings[0] = new GuitarString(7);
	}
	public void printStrings(ArrayList<Integer> notes){
		for(int i=0;i<=12;i++){
			if(i<10) System.out.print("| "+i+"  |");
			else{System.out.print("| "+i+" |");}
		}
		System.out.println();
		for(int i=0;i<strings.length;i++){
			strings[i].printString(notes);
			System.out.println("");
		}
	}
	
	public static void main(String[] args){
		Tuning standard = new Tuning();
		ArrayList<Integer> notes = new ArrayList<Integer>();
		notes.add(9);
		notes.add(1);
		notes.add(4);
		standard.printStrings(notes);
		
	}
	
	
	
}