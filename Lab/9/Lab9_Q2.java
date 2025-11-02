//Lab 9: Question 2
class Plate {
    int length, width;
    Plate(int length, int width) {
        this.length = length; this.width = width;
        System.out.println("Plate Information(length and width) assigned.");
    }
}
class Box extends Plate {
    int height;
    Box(int length, int width, int height) {
        super(length, width); this.height = height;
        System.out.println("Box Information (height) assigned.");
    }
}
class WoodBox extends Box {
    int thick;
    WoodBox(int length, int width, int height, int thick) {
        super(length, width, height); this.thick = thick;
        System.out.println("WoodBox Information(thick) assigned.");
    }
    void display() {
        System.out.println("==========ASSIGNED INFO============");
        System.out.println( "Length = " + length + "\n" + "Width = " + width + "\n" + "Height = " + height + "\n" + "Thick = " + thick);
    }
}
public class Lab9_Q2 {
    public static void main(String[] args) {
        WoodBox wb = new WoodBox(10, 5, 8, 2);
        wb.display();
    }
}