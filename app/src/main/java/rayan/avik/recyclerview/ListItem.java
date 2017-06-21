package rayan.avik.recyclerview;

/**
 * Created by pc41 on 01-06-2017.
 */

public class ListItem {
    String header;
    String contain;

    public ListItem(String header, String contain) {
        this.header = header;
        this.contain = contain;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }
}
