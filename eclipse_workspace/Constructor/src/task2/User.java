package task2;

class User {
	String userName;
	String userId;
	String mobile;

	User(String userName, String userId, String mobile) {
		this();
		this.userName = userName;
		this.userId = userId;
		this.mobile = mobile;
	}

	User(){
		System.out.println("no args constructor");
	}
	void show() {
		System.out.println("userName: " + userName + "," + "userId: " + userId + "," + "mobile: " + mobile);
	}
}
