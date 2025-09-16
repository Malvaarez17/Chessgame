public class King {
    public String color;
    private char currentX;
    private int currentY;
    public Chessboard piece;

    public King(String color, char currentX, int currentY){
        this.color = color;
        this.currentX = currentX;
        this.currentY = currentY;
        this.piece = new Chessboard(color, currentX, currentY);
    }
    
    public boolean validMove(char targetX, int targetY){
        int temp = charConversion(targetX);
        int temp2 = charConversion(this.currentX);
        if(this.piece.bounds(targetX, targetY)){
            if(Math.abs(temp - temp2) == 1 || Math.abs(targetY - this.currentY) == 1){
                return true;
            }
        }return false;
    }

    private int charConversion(char x){
        switch(x){
            case 'A':
                return 1;
            case 'B':
                return 2;
            case 'C':
                return 3;
            case 'D':
                return 4;  
            case 'E':
                return 5;
            case 'F':
                return 6;
            case 'G':
                return 7;
            case 'H':
                return 8;           
        }return -1;
    }

        public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setCurrentX(char x){
        this.currentX = x;
    }

    public char getCurrentX(){
        return this.currentX;
    }

    public void setCurrenty(int y){
        this.currentY = y;
    }

    public int getCurrenty(){
        return this.currentY;
    }

}