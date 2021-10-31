package view;

import javafx.scene.text.Text;

public class PlaceRecord extends Text {
    private String Xid;

    public PlaceRecord() {
        super();
    }

    public PlaceRecord(String text) {
        super(text);
    }

    public String getXid() {
        return Xid;
    }

    public void setXid(String xid) {
        Xid = xid;
    }
}
