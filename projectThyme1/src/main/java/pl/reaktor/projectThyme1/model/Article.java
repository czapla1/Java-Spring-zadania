package pl.reaktor.projectThyme1.model;

public class Article {

	private String title;
	private String content;
	private String sign;
	
	public Article() {
		super();
	}

	public Article(String title, String content, String sign) {
		super();
		this.title = title;
		this.content = content;
		this.sign = sign;
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

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
}
