package ch.lu.home.mygymprogress;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JsonEntity<T>{

    private String key;
    private T value;

    public JsonEntity(String key, T value) {
        super();
        this.key = key;
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
}
