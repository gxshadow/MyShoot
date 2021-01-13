package cn.tedu.shoot.shoot;
import java.awt.image.BufferedImage;
import java.awt.Graphics;

/** ��� */
public class Sky extends FlyingObject  {
	private int step;
	private int y1; //����ƶ�
	
	
	/** ���췽�� */
	public Sky(){
		width = World.WIDTH;
		height = World.HEIGHT;
		x = 0;
		y = 0;
		step = 1;
		y1 = -this.height;
	}
	
	/** ����߲�step() */
	public void step(){
		y+=step;
		y1+=step;
		if(y>=this.height){
			y=-this.height;
		}
		if(y1>=this.height){
			y1=-this.height;
		}
	}
	
	public BufferedImage getImage(){
		return Images.sky;
	}
	
	public void paint(Graphics g){
		g.drawImage(getImage(),x,y,null);
		g.drawImage(getImage(),x,y1,null);
	}
	
	public boolean outOfBounds(){
		return false;
	}
	
}










