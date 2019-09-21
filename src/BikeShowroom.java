//Bikeshowroom using classess,objects and methods
import java.util.Scanner;
class Bike
{
 void setPrice(double x)
 {
   System.out.println("Price: " + x);  
 }
 void engineCapacity(String y)
 {
     System.out.println("Engine: " + y);
 }
 void fuelCapacity(String z)
 {
     System.out.println("Fuel Capacity: " + z);
 }
 void getColor(String c)
 {
     System.out.println("Colors: " + c);
 }
 void start(String s)
 {
     System.out.println("Starting: " + s);
 }
 void weight(String w)
 {
     System.out.println("Weight: " + w);
 }
}

class SportBike extends Bike
{
    void setAlarm(String a)
    {
        System.out.println("Alarm : " + a);
    }
    void getSafeGuard(String g)
    {
        System.out.println("Central lock system: " + g);
    }
    void seatHeight(String sh)
    {
        System.out.println("Seat Height: " + sh);
    }
    void wheelBase(String wb)
    {
        System.out.println("Wheel base:" + wb);
    }
}

class checkAns
{
       void check()
       {
         Scanner m = new Scanner(System.in);
       System.out.println("Do you wanna buy?");
       String ans = m.nextLine();
       if("Yes".equals(ans))
       {
           System.out.println("Thanks for buying...!");
       }
       else 
       {
           System.out.println("Thanks for visiting our Showroom");
       } 
       }
       
}
class honda{
    void cd70() 
     {
       Bike cd = new Bike();
       cd.setPrice(74900);
       cd.engineCapacity("70cc");
       cd.fuelCapacity("8.5 Litres");
       cd.getColor("Red,Black");
       cd.start("Kick start");
       cd.weight("82kg");
       checkAns c = new checkAns();
       c.check();
        
    }
     void cd125()
     {
       Bike cd1 = new Bike();
       cd1.setPrice(124500);
       cd1.engineCapacity("125cc");
       cd1.fuelCapacity("9.2 Litres");
       cd1.getColor("Red,Black");
       cd1.start("Kick start");
       cd1.weight("99kg");
       checkAns c = new checkAns();
       c.check();
    }
     void cd150()
     {
       Bike cd15 = new Bike();
       cd15.setPrice(209500);
       cd15.engineCapacity("150cc");
       cd15.fuelCapacity("13.0 Litres");
       cd15.getColor("White,Red,Black");
       cd15.start("Self-Start/Kick Start");
       cd15.weight("124kg");
       checkAns c = new checkAns();
       c.check();
    }
}

class Unique{
    void ud70() 
     {
        Bike ud = new Bike();
       ud.setPrice(47000);
       ud.engineCapacity("70cc");
       ud.fuelCapacity("9 Litres");
       ud.getColor("Red,Black");
       ud.start("Kick Start");
       ud.weight("90kg");
       checkAns c = new checkAns();
       c.check();
    }
     void ud125()
     {
        Bike ud1 = new Bike();
       ud1.setPrice(75000);
       ud1.engineCapacity("125cc");
       ud1.fuelCapacity("12 Litres");
       ud1.getColor("Black");
       ud1.start("Kick Start");
       ud1.weight("120kg");
       checkAns c = new checkAns();
       c.check();
    }
     void ud150()
     {
       Bike ud15 = new Bike();
       ud15.setPrice(17000);
       ud15.engineCapacity("150cc");
       ud15.fuelCapacity("19.4 Litres");
       ud15.getColor("Blue");
       ud15.start("Kick Start/Push Start");
       ud15.weight("138kg");
       checkAns c = new checkAns();
       c.check();
    }
}

class SuperPower{
    void sp70() 
     {
       Bike sp = new Bike();
       sp.setPrice(48500);
       sp.engineCapacity("70cc");
       sp.fuelCapacity("10 Litres");
       sp.getColor("Black");
       sp.start("Kick Start");
       sp.weight("82kg");
       checkAns c = new checkAns();
       c.check();
    }
     void sp125()
     {
       Bike sp1 = new Bike();
       sp1.setPrice(75000);
       sp1.engineCapacity("125cc");
       sp1.fuelCapacity("12 Litres");
       sp1.getColor("Red");
       sp1.start("Kick Start");
       sp1.weight("120kg");
       checkAns c = new checkAns();
       c.check();
    }
     void sp150()
     {
       Bike sp2 = new Bike();
       sp2.setPrice(137000);
       sp2.engineCapacity("150cc");
       sp2.fuelCapacity("15 Litres");
       sp2.getColor("Red");
       sp2.start("Kick Start/Self Starter");
       sp2.weight("130kg");
       checkAns c = new checkAns();
       c.check();
    }
}

