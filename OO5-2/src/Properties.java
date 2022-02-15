
public class Properties {
	private String model;
	private Wood backWood;
	private Wood topWood;
	private String style;
	private int numOfStrings;
	
	private Types instrumentTypes;
	
	public Types getInstrumentTypes() {
		return instrumentTypes;
	}
	public void setInstrumentTypes(Types instrumentTypes) {
		this.instrumentTypes = instrumentTypes;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public int getNumOfStrings() {
		return numOfStrings;
	}
	public void setNumOfStrings(int numOfStrings) {
		this.numOfStrings = numOfStrings;
	}
	
}
