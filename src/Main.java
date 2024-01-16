import com.house.*;
import com.house.Enums.LampType;
import com.house.Enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        LampType lampType = LampType.DESK;
        PaintColor paintColor = PaintColor.WHITE;

        Lamp lamp = new Lamp(lampType, true, 5);
        System.out.println(lamp.toString());

        Bed bed = new Bed("Classic", 2, 40, 1,1);
        System.out.println(bed.toString());

        Wardrobe wardrobe = new Wardrobe(100,200,50);
        System.out.println(wardrobe.toString());

        Carpet carpet = new Carpet(50,100, paintColor);
        System.out.println(carpet.toString());

        Ceiling ceiling = new Ceiling(100, paintColor);
        System.out.println(ceiling.toString());


        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        System.out.println(wall1.toString() + wall2.toString() + wall3.toString() + wall4.toString());

        Bedroom bedroom = new Bedroom("Best bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);
        System.out.println(bedroom.toString());

    }
}