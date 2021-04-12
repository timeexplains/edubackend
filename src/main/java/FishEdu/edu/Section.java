package FishEdu.edu;

import java.io.Serializable;

public class Section implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String content;
	String imgURL;
	boolean useIcon;
	int type = 1 ;
	
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Section [content=" + content + ", imgURL=" + imgURL + ", useIcon=" + useIcon + "]";
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	public boolean isUseIcon() {
		return useIcon;
	}
	public void setUseIcon(boolean useIcon) {
		this.useIcon = useIcon;
	}
	
	
}
