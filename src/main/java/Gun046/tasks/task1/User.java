package Gun046.tasks.task1;

public class User {
    // 1- fieldlari id, username,password,active(boolean), signedIn(boolean)
    // olan user isimli bir class tanimlayin
    // 2-bütün fiedlari parametre alan bir constactor tanimla
    // 3- bütün fiedlari getter ve setter metolari belirleyin
    //4- UserMain isminde bir clas olusturun
    //5- kullanicidan 2 adet user bilgisi isteyerek bir ArryListe doldurun.
    // active ve signedIn default olarak true,false atayabilirsiniz.
    // id yi sistem otomatik versin.
    // 6- eger password 6 dan kücükse yeniden user a girsin.passwordun
    //alti karakterinden kücük olup olmadigini classin icinden kontrol ediniz.


    private int id;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;

    private static int sayac=1;


    public User(String username, String password) {
        //this.id = sayac++; // sayacın o anki değeri atanır,++ lar sağda olduğu için sonrasında değeri 1 artar
        setId();
        setUsername(username);
        setPassword(password);
        setActive(true);
        setSignedIn(false);
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = sayac++; // sayacın o anki değeri atanır,++ lar sağda olduğu için sonrasında değeri 1 artar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 6)
            throw new RuntimeException("Password 6 karakterden az olamaz");

        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}




