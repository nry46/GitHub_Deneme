package Gun038.nonAccessModifier.finalModifier.example2;

public class person {
    String name;
    final int fingerprintCode;

    public person(String name, int fingerprintCode) {
        this.name = name;
        this.fingerprintCode = fingerprintCode;
    }

    // final değişkenlerine ilk değer atama işlemi direk
    // yapılabildiği gibi constructorla da atanabilir.
    // ancak daha sonra yine değeri değiştirilemez.
    // bu işlem ilk değer atama için geçerli.


    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", fingerprintCode=" + fingerprintCode +
                '}';
    }
}
