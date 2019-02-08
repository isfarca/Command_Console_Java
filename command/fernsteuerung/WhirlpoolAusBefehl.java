package headfirst.command.fernsteuerung;

public class WhirlpoolAusBefehl implements Befehl {
	Whirlpool whirlpool;

	public WhirlpoolAusBefehl(Whirlpool whirlpool) {
		this.whirlpool = whirlpool;
	}

	public void ausf�hren() {
		whirlpool.kalt();
		whirlpool.aus();
	}
}
