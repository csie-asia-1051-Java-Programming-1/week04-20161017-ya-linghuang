package hw;
/*
讓使用者輸入1, 2, 3, 與4選項，
輸入 n 並顯示圖形 (ex: n = 5)
輸入 n 並顯示圖形
輸入 n (必須是奇數)並顯示圖形
結束程式
 * Date: 2016/10/17
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw04_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		while(true){
		System.out.print("請輸入1, 2, 3, 與4選項(4為結束，其餘為顯示圖形): ");
		int x = scn.nextInt();
		switch(x){
		case 1:{																	//1
			System.out.print("請輸入n(奇數): ");
			int a = scn.nextInt();
			if(a%2==0){																//偶
				System.out.println("偶數no");
				break;
			}
			else{																			//奇
				a=(a/2)+1;
				for(int i = 1; i<a; i++){														//上層
					for(int j = a; j>=i; j--){
						System.out.print("@");
				}
				System.out.print("\n");
			}
				for(int i =1; i<=a; i++){													//下層
					for(int j =i; j>0;j--){
						System.out.print("@");
				}
				System.out.print("\n");
			}
			break;
			}
		}
		case 2:{																	//2
			System.out.print("請輸入n(奇數): ");
			int b = scn.nextInt();
			if(b%2==0){															//偶
				System.out.println("偶數no");
				break;
			}
			else{																		//奇
				b=(b/2)+1;
				for(int i =1; i<=b; i++){													//上層
					for(int j=i; j>0; j--){
						System.out.print("%");
					}
					System.out.print("\n");
				}
				for(int i =1; i<b; i++){														//下層
					for(int j=b;j>i;j--){
						System.out.print("%");
					}
					System.out.print("\n");
				}
				break;
			}
		}
		case 3:{																	//3
			System.out.print("請輸入n(奇數): ");
			int c = scn.nextInt();
			if(c%2==0){															//偶
				System.out.println("偶數no");
				break;
			}
			else{																		//奇
				int n=(c/2);//0
				int m=1;//#
				c=(c/2)+1;//行
				for(int i=1;i<=c;i++){													//上層
					for(int j= n;j>0;j--){
						System.out.print("  ");
					}
					n=n-1;
					for(int k=1;k<=m;k++){
						System.out.print("#");
					}
					m=m+2;
					System.out.print("\n");
				}
				n=n+1;
				m=m-2;
				for(int i= 1;i<c;i++){														//下層
					n=n+1;
					for(int j=1;j<=n;j++){
						System.out.print("  ");
					}
					m=m-2;
					for(int k=1;k<=m;k++){
						System.out.print("#");
					}
					System.out.print("\n");
				}
				break;
			}
		}
		case 4:{																	//4
			System.out.print("結束程式");
			break;
		}
		default:{																	//other
			System.out.print("輸入錯誤");
			continue;
		}
		}
		if(x==4){break;}
		}
	}

}
