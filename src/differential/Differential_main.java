package differential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.print("Input Number a > ");
	    double a = Double.parseDouble(scan.next());
	        
	    System.out.print("Input Number h > ");
	    double h = Double.parseDouble(scan.next());
	    
	    Differential_lib dlib =new Differential_lib(a,h);
	    System.out.print("f(x) = x^2");
	    System.out.print("f(x) = x^2の"+a+"における微分係数は"+dlib.getRx()+"\n");
	    System.out.print("f(x) = x^2の"+a+"における数値微分は"+dlib.getDx()+"\n");
	    System.out.print("数値微分と微分係数の相対誤差は"+Math.abs((dlib.getRx()-dlib.getDx()))/dlib.getRx()*100);
	    //h=1.0*10^-10のときもっとも誤差が少なくなった
	}
}
