package dao;

public class user {
	private String name;
	private int id;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	user(){
		
	}
	
	user(String name,int id){
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "User [name=" + name + ", id=" + id + "]";
	}

	

}


