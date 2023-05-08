package Gun037.instanceModifiers.publicModifier.same;

public class ChromeBrowser {
    public static void main(String[] args) {
        // public oldugundan rahatlikla ulasabiliyoruz.
        searchEngine google=new searchEngine("chrome");
        google.name="crom";

        System.out.println("google = " + google);
        // toString metoduna gider o da public
    }
}
