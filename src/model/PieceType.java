package model;

/**
 * Created by bai on 2017/6/17.
 */
public enum PieceType {
    J("将","j"),
    C("车","c"),
    M("马","m"),
    P("炮","p"),
    S("士","s"),
    X("相","x"),
    Z("卒","z")
    ;
    private String name;
    private String tag;

    PieceType(String name, String tag) {
        this.name = name;
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
