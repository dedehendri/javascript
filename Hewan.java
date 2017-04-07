public class Hewan {
		
	public void berkembangbiak() {
	System.out.println("Hewan Berkembbang biak");
	}
	
	public void berjalan() {
	System.out.println("Hewan berjalan");
	}
}
class Mamalia extends Hewan {

	public void berkembangbiak() {
	System.out.println("Mamalia berkembangbiak dengan melahirkan");
	}
	
	public void berjalan() {
	System.out.println("Mamalia berjalan dengan kaki");
	}
	public void panggil() {
	super.berkembangbiak();
	super.berjalan();
	}
}
class Habitat extends Mamalia {

	public void tempatHidup() {
		System.out.println("Mamalia hidup di air");
		}
	public void tempatHidup2() {
		System.out.println("Mamalia hidup di Darat");
		}
	public void panggil1() {
	super.berkembangbiak();
	super.berjalan();
	}
	
	public static void main (String[] args) {
	Habitat mm = new Habitat();
	Mamalia mi = new Mamalia();
	mi.panggil();
	mm.panggil1();
	mm.tempatHidup();
	mm.tempatHidup2();

	}

	
}

		

	
	