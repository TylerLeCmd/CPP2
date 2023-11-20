public class ChessPiece {
    private int posX;
    private int posY;
    private boolean hasHat;
    private String pieceColor;

    public String setSide(String color) {
        this.pieceColor = color;
        return pieceColor;
    }

    public boolean createHat(boolean hasHat) {
        this.hasHat = hasHat;
        return this.hasHat;
    }

    public void setPosition(String row, String column) {
        if (row.toLowerCase().equals('a')) {
            posX = 100;
        } else if (row.toLowerCase().equals('b')) {
            posX = 150;
        } else if (row.toLowerCase().equals('c')) {
            posX = 200;
        } else if (row.toLowerCase().equals('d')) {
            posX = 250;
        } else if (row.toLowerCase().equals('e')) {
            posX = 300;
        } else if (row.toLowerCase().equals('f')) {
            posX = 350;
        } else if (row.toLowerCase().equals('g')) {
            posX = 400;
        } else if (row.toLowerCase().equals('h')) {
            posX = 450;
        } else if (row.toLowerCase().equals('i')) {
            posX = 500;
        } else {
            posX = 1000;
        }
        if(column.toLowerCase().equals('1')) {
            posY = 500;
        } else if (column.toLowerCase().equals('2')) {
            posY = 450;
        }else if (column.toLowerCase().equals('3')) {
            posY = 400;
        }else if (column.toLowerCase().equals('4')) {
            posY = 350;
        }else if (column.toLowerCase().equals('5')) {
            posY = 300;
        }else if (column.toLowerCase().equals('6')) {
            posY = 250;
        }else if (column.toLowerCase().equals('7')) {
            posY = 200;
        }else if (column.toLowerCase().equals('8')) {
            posY = 150;
        }else if (column.toLowerCase().equals('9')) {
            posY = 100;
        } else {
            posY = 1000;
        }
    }
    public int posXPiece(){
        return posX;
    }
    public int posYPiece(){
        return posY;
    }
}
