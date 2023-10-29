
public class Main_PriorityOfOperator {
	public static int prio(char opr) {
		switch(opr) {
		case '$': return 11;
		case '/': return 10;
		case '*': return 10;
		case '%': return 10;
		case '+': return 9;
		case '-': return 9;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(Main_PriorityOfOperator.prio('/'));
		System.out.println(Main_PriorityOfOperator.prio('-'));
		System.out.println(Main_PriorityOfOperator.prio('*'));
		System.out.println(Main_PriorityOfOperator.prio('+'));
		System.out.println(Main_PriorityOfOperator.prio('%'));
	}
		
}
