//Write a class ComplexNumber having attributes real & imaginary. 
//Add functions like add, subtract, multiply & swap.

package com.shariful.oct26.corejavabasics;

class ComplexNumberOperations
{
		int real,img;

		ComplexNumberOperations()
		{}

		ComplexNumberOperations(int real1,int img1)
		{
			this.real=real1;
			this.img=img1;	
		}
		
		ComplexNumberOperations add(ComplexNumberOperations c1,ComplexNumberOperations c2)
		{
			ComplexNumberOperations csum=new ComplexNumberOperations();
			csum.real=c1.real+c2.real;
			csum.img=c1.img+c2.img;
			return csum;
		}

		ComplexNumberOperations sub(ComplexNumberOperations c1,ComplexNumberOperations c2)
		{
			ComplexNumberOperations csub=new ComplexNumberOperations();
			csub.real=c1.real-c2.real;
			csub.img=c1.img-c2.img;
			return csub;
		}

		ComplexNumberOperations mul(ComplexNumberOperations c1,ComplexNumberOperations c2)
		{
			ComplexNumberOperations cmul=new ComplexNumberOperations();
			cmul.real=c1.real*c2.real;
			cmul.img=c1.img*c2.img;
			return cmul;
		}

		ComplexNumberOperations div(ComplexNumberOperations c1,ComplexNumberOperations c2)
		{
			ComplexNumberOperations cdiv=new ComplexNumberOperations();
			cdiv.real=c1.real/c2.real;
			cdiv.img=c1.img/c2.img;
			return cdiv;
		}

		public static void swap(ComplexNumberOperations c1,ComplexNumberOperations c2)
		{
			ComplexNumberOperations temp;
			
			temp=c1;
			c1=c2;
			c2=temp;
			
			System.out.println("\nAfter Swapping:");
		    System.out.println("Number1:-"+ c1);
		    System.out.println("Number2:-"+c2 );
		}

		@Override
		public String toString() {
			return "Complex [real=" + real + ", img=" + img + "]";
		}

}

class ComplexNumberTest
{
	public static void main(String[] args)
	{
		ComplexNumberOperations c1=new ComplexNumberOperations(8,9);
		ComplexNumberOperations c2=new ComplexNumberOperations(2,3);
		ComplexNumberOperations c3=new ComplexNumberOperations();
		System.out.println("Entered Numbers:");
	    System.out.println("Number 1:-"+c1);
	    System.out.println("Number 2:-"+c2);
		
		c3=c3.add(c1,c2);
		System.out.println("\nSum: " + c3.real + " + i" + c3.img);
		c3=c3.sub(c1,c2);
		System.out.println("Subtract: " + c3.real + " + i" + c3.img);
		c3=c3.mul(c1,c2);
		System.out.println("Product: " + c3.real + " + i" + c3.img);
		c3=c3.div(c1,c2);
		System.out.println("Division: " + c3.real + " + i" + c3.img);

		c3.swap(c1,c2);
		
	}
}