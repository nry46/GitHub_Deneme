package Gun037.instanceModifiers.protectedModifier.other;

import Gun037.instanceModifiers.protectedModifier.same.Doktor;

public class hastane2 {
    public static void main(String[] args) {
        //protected olduğunda default gibi
        // diğer paketlerden kullanılamıyor.
        //Doktor dr3=new Doktor();

        // bu erişim public olduğundan kullanılabildi.
        Doktor dr4=new Doktor("Ömer");

        // erişim belirteci protected olduğundan kullanılamaz.
        //dr4.print();

    }
}
