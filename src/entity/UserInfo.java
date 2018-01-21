package entity;

public class UserInfo {
	String tel;
	String name;
	String pwd;
	String sex;
	String age;
	String nickname;
	String professional;
	String ps;
	int type;
	String backnews;
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getBacknews() {
		return backnews;
	}
	public void setBacknews(String backnews) {
		this.backnews = backnews;
	}
	@Override
	public String toString() {
		return "UserInfo [tel=" + tel + ", name=" + name + ", pwd=" + pwd + ", sex=" + sex + ", age=" + age
				+ ", nickname=" + nickname + ", professional=" + professional + ", ps=" + ps + ", type=" + type
				+ ", backnews=" + backnews + "]";
	}
	
}
