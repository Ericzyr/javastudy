package dao;



class computer{
	private String box;
	int number;
	
	computer(String box,int number){
		this.box=box;
		this.number=number;
	}
	
	public boolean equals(computer b2){
		
		if(this.box==b2.box && this.number==b2.number){
			return true;
		}
		else{
			return false;
		}
	}
}


public class eq {
	public static void main(String[] args) {
		
		computer b1=new computer("big box",25);
		computer b2=new computer("big box",25);
		
		System.out.println(b1.equals(b2));
		
		

	}

}
