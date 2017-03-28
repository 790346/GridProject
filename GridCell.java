
/**
 * Write a description of class GridCell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GridCell extends java.lang.Object
{   public static final int BLOCKED_STATE = 2;
    public static final int ENTRY_STATE = 3;
    public static final int EXIT_STATE = 4;
    public static final int PASSABLE_STATE = 1;
    int state = 0;
    int width = 69;
    int height = 69;
    int x = 100;
    int y = 100;
    int left;
    int top;
    int d;
    public GridCell(int leftX, int topY, int dimension, int state)
    {
        left = leftX;
        top = topY;
        state = this.state;
        d = dimension;
    }
    public int getState()
    {
        return state;
    }
    public void setState(int s)
    {
        state = s;
    }
    public void paint(java.awt.Graphics g)
    {
        //g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }
}
