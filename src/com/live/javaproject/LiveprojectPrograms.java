package com.live.javaproject;

public class LiveprojectPrograms {

		

			public static void main(String[] args)
			{
				Incrementoperator();
				decrementoperator();
			}
		    public static void Incrementoperator()
		    {
		        int a =10;
		        int b =20;
		        System.out.println("Incrementoperator");
		        System.out.println("the valu of a");
		        System.out.println("the valu of a before pre incrementing");
		        System.out.println(a);
		        System.out.println("the valu of a at pre incrementing");
		        System.out.println(++a);
		        System.out.println("the valu of a after pre incrementing");
		        System.out.println(a);
		        System.out.println(a++);
		        System.out.println(a);
		        System.out.println("the valu of b");
		        System.out.println("the valu of b at post incrementing");
		        System.out.println(b);
		        System.out.println("the valu of b after post incrementing");
		        System.out.println(b++);
		        System.out.println("the valu of b after post incrementing");
		        System.out.println(b);
		        
		    }
		    public static void decrementoperator()
		    {
		    	 int a =10;
		         int b =20;
		         System.out.println("decrementoperator");
		         System.out.println("the valu of a");
		         System.out.println("the valu of a before pre decrementing");
		         System.out.println(a);
		         System.out.println("the valu of a at pre decrementing");
		         System.out.println(--a);
		         //System.out.println("the valu of a after pre decrementing");
		        // System.out.println(a);
		        // System.out.println(a++);
		        // System.out.println(a);
		         System.out.println("the valu of b");
		         System.out.println("the valu of b at post decrementing");
		         System.out.println(b--);
		         System.out.println("the valu of b after post incrementing");
		         System.out.println(b);
		  
		    }
}


