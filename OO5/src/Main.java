import java.util.List;

public class Main {

	public static void main(String[] args) {
		Inventory i= new Inventory();
	    Instrument guitar= new Guitar("1", 59, new GuitarSpec("model 1", Wood.ALDER, Wood.SANDELWOOD,12));
	    Instrument Mandolin = new Mandolin("2", 30,  new MandolinSpec("model 2", Wood.SANDELWOOD, Wood.ALDER,  "styleA"));
	    
	    i.addInstrument(guitar);
	    i.addInstrument(Mandolin);
	    
	    InstrumentSpec spec= new MandolinSpec("model 2", Wood.SANDELWOOD, Wood.ALDER, "styleA");
	    List<Instrument> iList = i.search(spec);
	    if(iList.isEmpty()) {
	    	System.out.println("Didn't find anything");
	    }else {
	    	for (Instrument instrument : iList) {
				System.out.println("find "+iList.size()+" instruments");
				System.out.println("The Model is "+instrument.getSpec().getModel());
				System.out.println("The TopWood is "+instrument.getSpec().getTopWood());
				System.out.println("The BackWood is "+instrument.getSpec().getBackWood());
			}
	    }

	}

}
