import javafx.scene.layout.StackPane;

public class Tile extends StackPane {
    private int tileId;
    private String type;
    private String property;

    public Tile() {

    }

    public Tile(int id, String type, String property) {
        this.tileId = id;
        this.type = type;
        this.property = property;
    }


    public int getTileId() {
        return tileId;
    }

    public void setId(int id) {
        this.tileId = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public int getRow(int id) {
        int index = id - 1;

        return index/4;
    }

    public int getColumn(int id) {
       int index = id-1;
       return index%4;
    }

    @Override
    public String toString() {
        return "type= " + type + "" + property;

    }
}