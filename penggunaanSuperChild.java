public class penggunaanSuperChild extends penggunaanSuper {
	
	int num = 10;
	public void tampilkan() {
		System.out.println("ini tampilan dari sub kelas");
	}
	public void penggunaanSuper() {
	tampilkan();
	super.tampilkan();
	System.out.println("Nilai variabel num pada sub kelas:" + num);
	System.out.println("Nilai variabel num pada super kelas:" + super.num);
	}
	public static void main (String[] args){
	penggunaanSuperChild obj = new penggunaanSuperChild();
	obj.penggunaanSuper();
	}
}
