import java.util.Scanner;
public class inputscanner2 {
	public static void main (String[] args){
	Scanner input = new Scanner (System.in);
	String nama;
	char jenisKelamin;
	int tinggiBandan;
	boolean menikah;
	System.out.print("Masukkan Nama :");
	nama = input.nextLine();
	
	System.out.print ("Masukkan Jenis Kelamin :");
	jenisKelamin = input.next().charAt(0);
	
	System.out.print ("Masukkan Tinggi Bandan :");
	tinggiBandan = input.nextInt();
	
	System.out.print ("Masukkan Status Menikah :");
	menikah =input.nextBoolean();
	}
}