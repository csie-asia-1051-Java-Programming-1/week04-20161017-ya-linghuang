package hw;
/*
使用者輸入正整數 n 與 m 然後計算
 * Date: 2016/10/17
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw02_103051060 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入正整數n與m: ");
		int n = scn.nextInt();
		int m = scn.nextInt();
		int n1 = 1;
		int m1 = 1;
		int nm = (n-m);
		int nm1 = 1;
		for(int i= 1; i<=n;i++){
			n1=n1*i;
		}
		for(int i= 1; i<=m;i++){
			m1=m1*i;
		}
		for(int i= 1; i<=nm;i++){
			nm1=nm1*i;
		}		
		System.out.print(n1/(m1*nm1));
	}

}
