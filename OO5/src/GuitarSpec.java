
public class GuitarSpec extends InstrumentSpec {

	private int numStrings;

	public int getNumStrings() {
		return numStrings;
	}

	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}

	public GuitarSpec(String model, Wood backWood, Wood topWood, int numString) {
		super(model, backWood, topWood);
		this.numStrings = numString;
	}

	@Override
	public boolean match(InstrumentSpec spec) {
		if (!super.match(spec))
			return false;
		if (!(spec instanceof GuitarSpec)) {
			
			return false;

		} else {
			GuitarSpec gSpec = (GuitarSpec) spec;
			if (numStrings != gSpec.getNumStrings())
				return false;
		}
		return true;
	}
}
