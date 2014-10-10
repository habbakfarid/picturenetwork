package entities;

import entities.User;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ProfileComment
 *
 */
@Entity

public class ProfileComment extends Comment implements Serializable {

	
	@ManyToOne
	private User reciever;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Profile userProfile;
	
	
	
	public ProfileComment()
	{
		super();
	}
	
	
	public ProfileComment(int id, String content, Date dateCreated,
			Date dateModified, User sender,User reciever, Profile userProfile) {
		super(id, content, new Date(), new Date(), sender);
		this.reciever = reciever;
		this.userProfile = userProfile;
		// TODO Auto-generated constructor stub
	}




	public ProfileComment(int id, String content, Date dateCreated,
			Date dateModified,User reciever, Profile userProfile) {
		super(id, content, new Date(), new Date());
		this.reciever = reciever;
		this.userProfile = userProfile;
		// TODO Auto-generated constructor stub
	}




	public ProfileComment(String content, Date dateCreated, Date dateModified,
			User sender,User reciever, Profile userProfile) {
		super(content, new Date(), new Date(), sender);
		this.reciever = reciever;
		this.userProfile = userProfile;
		// TODO Auto-generated constructor stub
	}




	public ProfileComment(String content, Date dateCreated, Date dateModified,User reciever, Profile userProfile) {
		super(content, dateCreated, dateModified);
		this.reciever = reciever;
		this.userProfile = userProfile;
		// TODO Auto-generated constructor stub
	}

	public User getReciever() {
		return this.reciever;
	}

	public void setReciever(User reciever) {
		this.reciever = reciever;
	}




	public Profile getUserProfile() {
		return userProfile;
	}




	public void setUserProfile(Profile userProfile) {
		this.userProfile = userProfile;
	}
   
}
