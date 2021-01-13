package cn.tedu.shoot.shoot;
import java.awt.image.BufferedImage;
/** �ӵ� */
public class Bullet extends FlyingObject  {
	private int step;
	
	/** ���췽�� */
	public Bullet(int x,int y){
		width = 8;
		height = 20;
		this.x = x;
		this.y = y;
		step = 3;
	}
	
	/** �ӵ��߲�step() */
	public void step(){
		y-=step;
	}
	
	public BufferedImage getImage(){
		if(isLife()){
			return Images.bullet;
		}
		if(isDead()){
			state = REMOVE;
		}
		return null;
	}
	
	public boolean outOfBounds(){
		return this.y<=-this.height;
	}
}







