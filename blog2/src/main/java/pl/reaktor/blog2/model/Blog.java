package pl.reaktor.blog2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blog {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String title;
	private String content;
	private String category;
	private String signature;
	
	public Blog() {
		super();
	}

	public Blog(long id, String title, String content, String category, String signature) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.category = category;
		this.signature = signature;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	
	
}
