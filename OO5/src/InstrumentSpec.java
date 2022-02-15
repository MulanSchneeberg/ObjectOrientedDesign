
public abstract class InstrumentSpec {
	
	private String model;
	private Wood backWood;
	private Wood topWood;
	
	public InstrumentSpec(String model, Wood backWood, Wood topWood) {
		super();
		this.model = model;
		this.backWood = backWood;
		this.topWood = topWood;
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


	public boolean match(InstrumentSpec spec) {
		
		if(model.equals(spec.getModel())&& topWood.equals(spec.getTopWood())&& backWood.equals(spec.getBackWood())) {
			return true;
		}
		
		return false;
				
	}
	

}
