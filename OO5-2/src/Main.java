import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Inventory i= new Inventory();
		intializeInventory(i);
		
		Map guitarProperty= new HashMap();
		guitarProperty.put("instrumentType", Types.GUITAR);
		guitarProperty.put("topWood", Wood.ALDER);
		guitarProperty.put("backWood", Wood.SANDELWOOD);
		guitarProperty.put("model", "mode1");
		guitarProperty.put("style", "styleA");
	    
	    InstrumentSpec spec= new InstrumentSpec(guitarProperty);
	    List<Instrument> iList = i.search(spec);
	
	    if(iList.isEmpty()) {
	    	System.out.println("Didn't find anything");
	    }else {
	    	for (Instrument instrument : iList) {
				System.out.println("find "+iList.size()+" instruments");
				
				InstrumentSpec iSpec= instrument.getSpec();
				for(Iterator i1=iSpec.getProperties().keySet().iterator(); i1.hasNext();) {
					String propertyName=(String) i1.next();
					System.out.println("the propetyName is "+propertyName+" ,and value is "+iSpec.getProperties().get(propertyName));
			
			}
	    }
	    }
	}

	private static void intializeInventory(Inventory i) {
		Map guitarProperty= new HashMap();
		guitarProperty.put("instrumentType", Types.GUITAR);
		guitarProperty.put("topWood", Wood.ALDER);
		guitarProperty.put("backWood", Wood.SANDELWOOD);
		guitarProperty.put("model", "mode1");
		guitarProperty.put("style", "styleA");
		
		Map mandolinProperty= new HashMap();
		mandolinProperty.put("instrumentType", Types.MANDOLIN);
		mandolinProperty.put("topWood", Wood.ALDER);
		mandolinProperty.put("backWood", Wood.SANDELWOOD);
		mandolinProperty.put("model", "mode1");
		mandolinProperty.put("style", "styleB");
		
	    Instrument guitar= new Instrument("1", 45, new InstrumentSpec(guitarProperty));
	    Instrument Mandolin = new Instrument("2", 30,  new InstrumentSpec(mandolinProperty));
	    
	    i.addInstrument(guitar);
	    i.addInstrument(Mandolin);
		
	}

}
