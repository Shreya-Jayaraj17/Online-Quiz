import java.util.Scanner;
public class OnlineQuizApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] questions= {
				"1. What is the capital of India?\n a)New Delhi\n b)Mumbai\n c)Chennai\n d)Kolkata",
				"2. Who is the founder of Java?\n a)James Gosling\n b) Dennis Ritchie\n c)Bjarne Stroustrup\n d)Guido van Rossum",
				"3. What does JVM stand for?\n a)Java Virtual Machine\n b)Java Variable Method\n c)Java Verified Module\n d)None of the above",
				"4. Which of these is a valid data type in Java?\n a)int\n b)string\n c)number\n d)real",
				"5. Which company developed Java?\n a)Microsoft\n b)Sun microsystems\n c)Google\n d)Apple"
		};
		char[] answers= {'a','a','a','a','b'};
		char[] useranswers= new char[questions.length];
		int score=0;
		System.out.println("WELCOME TO JAVA CONSOLE QUIZ\n");
		for(int i=0;i<questions.length;i++)
		{
			System.out.println(questions[i]);
			System.out.println("Your answer is:");
			useranswers[i]=scanner.next().toLowerCase().charAt(0);
			if(useranswers[i]==answers[i]) {
				score++;
			}
			System.out.println();
		}
		System.out.println("QUIZ COMPLETED");
		System.out.println("Your total score is:"+score+"/"+questions.length);
		System.out.println("correct answers:");
		for(int i=0;i<answers.length;i++) 
		{
			System.out.println("Q"+(i+1)+":"+answers[i]);
			
		}
		scanner.close();
		

	}

}
 