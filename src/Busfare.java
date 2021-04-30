public class Busfare {
    String num="",name = "";
    int km =0;
    double fare = 0.0d;
    Busfare(String n,String nam, int kms){
        num = n;
        name = nam;
        km = kms;
    }
    void calcFare(){
        if(km<=10){
            fare = km*5;
        }
        else if(km>10 && km<=20){
            fare = 50 + (km-10)*10;
        }
        else if(km>20 && km <= 30 ){
            fare = 50 + 100+ (km-20)*15;
        }
        else if(km>30 && km <=40){
            fare = 50 + 100 + 150 + (km-30)*20;
        }
        else {
            fare = 50 + 100 + 150 + 200+ (km-40)*25;
        }
    }
    void show(){
        System.out.println("Bus No.     Name     Kms Travelled      Fare");
        System.out.println(num+"     "+name+"    "+km+"             Rs."+fare);
    }
    public static void main(String args[]){
        Busfare bus1 = new Busfare("14B","Vinit Gupta",32);
        bus1.calcFare();
        bus1.show();
    }
}
