package View;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.ResourceBundle;

import Controller.Editor;
import Model.Model;
import Model.NoteContent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.effect.DropShadow;
import javafx.scene.web.HTMLEditor;

public class EditorView extends View
{
	@FXML private HTMLEditor htmlEditor;
	
	private Button ImgBtn = new Button("Img"), 
			AttachButton = new Button("Attach"), 
			AudioButton = new Button("Audio");
	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		// mvc
		model = new NoteContent();
		controller = new Editor(model, this);
		
		model.addPropertyChangeListener(this);
		
		// add pic audio attachment buttons
		addExtraButton();
	}
	
	// do what when things changed in model
	@Override
	public void propertyChange(PropertyChangeEvent evt)
	{
		
	}
	
	private void addExtraButton()
	{
		Node node = htmlEditor.lookup(".top-toolbar");
		if (!(node instanceof ToolBar))
			throw new RuntimeException();
		
		ToolBar bar = (ToolBar) node;
		bar.getItems().add(ImgBtn);
		bar.getItems().add(AttachButton);
		bar.getItems().add(AudioButton);
	}
}
