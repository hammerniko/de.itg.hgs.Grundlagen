package B1_Verzweigungen;

import java.util.Scanner;

public class B1_2a_GeradeZahl {
    
    public static void main(String[] args){
    	
    	boolean istEsSonnig = false;
    	int menu = 2;
    	
    	if (menu == 1) {
			System.out.println("Menu 1");
		}
    	   	
    	else if(menu == 2) {
    		System.out.println("Menu 2");
    	}
    	else {
    		System.out.println("ungültig");
    	}
    	
    	
    	switch (menu) {
		case 1: System.out.println("Menu 1"); break;
		case 2: System.out.println("Menu 2");break;
		default:
			System.out.println("ungültig");
			break;
		}
    	
    	
    	
    	
    	
    	
        
    }

}
