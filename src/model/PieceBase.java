package model;

/**
 * Created by bai on 2017/6/17.
 */
public abstract class PieceBase {
    private PieceType pieceType;
    private int[] location;

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public int[] getLocation() {
        return location;
    }

    public void setLocation(int[] location) {
        this.location = location;
    }
}
