package part03.model;

import javax.persistence.Embeddable;

@Embeddable
public class NickName {
	private String nickName;
	// Id is not required, because it is not entity. It is an embeddable object
	
	public NickName() {
		// TODO Auto-generated constructor stub
	}
	
	public NickName(String nickName) {
		super();
		this.nickName = nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String getNickName() {
		return nickName;
	}

	@Override
	public String toString() {
		return "NickName [nickName=" + nickName + "]";
	}
	
	
}
