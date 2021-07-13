package entidades;
import java.util.Date;

public class Client {
	private Date data;
	private String name;
	private String email;
	
	public Client(Date data, String name, String email) {
		this.data = data;
		this.name = name;
		this.email = email;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
