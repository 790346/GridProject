import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GridComponent extends JComponent implements MouseListener, ActionListener
{
    int r;
    int c;
    public GridComponent(int rowCount, int columnCount)
    {
        r = rowCount;
        c = columnCount;
    }
//     public java.awt.Point coordinateToCenterPoint(GridCoordinate gridCoordinate){
//         
//     }
//     public GridCoordinate pointToCoordinate(java.awt.Point point){
//         
//     }
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}
    public void actionPerformed(ActionEvent e){}
    public void grid(Graphics g)
    {
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                new GridCell(i * 1, j * 1, 100, 2).paint(g);
            }
        }
    }
}
