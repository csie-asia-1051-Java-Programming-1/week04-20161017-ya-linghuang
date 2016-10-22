package hw;
/*
使用者輸入 n 產生 n 個 費氏數列 (例 n = 5 )
1, 1, 2, 3, 5
 * Date: 2016/10/17
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw01_103051060 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入n，產生n個費氏數列: ");
		int n = scn.nextInt();
		int n1 =1;
		int n2 = 1;
		int nf = 1;
		if(n==1){
			System.out.print(n1);
		}
		else if(n==2){
			System.out.print(n1+"\t"+n2);
		}
		else if(n>=3){
			System.out.print(n1+"\t"+n2+"\t");
		for(int i =3;i<=n;i++){
			nf=n1+n2;
			n1=n2;
			n2=nf;
			System.out.print(nf+"\t");
		}
		}
		}
}
