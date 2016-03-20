//U10416027	董郡麟

//import java api
import java.util.*;
import java.util.Scanner;

public class TestDisplayCalendars{
	public static void main(String[] args){
		int a = 0;
		int y = 0;
		int m = 0;
		
		
		DisplayCalendars display = new DisplayCalendars();
		Calendar c = new GregorianCalendar();
		
		//use GregorianCalendar object
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n你要自己輸入幾年幾月嗎?? YES:1 , NO:0");
		a = input.nextInt();
		
		if(a == 1){
			//prompt users enter year
			System.out.print("請輸入年份: ");
			y = input.nextInt();
		
			//prompt users enter month
			System.out.print("請輸入月份: ");
			m = input.nextInt();
		}
			
		
		if(a == 0){
			y = c.get(Calendar.YEAR);
			m = c.get(Calendar.MONTH);
		}
		
		if(a != 0 && a != 1){
			System.out.println("輸入錯誤\n");
			
			//prompt users enter year
			System.out.print("請輸入年份: ");
			y = input.nextInt();
		
			//prompt users enter month
			System.out.print("請輸入月份: ");
			m = input.nextInt();
		}
		
		//print the calender
		display.printMonth(y, m);
		
		System.out.println("------------------------------------");
		System.out.println("");
		System.out.println("現在日期, 時間: " + c.get(Calendar.YEAR) +"年");
		System.out.println("                " + c.get(Calendar.MONTH) +"月");
		System.out.println("                " + c.get(Calendar.DATE) +"日");
		System.out.println("                " + c.get(Calendar.HOUR) +"點");
		System.out.println("                " + c.get(Calendar.MINUTE) +"分");
		System.out.println("                " + c.get(Calendar.SECOND) +"秒");
	}
}
