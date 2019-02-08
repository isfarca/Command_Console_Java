package headfirst.command.einfachefernsteuerung;

public class FernsteuerungTestlauf {
	public static void main(String[] args) {
		EinfacheFernSteuerung fernsteuerung = new EinfacheFernSteuerung();
		Licht licht = new Licht();
		GaragenTor garagenTor = new GaragenTor();
		LichtAnBefehl lichtEin = new LichtAnBefehl(licht);
		GaragenTorOeffnenBefehl garage�ffnen = 
		    new GaragenTorOeffnenBefehl(garagenTor);
 
		fernsteuerung.setBefehl(lichtEin);
		fernsteuerung.knopfWurdeGedr�ckt();
		fernsteuerung.setBefehl(garage�ffnen);
		fernsteuerung.knopfWurdeGedr�ckt();
    }
}
