package com.Mail.Req1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class MailChecking {
	private long id;
	private String to;
	private String from;
	private String subject;
	private String content;
	private Date receivedDate;
	private double size;
	
	public MailChecking() {
		super();
		
	}
	public MailChecking(long id, String to, String from, String subject, String content, Date receivedDate, double size) {
		super();
		this.id = id;
		this.to = to;
		this.from = from;
		this.subject = subject;
		this.content = content;
		this.receivedDate = receivedDate;
		this.size = size;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public Date getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
		return "Id= "+ id +"\nto=" + to +"\nfrom=" + from +"\nsubject=" + subject +"\ncontent=" + content
				+"\nreceivedDate=" +sdf.format(receivedDate) +"\nsize=" + size + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(content, from, id, receivedDate, size, subject, to);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MailChecking other = (MailChecking) obj;
		return Objects.equals(content, other.content) && Objects.equals(from, other.from) && id == other.id
				&& Objects.equals(receivedDate, other.receivedDate)
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size)
				&& Objects.equals(subject, other.subject) && Objects.equals(to, other.to);
	}
     
}
