public class penggunaanSuperKonstruktorChild extends penggunaanSuperKonstruktor {
	
		public penggunaanSuperKonstruktorChild(int umur){
		super(umur);
		}
		
		public static void main (String[] args) {
		penggunaanSuperKonstruktorChild s= new penggunaanSuperKonstruktorChild(24);
		s.getAge();
		}
	}