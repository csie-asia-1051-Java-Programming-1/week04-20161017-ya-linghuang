package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex04_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入一個正整數n及字元符號，將顯示圖形(例 n = 4,字元符號= @): ");
		int n = scn.nextInt();
		char a = scn.next().charAt(0);
		for(int i =1; i<=n;i++){ //行
			for(int j = n;  j>=i;j--){        //顆       
				System.out.print(a);
			}
			System.out.print("\n");
		}
	}

}
