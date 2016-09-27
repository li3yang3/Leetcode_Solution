package assignment3;

public class checkMessege {
	public int checkMessage(String message) {
		char res[] = message.toCharArray();
		String idx = "SOS";
		char newidx[] = idx.toCharArray();
		int count = 0;
		
		for(int i = 0; i < res.length ; i++ ) {
			
			if(res[i] != newidx[i%3]) {
				count++;
			}
		}
		System.out.println(count+"");
		return count;
		
		
	}

	public static void main(String args[]) {
		 checkMessege test = new checkMessege();
	    	test.checkMessage("SOSSUSSOP");
	    }
}
