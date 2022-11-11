/**
 * String class for Guitar Chord shape program
 */
 
 //imports:
 import java.util.ArrayList;
 
 
 //public final  NOTE = {"A","A#","B","C","C#","D","D#","E","F","F#","G","G#"};
 
//start String
public class GuitarString{

 private int openNote;
 //0 = A  11 = G# 
 
 public GuitarString(int openNote){
  this.openNote = openNote;
 }
 
 
 public int getNote(){
  return openNote;
 }

 //@overload
 public int getNote(int fret){
  return (openNote+fret)%12;
 }
 

 public int findFret(int note){
  int fret = (note-openNote);
  if (fret<0)return 12+fret;
  return fret;
 }
 
 public void printString(ArrayList<Integer> notes){
  ArrayList<Integer> fretsToPrint = new ArrayList<Integer>();
  
  for(int i = 0; i<notes.size(); i++)
  {
   fretsToPrint.add(this.findFret(notes.get(i)));
  }
  
  for(int i=0; i<=12; i++){
   if(fretsToPrint.contains(i)){
    if(NOTESYMBOLS[this.getNote(i)].length()==1) 
     System.out.print("| "+NOTESYMBOLS[this.getNote(i)]+"  |");
    else{System.out.print("| "+NOTESYMBOLS[this.getNote(i)]+" |");}
   }
   else{
    System.out.print("| -- |");
   }
  }
 }
 
 public static void main(String[] args){
 
  GuitarString aString = new GuitarString(7);
  int note = 0; //A
  int fret = aString.findFret(note);
  System.out.println("note: "+note);
  System.out.println("fret: "+fret);
  ArrayList<Integer> notes = new ArrayList<Integer>();
  notes.add(note);
  notes.add(8);
  notes.add(3);
  aString.printString(notes);
 }

 
}