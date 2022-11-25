import java.util.Scanner;

public class manavkasa {
    public static void main(String[]args){
        //Değişken oluşturalım
        int armutkilo,elmakilo,domateskilo,muzkilo,patkilo;
        double armututar = 2.14;
        double elmatutar =3.67;
        double domatestutar =1.11;
        double muztutar =0.95;
        double pattutar =5.00;


        Scanner inp =new Scanner(System.in);
        //Kullanıcıdan değer alalım
        System.out.print("Armut kaç kilo  :");
        armutkilo = inp.nextInt();
        System.out.print("Elma kaç kilo  :");
        elmakilo = inp.nextInt();
        System.out.print("Domates kaç kilo  :");
        domateskilo = inp.nextInt();
        System.out.print("Muz kaç kilo  :");
        muzkilo = inp.nextInt();
        System.out.print("Patlıcan kaç kilo  :");
        patkilo = inp.nextInt();

        double toplamtutar =( armututar*armutkilo+elmatutar*elmakilo+domatestutar*domateskilo+muztutar*muzkilo+pattutar* patkilo);
      System.out.println("Toplam Tutar :" + toplamtutar);


    }

}





