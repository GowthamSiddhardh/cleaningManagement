import java.text.SimpleDateFormat;
import java.util.Date;

public class Mail {
   private long type_id;
   private String to;
   private String from;
   private String subject;
   private String content;
   private Date received_date;
   private double size;
public Mail() {
	super();
}
public long getType_id() {
	return type_id;
}
public void setType_id(long type_id) {
	this.type_id = type_id;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getReceived_date() {
	return received_date;
}
public void setReceived_date(Date received_date) {
	this.received_date = received_date;
}
public double getSize() {
	return size;
}
public void setSize(double size) {
	this.size = size;
}
public Mail(long type_id, String to, String from, String subject, String content, Date received_date, double size) {
	super();
	this.type_id = type_id;
	this.to = to;
	this.from = from;
	this.subject = subject;
	this.content = content;
	this.received_date = received_date;
	this.size = size;
}
@Override
public String toString() {
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	return "Mail [type_id=" + type_id + ", to=" + to + ", from=" + from + ", subject=" + subject + ", content="
			+ content + "received_date=" + received_date + ", size=" + size + "]";
}


   
   
}
