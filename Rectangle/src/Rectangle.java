
public class Rectangle {
	double Length, 
			Width,
			Area,
			Perimeter;
	
	Rectangle() {
		Length=0.0;
		Width=0.0;
		Area=0.0;
;
	}
	
	void set(double length, double width) {
		if (length>0 && length<50) {
			Length = length;
		} else {
			Length = 0;
		}
		if (width>0 && width<50) {
			Width = width;
		} else {
			Width = 0;
		}
	}
	
	void get() {
		System.out.println("Width : " + Width + "Length : " + Length);
	}
	
	double Area() {
		Area = Length * Width;
		return Area;
	}
	
	double Perimeter() {
		Perimeter = 2*(Length + Width);
		return Perimeter;
		
	}

}