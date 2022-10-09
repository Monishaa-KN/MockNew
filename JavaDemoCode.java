package JavaDemoclass;

public class JavaDemoCode {
//	private void Monday() {
//		System.out.println("MONDAY");
//		
//	}
//	private void Tuesday () {
//		System.out.println("TUESDAY");
//		
//	}
//	private void Wdenesday() {
//		System.out.println("WEDNESDAY");
//		// TODO Auto-generated method stub
//
//	}
//	
//	public static void main(String[] args) {
//		
//		JavaDemoCode JDC =new JavaDemoCode();
//		JDC.Monday();
//		JDC.Tuesday();
//		JDC.Wdenesday();
//	
//		
//	}
//	
//	}


		  public static void main(String[] args) {
		    
		    int num = 3553, reversedNum = 0, remainder;
		    
		    // store the number to originalNum
		    int originalNum = num;
		    
		    // get the reverse of originalNum
		    // store it in variable
		    while (num != 0) {
		      remainder = num % 10;
		      reversedNum = reversedNum * 10 + remainder;
		      num /= 10;
		    }
		    
		    // check if reversedNum and originalNum are equal
		    if (originalNum == reversedNum) {
		      System.out.println(originalNum + " is Palindrome.");
		    }
		    else {
		      System.out.println(originalNum + " is not Palindrome.");
		    }
		  }
		}
