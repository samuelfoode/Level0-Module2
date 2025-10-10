package _01_random._6_lottery_numbers;
import java.util.Random;
import javax.swing.JOptionPane;
public class loettery {
	public static void main(String[] args) {
		Random random = new Random();
		
		int randoms = random.nextInt(99);
		int[] numbers = new int[6];
		for (int i =0; i<6; i++){
			numbers[i]=random.nextInt(99);
		}
		JOptionPane.showMessageDialog(null, numbers[0]+" "+ numbers[1]+" "+ numbers[2]+" "+ numbers[3]+" "+ numbers[4]+" "+ numbers[5]+" ");
	}
}
