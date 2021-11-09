package constructor.injection;
/**
 * employee is a bean
 * @author prathamesh
 *
 */

public class Empolyee {
	int id;
	String name;
	Address employeeAddress;
	public Empolyee(int id, String name, Address employeeAddress) {
		super();
		this.id = id;
		this.name = name;
		this.employeeAddress = employeeAddress;
	}
	public void show()
	{
		System.out.println(id+" "+name);
		System.out.println(employeeAddress.toString());
	}

}
