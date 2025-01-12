package scriptfactory.NewGuis;

import scriptfactory.Actions.Action;
import scriptfactory.Consumer;

import java.util.ArrayList;

public class UncommonActionGuiInfo extends NewStatementGUI {
    public UncommonActionGuiInfo(ArrayList<Action> actionList, Consumer<Integer> updateTextField)
    {
        String[] actionTypes = new String[]{"Comment", "Run subscript", "Bank all except IDs", "Change Tick Speed"};
        NewStatementGUI.Descriptions[] setDescs = {
                new Descriptions("Enter any text to be your comment."),
                new Descriptions("Enter the file name of the subscript (cAsE sEnSiTiVe)"),
                new Descriptions("Enter the IDs to keep (comma separated) (i.e. \"995,150,356\") (can be blank)"),
                new Descriptions("Enter the new Tick Speed (in ms), which is time delayed between each line (default 1200)"),
        };
        initGui("Add new uncommon action", actionList, updateTextField, actionTypes, setDescs);
    }
}
