
public  class Instrument {
	
	private String id;
	private float price;
	private InstrumentSpec spec;
	
	public Instrument(String id, float price, InstrumentSpec spec) {
		this.id = id;
		this.price = price;
		this.spec = spec;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public InstrumentSpec getSpec() {
		return spec;
	}

	public void setSpec(InstrumentSpec spec) {
		this.spec = spec;
	}
	
	

}
