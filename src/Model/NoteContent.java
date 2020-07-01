package Model;

import java.beans.PropertyChangeListener;
import java.util.*;

import application.DeepCopy;

public class NoteContent extends Model
{
	private String title;
	private String text;
	private ArrayList<Picture> pics;
	private ArrayList<Attachment> attachs;
	private ArrayList<Audio> audios;
	
	public NoteContent()
	{
		pics = new ArrayList<>();
		attachs = new ArrayList<>();
		audios = new ArrayList<>();
	}
	
	// getters
	public String getTitle()
	{
		return title;
	}
	
	// TODO:没想好怎么处理文字内容，比如要不要分段记，图片的插入位置
	public String getText()
	{
		return text;
	}
	
	public ArrayList<Picture> getPics()
	{
		return pics;
	}
	
	public ArrayList<Attachment> getAttachs()
	{
		return attachs;
	}
	
	public ArrayList<Audio> getAudios()
	{
		return audios;
	}
	
	// setter
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setText(String text)
	{
		this.text = text;
	}
	
	public void setPics(ArrayList<Picture> pics)
	{
		this.pics = (ArrayList<Picture>)DeepCopy.deepCopy(pics);
	}
	
	public void setAttachs(ArrayList<Attachment> attachs)
	{
		this.attachs = (ArrayList<Attachment>)DeepCopy.deepCopy(attachs);
	}
	
	public void setAudios(ArrayList<Audio> audios)
	{
		this.audios = (ArrayList<Audio>)DeepCopy.deepCopy(audios);
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener)
	{
		observer.addPropertyChangeListener(listener);
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener)
	{
		observer.removePropertyChangeListener(listener);
	}

	@Override
	public void initialize()
	{
		// TODO Auto-generated method stub
		
	}
	
}

// TODO 
class Picture
{
	
}

class Attachment
{
	
}

class Audio
{
	
}
