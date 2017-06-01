package honam.inc.oop.chap06.lib;

public class Rect {
	int width;
	int height;

	public Rect() {
		// TODO Auto-generated constructor stub
	}
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public boolean equals(Rect p) {
		if (width * height == p.height * p.width) {
			return true;
		} else {
			return false;
		}

	}
	public String toString(){
		return "Rect";
	}
}
