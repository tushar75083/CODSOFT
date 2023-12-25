package com.currency_convertor;
import java.util.*;
import java.util.regex.Pattern;
import java.text.DecimalFormat;


public class Main {

	public static void main(String[] args) {
		
		double rupee,dollar,pound,euro,KWD;
		int code;
		
		DecimalFormat f = new DecimalFormat("##.###");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** Welcome To Currency Convertor ***");
		System.out.println("1. Rupees");
		System.out.println("2. Dollar");
		System.out.println("3. Pound");
		System.out.println("4. Euro");
		System.out.println("5. Kuwaiti Dinar");
		
		System.out.println("Enter The Currency Code");
		code = sc.nextInt();
		
		if(code == 1)
		{
			System.out.println("Enter Amount In Rupees :");
			rupee = sc.nextDouble();
			dollar = rupee / 77.34;
			System.out.println("Dollar :"+f.format(dollar));
			pound = rupee / 94.46;
			System.out.println("Pound :"+f.format(pound));
			euro = rupee / 80.36;
			System.out.println("Euro :"+f.format(euro));
			KWD = rupee / 251.92;
			System.out.println("Kuwaiti Dinar :"+f.format(KWD));
			
		}
		else if(code == 2)
		{
			System.out.println("Enter Amount In Dollar :");
			dollar = sc.nextDouble();
			rupee = dollar * 77.34;
			System.out.println("Rupees :"+f.format(rupee));
			pound = dollar * 0.82;
			System.out.println("Pound :"+f.format(pound));
			euro = dollar * 0.96;
			System.out.println("Euro :"+f.format(euro));
			KWD = dollar * 0.31;
			System.out.println("Kuwaiti Dinar :"+f.format(KWD));
		}
		
		else if(code == 3)
		{
			System.out.println("Enter Amount In Pound :");
			pound = sc.nextDouble();
			rupee = pound * 94.43;
			System.out.println("Rupees :"+f.format(rupee));
			dollar = pound * 1.22;
			System.out.println("Dollar :"+f.format(dollar));
			euro = pound * 1.17;
			System.out.println("Euro :"+f.format(euro));
			KWD = pound * 0.3748;
			System.out.println("Kuwaiti Dinar :"+f.format(KWD));
		}
		
		else if(code == 4)
		{
			System.out.println("Enter Amount In Euro :");
			euro = sc.nextDouble();
			rupee = euro * 80.43;
			System.out.println("Rupees :"+f.format(rupee));
			dollar = euro * 1.04;
			System.out.println("Dollar :"+f.format(dollar));
			pound = euro * 0.85;
			System.out.println("Pound :"+f.format(pound));
			KWD = euro * 0.319;
			System.out.println("Kuwaiti Dinar :"+f.format(KWD));
		}
		
		else if(code == 5)
		{
			System.out.println("Enter Amount In Kuwaiti Dinar :");
			KWD = sc.nextDouble();
			rupee = KWD * 251.96;
			System.out.println("Rupees :"+f.format(rupee));
			dollar = KWD * 3.26;
			System.out.println("Dollar :"+f.format(dollar));
			pound = KWD * 2.67;
			System.out.println("Pound :"+f.format(pound));
			euro = KWD * 3.13;
			System.out.println("Euro :"+f.format(euro));
		}
		
		else
		{
			System.out.println("Invalid Code...");
		}
		
		
	}

}
