import javax.swing.*;
import java.awt.*;

public class NotepadWindow extends JFrame
{
    JTextArea txtArea;
    JMenuBar menu;
    JMenu point1;
    JMenu point2;
    JMenu point3;
    JMenu point4;
    JMenu point5;
    JMenuItem New;
    JMenuItem Open;
    JMenuItem Save;
    JMenuItem SaveAs;
    public NotepadWindow(String title, int width,int height)
    {
        setTitle(title);
        setSize(width,height);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu = new JMenuBar();
        txtArea = new JTextArea();
        point1 = new JMenu("Файл");
        point2 = new JMenu("Правка");
        point3 = new JMenu("Формат");
        point4 = new JMenu("Вид");
        point5 = new JMenu("Справка");
        New = new JMenuItem("Создать");
        Open = new JMenuItem("Открыть...");
        Save = new JMenuItem("Сохранить");
        SaveAs = new JMenuItem("Сохранить как...");
        point1.add(New);
        point1.add(Save);
        point1.add(Open);
        point1.add(SaveAs);
        menu.add(point1);
        menu.add(point2);
        menu.add(point3);
        menu.add(point4);
        menu.add(point5);
        setJMenuBar(menu);
        add(txtArea, BorderLayout.CENTER);
        setVisible(true);
    }
}
