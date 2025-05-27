package User;

import java.util.ArrayList;
import java.util.List;

public class managerService {
//	List<manager> managers = new ArrayList<manager>();
	UserService service = new UserService();
			
	void register() {
		manager manager = new manager("3", "소똥이", "3");
		service.register(manager);
	} 
	
	manager findBy(String id) {
		return service.findBy(id, manager.class);
	}
	
	//고객리스트를 관리해야하는데 어차피 유저가 갖고있음
	List<manager> managers(){
		return service.getUsers(manager.class);
	}
	
	public static void main(String[] args) {
		managerService service = new managerService();
		service.register();
		System.out.println(service.findBy("1"));
		System.out.println(service.findBy("2"));
		System.out.println(service.findBy("3"));
	} 
	
	
	
}
