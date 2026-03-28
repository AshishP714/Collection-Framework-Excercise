package CollectionFramewor;

public class Employee implements Comparable<Object>{

	public String name;
	public int eid;

	public Employee(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}

	public String toString() {
		return name + "--" + eid;
	}

	public int compareTo(Object obj) {
		int eid1 = this.eid;
		Employee e = (Employee) obj;
		int eid2 = e.eid;

		if (eid1 < eid2) {
			return -1;
		} else if (eid1 > eid2) {
			return +1;
		} else {
			return 0;
		}
	}
}