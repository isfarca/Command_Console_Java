package headfirst.command.rueckgaengig;

import java.util.*;

//
// Das ist der Aufrufer
//
public class FernSteuerungMitRueckgaengig {
	Befehl[] anBefehle;
	Befehl[] ausBefehle;
	Befehl r�ckg�ngigBefehl;
 
	public FernSteuerungMitRueckgaengig() {
		anBefehle = new Befehl[7];
		ausBefehle = new Befehl[7];
 
		Befehl keinBefehl = new KeinBefehl();
		for(int i=0;i<7;i++) {
			anBefehle[i] = keinBefehl;
			ausBefehle[i] = keinBefehl;
		}
		r�ckg�ngigBefehl = keinBefehl;
	}
  
	public void setBefehl(int platz, Befehl anBefehl, Befehl einBefehl) {
		anBefehle[platz] = anBefehl;
		ausBefehle[platz] = einBefehl;
	}
 
	public void anKnopfWurdeGedr�ckt(int platz) {
		anBefehle[platz].ausf�hren();
		r�ckg�ngigBefehl = anBefehle[platz];
	}
 
	public void ausKnopfWurdeGedr�ckt(int platz) {
		ausBefehle[platz].ausf�hren();
		r�ckg�ngigBefehl = ausBefehle[platz];
	}
 
	public void r�ckg�ngigKnopfWurdeGedr�ckt() {
		r�ckg�ngigBefehl.r�ckg�ngig();
	}
  
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Fernsteuerung -------\n");
		for (int i = 0; i < anBefehle.length; i++) {
			stringBuff.append("[Platz " + i + "] " + anBefehle[i].getClass().getName()
				+ "    " + ausBefehle[i].getClass().getName() + "\n");
		}
		stringBuff.append("[R�ckg�ngig] " + r�ckg�ngigBefehl.getClass().getName() + "\n");
		return stringBuff.toString();
	}
}
