package CODE.Polymorphism;

interface Notifications{
	void sendNotification(String msg);
}
interface displayNotifications{
	void DisplayNotification();
}

class MobileNotifications implements displayNotifications , Notifications{
	@Override
	public void sendNotification(String msg) {
		System.out.println("You have sent msg : "+ msg);
	}
	@Override
	public void DisplayNotification() {
		System.out.println("You have recived a msg!");
	}
}

class EmailNotifications implements displayNotifications , Notifications{
	@Override
	public void sendNotification(String msg) {
		System.out.println("You have sent msg : "+ msg);
	}
	@Override
	public void DisplayNotification() {
		System.out.println("You have recived a email!");
	}
}

class JobNotifications implements displayNotifications , Notifications{
	@Override
	public void sendNotification(String msg) {
		System.out.println("You have sent msg : "+ msg);
	}
	@Override
	public void DisplayNotification() {
		System.out.println("You have selected a JOB salary is 999 Lakhs per annum!");
	}
}

class WtspNotifications implements displayNotifications , Notifications{
	@Override
	public void sendNotification(String msg) {
		System.out.println("You have sent msg : "+ msg);
	}
	@Override
	public void DisplayNotification() {
		System.out.println("You have recived a wtsp messeage!");
	}
}

public class polymorphismNotification {

	public static void main(String[] args) {
		MobileNotifications mobile = new MobileNotifications();
		mobile.sendNotification("Hii from mobile");
		mobile.DisplayNotification();
		System.out.println();
		
		EmailNotifications email = new EmailNotifications();
		email.sendNotification("Hii from emaill");
		email.DisplayNotification();
		System.out.println();
		
		WtspNotifications wtsp = new WtspNotifications();
		wtsp.sendNotification("Hii from wtsp");
		wtsp.DisplayNotification();
		System.out.println();
		
		JobNotifications job = new JobNotifications();
		job.sendNotification("Hii from job");
		job.DisplayNotification();
	}

}
