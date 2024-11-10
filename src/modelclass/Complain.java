
package modelclass;

import java.io.Serializable;

/**
 *
 * @author sajid
 */
public class Complain implements Serializable{
    
    private String id;
    private String summary;
    private String body;

    public Complain(String id, String summary,String body) {
        this.id = id;
        this.summary = summary;
        this.body = body;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Complain{" + "id=" + id + ", summary=" + summary + ", body=" + body + "\n";
    }
    
    
    
    
}
