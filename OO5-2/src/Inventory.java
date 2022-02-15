import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	private List<Instrument> inventory;
	
	
	public Inventory() {
		inventory= new ArrayList<Instrument>();
	}
	
	public void addInstrument(Instrument instrument) {
		
		inventory.add(instrument);
	}
	
	public Instrument getInstrument(String id) {
	for (Instrument instrument : inventory) {
		if(instrument.getId().equals(id))
		return instrument;	
		
	}
	return null;
	
	}
	
	public List<Instrument> search(InstrumentSpec spec){
		List<Instrument> result = null;
		for (Instrument instrument : inventory) {
			if (instrument.getSpec().match(spec)) {
				result= new ArrayList<Instrument>();
				result.add(instrument);
			}
			
		}
		return result;
		
	}
   
	
}