class Suzuki
{
    void hayabusa()
    {
      SportBike hay = new SportBike();
       hay.setPrice(2600000);
       hay.engineCapacity("1340cc");
       hay.fuelCapacity("20 Litres");
       hay.getColor("Blue/Silver, Black/Gray, Red/Black, White/Silver");
       hay.start("Electric");
       hay.weight("220kg");
       hay.setAlarm("Yes");
       hay.getSafeGuard("No");
       hay.seatHeight("130");
       checkAns c = new checkAns();
       c.check();
    }
    void r1000r()
    {
       SportBike r = new SportBike();
       r.setPrice(210000);
       r.engineCapacity("999.0cc");
       r.fuelCapacity("17.5 Litres");
       r.getColor("Blue,White");
       r.start("Self Start");
       r.weight("199kg");
       r.setAlarm("No");
       r.getSafeGuard("Yes");
       r.seatHeight("200");
       checkAns c = new checkAns();
       c.check();
    }
    void s1000()
    {
       SportBike s = new SportBike();
       s.setPrice(235000);
       s.engineCapacity("1000cc");
       s.fuelCapacity("20 Litres");
       s.getColor("Blue,White,Red");
       s.start("Self Start");
       s.weight("230kg");
       s.setAlarm("Yes");
       s.getSafeGuard("Yes");
       s.seatHeight("220");
       checkAns c = new checkAns();
       c.check();
    }
}
class Yamaha
{
    void r6()
    {
       SportBike r6 = new SportBike();
       r6.setPrice(2960000);
       r6.engineCapacity("1200cc");
       r6.fuelCapacity("22 Litres");
       r6.getColor("Black,Blue");
       r6.start("Self Start");
       r6.weight("250kg");
       r6.setAlarm("No");
       r6.getSafeGuard("No");
       r6.seatHeight("250"); 
       checkAns c = new checkAns();
       c.check();
    }
    void r3()
    {
       SportBike r3 = new SportBike();
       r3.setPrice(3110000);
       r3.engineCapacity("1300cc");
       r3.fuelCapacity("24 Litres");
       r3.getColor("White,Red,Blue");
       r3.start("Self Start");
       r3.weight("270kg");
       r3.setAlarm("Yes");
       r3.getSafeGuard("Yes");
       r3.seatHeight("260"); 
       checkAns c = new checkAns();
       c.check();
    }
    void r1m()
    {
       SportBike r1m = new SportBike();
       r1m.setPrice(3250000);
       r1m.engineCapacity("1350cc");
       r1m.fuelCapacity("25 Litres");
       r1m.getColor("Red,Blue");
       r1m.start("Self Start");
       r1m.weight("275kg");
       r1m.setAlarm("Yes");
       r1m.getSafeGuard("No");
       r1m.seatHeight("264"); 
       checkAns c = new checkAns();
       c.check();
    }
}

