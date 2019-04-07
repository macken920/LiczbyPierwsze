import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Wprowadz zakres:");
        int zakres = scan.nextInt();
        System.out.println("Zakres do "+zakres);
        
        int suma = 0;
        

        if (zakres >= 2 & zakres < 3)
        	suma = 2;
        else if (zakres >= 3 & zakres < 5)
        	suma = 2+3;
        else if (zakres >= 5 & zakres <7)
        	suma = 2+3+5;
        else if (zakres == 7)
        	suma = 2+3+5+7;
        else if (zakres >7) {
        	
        	suma = 2+3+5+7;
        	
        	System.out.print("2 + 3 + 5 + 7");
        	
        	for(int i=8;i<=zakres;i++) {
    			if (i%2 !=0 & i%3 !=0 &  i%5 !=0 & i%7 !=0) {
    				System.out.print(" + " + i);
    				suma = suma + i;
    			}

    		}
        }
        else
        	System.out.println("za ma³y zakres");
		
		System.out.println(" = suma: "+ suma);
		
		
		
		int pierwsza = 1;
		suma=0;
		
		
		while(pierwsza <= zakres) {
			boolean parzysta = false;
			int j=2;
			while(j <= pierwsza/2 & j <=7) {//wywalenie podzielnych przez 2,3,5,7. funkcja w³¹cza siê po ominiêciu w zmiennej liczb 2,3 
				if (pierwsza % j == 0) {
					parzysta = true;
					break;
				}
				j++;
			}
			if (parzysta == false & pierwsza !=1) {
				System.out.print(pierwsza +  " + ");
				suma = suma + pierwsza;
			}
			pierwsza++;
		}
		System.out.println("suma: " + suma);
		
		
		
		
		

	}

}
