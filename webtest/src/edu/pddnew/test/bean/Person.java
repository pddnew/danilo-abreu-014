package edu.pddnew.test.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.pddnew.test.bean.PersonPhone.PhoneType;

/**
 * @since November 02 2013
 * */
public class Person implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1268229415591039956L;

	private String name;
	private int age;
	private List<PersonPhone> phones;
	
	public Person(){
		this.name="John";
		Random ran = new Random();
		this.age = ran.nextInt(99);
		this.phones = new ArrayList<PersonPhone>();
		PersonPhone p1 = new PersonPhone();
		if(age>50)
			p1.setType(PhoneType.cellphone);
		else
			p1.setType(PhoneType.office);
		p1.setNumber(String.format("%09d",ran.nextInt(100000000)));
		PersonPhone p2 = new PersonPhone();
		p2.setType(PhoneType.home);
		p2.setNumber(String.format("%09d",ran.nextInt(100000000)));
		this.phones.add(p1);
		this.phones.add(p2);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public List<PersonPhone> getPhones() {
		return phones;
	}
	public void setPhones(List<PersonPhone> phones) {
		this.phones = phones;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
