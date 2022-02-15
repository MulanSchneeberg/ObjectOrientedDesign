
public class MandolinSpec extends InstrumentSpec {
 
	
	private String style;
	public MandolinSpec(String model, Wood backWood, Wood topWood, String style) {
		super(model, backWood, topWood);
		this.style=style;
		
	}
	
	@Override
	public boolean match(InstrumentSpec spec) {
		if (!super.match(spec))
			return false;
		if (!(spec instanceof MandolinSpec)) {
		
			return false;

		} else {
			MandolinSpec mSpec = (MandolinSpec) spec;
			if (style != mSpec.getStyle())
				return false;
		}
		return true;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

}
