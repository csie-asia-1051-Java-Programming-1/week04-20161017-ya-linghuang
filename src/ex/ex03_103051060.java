package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入正整數n(將顯示圖形): ");
		int n = scn.nextInt();
		for(int i =1;i<=n;i++){   //行
			for(int a =1; a <=i;a++){   //顆
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
