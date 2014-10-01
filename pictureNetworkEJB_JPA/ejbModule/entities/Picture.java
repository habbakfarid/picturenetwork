package entities;

import entities.SubCategory;
import entities.User;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Picture
 *
 */
@Entity

public class Picture implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String Description;
	@ManyToOne
	private SubCategory pictureSubCategory;
	private String Section;
	@ManyToOne
	private User pictureOwner;
	@Temporal(TemporalType.DATE)
	private Date dateAdded;
	private static final long serialVersionUID = 1L;
	@OneToMany
	private List<Comment> PictureComments = null;
	
	public Picture() {
		super();
	}   
	
	
	public Picture(String name, String description,
			SubCategory pictureSubCategory, String section, User pictureOwner,
			Date dateAdded, List<Comment> PictureComments) {
		super();
		this.name = name;
		Description = description;
		this.pictureSubCategory = pictureSubCategory;
		Section = section;
		this.pictureOwner = pictureOwner;
		this.dateAdded = dateAdded;
		this.PictureComments = PictureComments;
	}


	public Picture(int id, String name, String description,
			SubCategory pictureSubCategory, String section, User pictureOwner,
			Date dateAdded, List<Comment> PictureComments) {
		super();
		this.id = id;
		this.name = name;
		Description = description;
		this.pictureSubCategory = pictureSubCategory;
		Section = section;
		this.pictureOwner = pictureOwner;
		this.dateAdded = dateAdded;
		this.PictureComments = PictureComments;
	}


	public Picture(String name, String description,
			SubCategory pictureSubCategory, String section, User pictureOwner,
			Date dateAdded) {
		super();
		this.name = name;
		Description = description;
		this.pictureSubCategory = pictureSubCategory;
		Section = section;
		this.pictureOwner = pictureOwner;
		this.dateAdded = dateAdded;
	}


	public Picture(int id, String name, String description,
			SubCategory pictureSubCategory, String section, User pictureOwner,
			Date dateAdded) {
		super();
		this.id = id;
		this.name = name;
		Description = description;
		this.pictureSubCategory = pictureSubCategory;
		Section = section;
		this.pictureOwner = pictureOwner;
		this.dateAdded = dateAdded;
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}   
	public SubCategory getPictureSubCategory() {
		return this.pictureSubCategory;
	}

	public void setPictureSubCategory(SubCategory pictureSubCategory) {
		this.pictureSubCategory = pictureSubCategory;
	}   
	public String getSection() {
		return this.Section;
	}

	public void setSection(String Section) {
		this.Section = Section;
	}   
	public User getPictureOwner() {
		return this.pictureOwner;
	}

	public void setPictureOwner(User pictureOwner) {
		this.pictureOwner = pictureOwner;
	}   
	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}


	public List<Comment> getPictureComments() {
		return PictureComments;
	}


	public void setPictureComments(List<Comment> PictureComments) {
		this.PictureComments = PictureComments;
	}
   
}