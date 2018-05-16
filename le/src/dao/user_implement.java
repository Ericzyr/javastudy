package dao;


interface user_interface {
	public boolean add (user us);
	public user getUser (user us);

}

public class user_implement implements user_interface {
	public boolean add(user us) {
		System.out.println("添加1"+us);
		// TODO Auto-generated method stub
		return true;
	}
	
	public user getUser(user us) {
		System.out.println("查询1"+us);
		// TODO Auto-generated method stub
		return us;
	}
	
	
	
}
