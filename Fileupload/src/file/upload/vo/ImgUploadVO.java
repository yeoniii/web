package file.upload.vo;

import java.io.Serializable;
import java.util.List;

public class ImgUploadVO implements Serializable {
	private String uploader;
	private String comment;
	private List<String> imageNames; //업로드된 사진파일들의 이름
	
	public ImgUploadVO(String uploader, String comment, List<String> imageNames) {
		this.uploader = uploader;
		this.comment = comment;
		this.imageNames = imageNames;
	}
	public ImgUploadVO(){}
	public String getUploader() {
		return uploader;
	}
	public void setUploader(String uploader) {
		this.uploader = uploader;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public List<String> getImageNames() {
		return imageNames;
	}
	public void setImageNames(List<String> imageNames) {
		this.imageNames = imageNames;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((imageNames == null) ? 0 : imageNames.hashCode());
		result = prime * result + ((uploader == null) ? 0 : uploader.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ImgUploadVO other = (ImgUploadVO) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (imageNames == null) {
			if (other.imageNames != null)
				return false;
		} else if (!imageNames.equals(other.imageNames))
			return false;
		if (uploader == null) {
			if (other.uploader != null)
				return false;
		} else if (!uploader.equals(other.uploader))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ImgUploadVO [uploader=" + uploader + ", comment=" + comment + ", imageNames=" + imageNames + "]";
	}
	
	
	
}
