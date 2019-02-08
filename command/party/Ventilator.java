package headfirst.command.party;

public class Ventilator {
	public static final int SCHNELL = 3;
	public static final int MITTEL = 2;
	public static final int LANGSAM = 1;
	public static final int AUS = 0;
	String ort;
	int geschwindigkeit;
 
	public Ventilator(String ort) {
		this.ort = ort;
		geschwindigkeit = AUS;
	}
  
	public void schnell() {
		geschwindigkeit = SCHNELL;
		System.out.println(ort + ": Ventilator l�uft schnell");
	} 
 
	public void mittel() {
		geschwindigkeit = MITTEL;
		System.out.println(ort + ": Ventilator l�uft auf mittlerer Stufe");
	}
 
	public void langsam() {
		geschwindigkeit = LANGSAM;
		System.out.println(ort + ": Ventilator l�uft langsam");
	}
  
	public void aus() {
		geschwindigkeit = AUS;
		System.out.println(ort + ": Ventilator ist aus");
	}
  
	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}
}