class Ducati
{
    void v4()
    {
       SportBike v4 = new SportBike();
       v4.setPrice(3360000);
       v4.engineCapacity("1400cc");
       v4.fuelCapacity("26 Litres");
       v4.getColor("Red,Black");
       v4.start("Self Start");
       v4.weight("289kg");
       v4.setAlarm("Yes");
       v4.getSafeGuard("Yes");
       v4.seatHeight("270");
       checkAns c = new checkAns();
       c.check(); 
    }
    void xdiavel()
    {
       SportBike diavel = new SportBike();
       diavel.setPrice(3460000);
       diavel.engineCapacity("1450cc");
       diavel.fuelCapacity("29 Litres");
       diavel.getColor("Black,Blue");
       diavel.start("Self Start");
       diavel.weight("292kg");
       diavel.setAlarm("Yes");
       diavel.getSafeGuard("No");
       diavel.seatHeight("273"); 
       checkAns c = new checkAns();
       c.check();
    }
    void panigale()
    {
        SportBike panigale = new SportBike();
       panigale.setPrice(3360000);
       panigale.engineCapacity("1600cc");
       panigale.fuelCapacity("28 Litres");
       panigale.getColor("Red,Black");
       panigale.start("Self Start");
       panigale.weight("295kg");
       panigale.setAlarm("Yes");
       panigale.getSafeGuard("Yes");
       panigale.seatHeight("230"); 
       checkAns c = new checkAns();
       c.check();
    }
}
public class BikeShowroom {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("****** Welcome to Bike Showroom ******");
     System.out.print("Select Bike Category ");
     System.out.print ("1 for Simple-bike Or 2 for Sport-bike:"); 
     int choice = sc.nextInt();
      honda cd1 = new honda();
     if(choice==1)
     {
        System.out.println ("Select Company? ");
        System.out.println("1. Honda");
        System.out.println("2. Unique");
        System.out.println("3. SuperPower");
        int bikeSelection = sc.nextInt();
        if(bikeSelection == 1){
                System.out.println("Which bike you wanna buy");
                System.out.println("1. Honda CD-70");
                System.out.println("2. Honda CG-125");
                System.out.println("3. Honda CD-150");
                int honda = sc.nextInt();
                if(honda ==1) {
                    cd1.cd70();
                }
                else if(honda == 2)
                {
                    cd1.cd125();
                }
                else if(honda == 3)
                {
                    cd1.cd150();
                }
        }
                else if(bikeSelection == 2)
                {
                System.out.println("Which bike you wanna buy");
                System.out.println("1. Unique UD-70");
                System.out.println("2. Unique UD-125");
                System.out.println("3. Unique UD-150");
                 int unique = sc.nextInt();
                 Unique un1 = new Unique();
                if(unique ==1) {
                    un1.ud70();
                }
                else if(unique == 2)
                {
                    un1.ud125();
                }
                else if(unique == 3)
                {
                    un1.ud150();
                }
                }
                else if(bikeSelection == 3)
                {
                System.out.println("Which bike you wanna buy");
                System.out.println("1. SuperPower SP-70");
                System.out.println("2. SuperPower SP-125");
                System.out.println("3. SuperPower SP-150");
                 int supPow = sc.nextInt();
                SuperPower sp1 = new SuperPower();
                if(supPow ==1) {
                    sp1.sp70();
                }
                else if(supPow == 2)
                {
                    sp1.sp125();
                }
                else if(supPow == 3)
                {
                    sp1.sp150();
                }
           
        }
     }
     else if(choice == 2)
     {
        System.out.println ("Select Company? ");
        System.out.println("1. Suzuki");
        System.out.println("2. Yamaha");
        System.out.println("3. Ducati");
        int sport = sc.nextInt();
        if(sport==1)
        {
            System.out.println("Which bike you wanna buy");
            System.out.println("1. Suzuki Hayabusa");
            System.out.println("2. Suzuki GSX R1000R");
            System.out.println("3. Suzuki GSX S1000");
            int suzuki = sc.nextInt();
            Suzuki s = new Suzuki();
            if(suzuki == 1)
            {
                s.hayabusa();
            }
            else if(suzuki == 2)
            {
                s.r1000r();
            }
            else if(suzuki == 3)
            {
                s.s1000();
            }
        }
        if(sport == 2)
        {
            System.out.println("Which bike you wanna buy");
            System.out.println("1. Yamaha R6");
            System.out.println("2. Yamaha R3");
            System.out.println("3. Yamaha R1m");
            int yamaha = sc.nextInt();
            Yamaha y = new Yamaha();
            if(yamaha == 1)
            {
                y.r6();
            }
            else if(yamaha == 2)
            {
                y.r3();
            }
            else if(yamaha == 3)
            {
                y.r1m();
            }
        }
        if(sport == 3)
        {
            System.out.println("Which bike you wanna buy");
            System.out.println("1. Ducati Panigale V4");
            System.out.println("2. Ducati XDiavel");
            System.out.println("3. Ducati 1299 Panigale ");
            int ducati = sc.nextInt();
            Ducati d =  new Ducati();
            if(ducati == 1)
            {
                d.v4();
            }
            else if(ducati == 2)
            {
                d.xdiavel();
            }
            else if(ducati == 3)
            {
                d.panigale();
            }
        }
     }
     else
     {
         System.out.println("Please Select only 1 or 2");
     }
    }
    
}
