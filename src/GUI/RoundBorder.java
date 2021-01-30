package GUI;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class RoundBorder implements Border {
	 
	 public Insets getBorderInsets(Component c) {
	  return new Insets(0,0,0,0);
	 }
	 public boolean isBorderOpaque() {
	  return false;
	 }
	 public void paintBorder(Component c, Graphics g, int x, int y,
	   int width, int height) {
	  //ʹ�ú�ɫ����������Ե����һ��Բ�Ǿ���
	  g.setColor(Color.BLACK);
	  g.drawRoundRect(0, 0, c.getWidth()-1, c.getHeight()-1, 5, 5);
	 }

	}
