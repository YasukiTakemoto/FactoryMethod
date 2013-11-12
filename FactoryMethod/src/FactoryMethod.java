
public class FactoryMethod {
	public static void main(String[] args) {
		SaxophoneCreator sc = new SaxophoneCreator();
		TrumpetCreator tc = new TrumpetCreator();

		WindInstrumentProduct wp1 = sc.create();
		WindInstrumentProduct wp2 = tc.create();

		wp1.play();
		wp2.play();
	}

}
