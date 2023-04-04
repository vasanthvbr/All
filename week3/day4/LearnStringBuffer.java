package week3.day4;

public class LearnStringBuffer {
	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("Test");
		buffer.append("leaf");
		System.out.println(buffer);
		
		StringBuffer insert = buffer.insert(0, "a");
		System.out.println("insert "+insert);
		
		StringBuffer reverse = buffer.reverse();
		System.out.println(reverse);
		
		StringBuffer delete = buffer.delete(1, 4);
		System.out.println(delete);
		
		StringBuilder builder=new StringBuilder("anil");
		StringBuilder append=builder.append("kumar");
		System.out.println(append);
	}

}
