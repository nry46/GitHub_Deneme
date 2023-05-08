package Gun049.task2.pakt2;

import Gun049.task2.pakt1.pak1Hayvan;

public class pak2kedi extends pak1Hayvan {

    public pak2kedi(String ad, String cinsi) {
        super.ad = ad;
        super.cinsi =cinsi;
    }

    public void BilgiYaz()
    {
        System.out.println("super.ad = " + super.ad);
        System.out.println("super.cinsi = " + super.cinsi);
    }
}
