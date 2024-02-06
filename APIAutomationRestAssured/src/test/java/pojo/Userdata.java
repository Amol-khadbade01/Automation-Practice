package pojo;

public class Userdata {
	private String username;
	private String email;
	private int age;
	private int mobile;

	 Userdata(String username, String email, int age, int mobile) {
		this.username = username;
		this.email = email;
		this.age = age;
		this.mobile = mobile;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

}