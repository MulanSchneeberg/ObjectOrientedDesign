
public enum Wood {
	SANDELWOOD,
	ALDER;

	public String toString() {
		
		switch (this) {
		case SANDELWOOD:
			return "sandelwood";
		
		case ALDER:
			return "Alder";
			
		default:
			return null;

		}
	}
}
