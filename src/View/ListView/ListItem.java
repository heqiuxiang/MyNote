package View.ListView;

import javafx.scene.control.ListCell;

public class ListItem extends ListCell<String>
{
    @Override
    public void updateItem(String string, boolean empty)
    {
        super.updateItem(string,empty);
        if(string != null)
        {
        	// Data���Զ��������Ԫ��
            ItemView data = new ItemView();
            data.setInfo(string);
            setGraphic(data.getBox());
        }
    }
}
