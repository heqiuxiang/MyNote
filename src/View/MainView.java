package View;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.ResourceBundle;

import Controller.Editor;
import javafx.fxml.FXML;

/**
 * 
 * @author 18069
 * View part of main screen
 */
public class MainView extends View
{
	// ���������һ����������ģʽ��`<fx:id>Controller`,java�ļ�����������fxml�ļ������
	@FXML
    private EditorView editorviewController;
	
	@Override
	public void propertyChange(PropertyChangeEvent evt)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		// TODO Auto-generated method stub
		
	}
	
}
