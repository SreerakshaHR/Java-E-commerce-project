import java.io.*;
import java.util.*;
class ecom
{

public double total = 0.0, amt=0.0, change=0.0;
public int serial[] = new int[46];
public String items [] = new String[46];
public String sel[] = new String[46];
public double cost[] = new double [46];
public double price[] = new double [46];
public double quantity[] = new double [46];
public int c=0,z=0,p=0,j=0,y,w,i,d, del=0, a;
public String g= " ";
public void item()
{
	items[1] = "Angels & Demons";
	items[2] = "Desert God";
	items[3] = "Steve Jobs";
	items[4] = "The Deathly Hallows";
	items[5] = "The Immortals Of Meluha (Shiva Trilogy)";
	items[6] = "Color Sensational Creamy Matte Lipstick";
	items[7] = "Enrich Lip Crayon";
	items[8] = "Get Inked! Sketch Eyeliner";
	items[9] = "Eyeconic Kajal";
	items[10] = "BB Cream";
	items[11] = "OnePlus 7t";
	items[12] = "Samsung Galaxy S10";
	items[13] = "iPhone 11 Pro";
	items[14] = "Pixel 3";
	items[15] = "Redmi Note 7 Pro";

	
	cost[1] = 163;
	cost[2] = 392;
	cost[3] = 550;
	cost[4] = 700;
	cost[5] = 399;
	cost[6] = 299;
	cost[7] = 225;
	cost[8] = 450;
	cost[9] = 275;
	cost[10] = 124;
	cost[11] = 39999;
	cost[12] = 76900;
	cost[13] = 99900;
	cost[14] = 47990;
	cost[15] = 14400;
}
	
public void info()throws IOException
{
	int feat;
     Scanner s=new Scanner(System.in);
System.out.println("                    THE FOLLOWING PRODUCTS ARE AVAILABLE ON OUR WEBSITE: \n\n ");
System.out.println("                            NOVELS\n");
System.out.println("                    1.  Angels & Demons ");
System.out.println("                    2.  Desert God");
System.out.println("                    3.  Steve Jobs");
System.out.println("                    4.  The Deathly Hallows");
System.out.println("                    5.  The Immortals Of Meluha (Shiva Trilogy)\n\n");
System.out.println("                            MAKEUP\n");
System.out.println("                    6.  Color Sensational Creamy Matte Lipstick");
System.out.println("                    7.  Enrich Lip Crayon");
System.out.println("                    8.  Get Inked! Sketch Eyeliner");
System.out.println("                    9.  Eyeconic Kajal");
System.out.println("                    10. BB Cream\n\n");
System.out.println("                            MOBILE PHONES\n");
System.out.println("                    11. OnePlus 7t");
System.out.println("                    12. Samsung Galaxy S10");
System.out.println("                    13. iPhone 11 Pro");
System.out.println("                    14. Pixel 3");
System.out.println("                    15. Redmi Note 7 Pro\n\n"); 


System.out.println("Enter a serial number from 1 to 15 to see the features of the product that you are interested to buy:");
feat = s.nextInt();
switch(feat)
{
case 1 : System.out.println("\nAngels & Demons");
     System.out.println("Author: Dan Brown");
         System.out.println("Angels & Demons is a 2000 bestselling mystery-thriller novel \nand published by Pocket Books and then by Corgi Books.");
         System.out.println("The novel introduces the character Robert Langdon, who recurs as \nthe protagonist of Brown's subsequent novels. ");
         System.out.println("Cost - Rs 163\n");
check();
break;
case 2 : System.out.println("\nDesert God");
         System.out.println("Author: Wilbur Smith");
         System.out.println("It was first published in 2014.");
         System.out.println("It is part of a series of novels by Smith set to Ancient Egypt \n and follows the fate of the Egyptian Kingdom through the eyes of Taita, \n a multi-talented and highly skilled eunuch slave.");
         System.out.println("Cost - Rs 392\n");
check();
break;
case 3 : System.out.println("\nSteve Jobs");
         System.out.println("Author: Walter Isaacson");
          System.out.println("Steve Jobs is the authorized self-titled biography book of Steve Jobs. \n The book was written at the request of Jobs by Walter Isaacson, a former executive at CNN and TIME \n who has written best-selling biographies of Benjamin Franklin and Albert Einstein.");
          System.out.println("Cost - Rs 550\n");
check();
break;
case 4 : System.out.println("\nThe Deathly Hallows");
         System.out.println("Author: J K Rowling");
         System.out.println("Harry Potter and the Deathly Hallows is a fantasy novel and the seventh and final novel of the Harry Potter series. \n It was released on 21 July 2007 in the United Kingdom by Bloomsbury Publishing, \n in the United States by Scholastic, and in Canada by Raincoast Books. ");
         System.out.println("The novel chronicles the events directly following Harry Potter and the Half-Blood Prince (2005) \n and the final confrontation between the wizards Harry Potter and Lord Voldemort. ");
         System.out.println("Cost - Rs 700\n");
check();
break; 
case 5 : System.out.println("\nThe Immortals Of Meluha (Shiva Trilogy)");
         System.out.println("Author: Amish");
         System.out.println("The Immortals of Meluha is the first novel of the Shiva trilogy series. ");
         System.out.println("The story is set in the land of Meluha and starts with the arrival of the Shiva. \n The Meluhans believe that Shiva is their fabled saviour Neelkanth. Shiva decides to help the Meluhans \nin their war against the Chandravanshis, who had joined forces with a cursed Nagas; \n however, during his journey and the fight that ensues, Shiva learns how his choices actually reflect \n who he aspires to be and how they lead to dire consequences.");
         System.out.println("cost - Rs 399\n");
check();
break;
case 6 : System.out.println("\nMaybelline Color Sensational Creamy Matte Lipstick");
         System.out.println("Color: Craving Coral");
         System.out.println("Finish: Matte");
         System.out.println("Irresitible color meets precious honey nectar for a supremely sensational lipstick.");
         System.out.println("Cost - Rs 299\n");
check();
break;
case 7:  System.out.println("\nLakme Enrich Lip Crayon");
         System.out.println(" It is a newly formulated lip color crayon, for a soft texture and smooth matte finish. Get soft and colorful lips every day, in 10 different shades of your choice. \n The Lakme Enrich Lip Crayons contain a high level of mineral powders, giving your lips a soft matte finish. ");
         System.out.println("Cost - Rs 225\n");
check();
break; 
case 8 : System.out.println("\nNykaa Get Inked! Sketch Eyeliner");
         System.out.println("Color: Onyx 01");
         System.out.println("Featuring a slender and precise felt tip, this intensely pigmented, waterproof pen lets you \nachieve intense black liquid lines effortlessly. Every stroke gives you an unparalleled, defined fluid finish. \nFine and natural or broad and bold - any look is easy-peasy with this artist!");
         System.out.println("Cost - Rs 450\n");
check();
break;
case 9 : System.out.println("\nLakme Eyeconic Kajal");
         System.out.println("Deep black Kajal that beats time! Perfect for everyday use, the Lakme Eyeconic Kajal is available in 4 gorgeous shades.");
         System.out.println("Lasts 24 hours");
         System.out.println("Water-proof and Smudge-proof");
         System.out.println("Twist the tip to open and apply!");
         System.out.println("Cost - Rs 275\n");
check();
break;
case 10 : System.out.println("\nGarnier Skin Naturals BB Cream");
           System.out.println("SPF 24 | PA+++");
           System.out.println("For natural skincare lovers, Garnier has developed a 5-in-1 natural BB cream with green tea extract and Vitamin E. \nMade from 90% naturally derived ingredients and mineral pigments, this all-in-one BB cream \ncontains a 24-hour moisturizing formula which evens skin tone, \nprovides a radiant complexion, reduces the appearance of skin imperfections and protects skin \nagainst environmental pollutants. Did we mention that this natural bb cream is completely free \nof parabens, silicone, artificial colorants and is vegan? So, what are you\nwaiting for? Buy this bb cream now! Available in light, medium \nand extra light shades to best match your complexion.");
           System.out.println("Cost - Rs 124\n");
check();
break;
case 11 : System.out.println("\nOnePlus 7t");
           System.out.println("Color: Glacier Blue");
           System.out.println("8GB RAM | 256GB Storage");
           System.out.println("Oxygen OS | Android 10");
           System.out.println("Fluid AMOLED Display");
           System.out.println("Cost - Rs 39,999\n");
check();
break;
case 12 : System.out.println("\nSamsung Galaxy S10");
          System.out.println("Color: White");
          System.out.println("8GB RAM | 512GB Storage");
          System.out.println("Android OS");
          System.out.println("Cost - Rs 76,900\n");
 check();
 break; 
case 13 : System.out.println("\nApple Iphone 11 Pro");
          System.out.println("Color: Space Grey");
          System.out.println("Apple iOS");
          System.out.println("64GB Storage | Triple Camera System");
          System.out.println("Cost - Rs 99,900\n");
 check();
break;
case 14 : System.out.println("\nGoogle Pixel 3");
           System.out.println("Color: Clearly White");
           System.out.println("4 GB RAM | 64GB internal memory, expendable upto 64GB ");
           System.out.println("Android 10 OS");
           System.out.println("12.2MP Rear Camera | 8MP+8MP Dual Front Camera");
           System.out.println("5.5 inch");
           System.out.println("Cost: Rs. 47,990\n");
check();
break; 
case 15 : System.out.println("\nMi Note 7 Pro");
           System.out.println("Color: Neptune Blue");
           System.out.println("6 GB RAM | 64GB Storage");
           System.out.println("Android OS");
           System.out.println("48MP+5MP AI Dual Camera");
           System.out.println("Cost: Rs.14,400\n");
check();
break;
default: System.out.println("Please enter a valid serial number\n");
check();
}

}
public void check()throws IOException
{
Scanner s=new Scanner(System.in);
int o;
System.out.println(" Press \n 1. To continue to see the features of the products that you wish to buy. \n 2. To start buying. ");
   o = s.nextInt();
  switch(o)
  {
  case 1: info();
  break;
  case 2: input();
  break;
  default: System.out.println("Invalid number, please try again");
  check();
  }
}
//display the items available in the website
public void display()
{

System.out.println("\n\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ WELCOME TO OUR WEBSITE! $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n\n");




}

//the items purchased

public void choice()
{
System.out.println("Here are the items you have already purchased -");
for(int i=0;i<c;i++)
{
sel[i]=items[serial[i]];
price[i]=cost[serial[i]];
System.out.println((i+1)+". "+sel[i]+" \n\tQuantity: "+quantity[i]);
}
}
//Enter the purchase items and their quantities
public void input()throws IOException
{
for(int i=0;i<16;i++)
{

Scanner s=new Scanner(System.in);
System.out.println();
System.out.println("We request you to keep checking your cart after buying each item so that you are sure of the items you have purchased. Thank you!");
System.out.println();
System.out.println("Enter the choice of item that you wish to purchase:");
serial[i]=s.nextInt();
System.out.println("\nEnter the quantity of the item you wish to purchase:");
quantity[i]=s.nextDouble();
c++;
System.out.println("\nWould you like to purchase another one? \n 1.Yes \n 2.No");
int m=s.nextInt();
switch(m)
{
case 1: info();
break;
case 2:change();
break;
default: System.out.println("Invalid number, please try again");
input();
}
}
}
//Options to the list of items already bought
public void change()throws IOException
{

Scanner s=new Scanner(System.in);
int d=0,cnt=1;
do
{
System.out.println();
System.out.println("Press");
System.out.println("1.To add an item to your shopping cart");
System.out.println("2.To delete an item from your shopping cart");
System.out.println("3.To confirm your bill");
System.out.println("4.To see the items in your shopping cart");
int n=s.nextInt();
switch(n)
{
case 1:for(int i=c;i<16;i++)
              {
                      
                  System.out.println("Enter your choice of item: ");
                  serial[i]=s.nextInt();
                  System.out.println("Enter the quantity:");
                  quantity[c]=s.nextDouble();
                  sel[c]=items[serial[i]];
                  price[c]=cost[serial[i]];
                  c++;
                  System.out.println("Would you like to enter this again? \n1.Yes\n2.No");
                  int m =s.nextInt();
          if(m==1)
              item();
          else 
          break;


              }
                  break;
case 2:System.out.println("Enter the serial number of the item that you wish to remove:");
del=s.nextInt();
for(i=0; i<c; i++)
{
if(serial[i]==del)
{
	System.out.println("The item with the serial number "+serial[i]+" has been deleted.");
	for(a=i; i<=c; a++)
	{
		serial[a]=serial[a+1];
		quantity[a]=quantity[a+1];
		break;
	}
}
}

	c--;
	break;


case 3: System.out.println("\nYour bill has been confirmed.\n");
p=1;z=1;membership();
break;
case 4:
choice();
break;
default: System.out.println("Please try again.");
}
}
while(z==0);
}
public void membership() throws IOException
{

Scanner s=new Scanner(System.in);
System.out.println("Are you a member of our website?\n 1.Yes \n 2.No\n");
int n=s.nextInt();
if(n==1)
{
System.out.println("Please enter you membership number: ");
long mn=s.nextLong();
System.out.println("\nWould you like this amount to be debited to your account? \n 1.Yes \n 2.No");
int r = s.nextInt();
if (r==1)
{
System.out.println("\nThis amount has been successfully debited to your account.");
g="debited";
System.out.println("\nPlease choose your method of payment: \n1.Cash \n 2.Credit Card\n");
int b= s.nextInt();
if (b==1)
{
g="cash"; bill();
}
if  (b==2)
{
g="credit card"; bill();
}
}
if (r==2)
{
System.out.println("\nPlease choose your method of payment: \n1.Cash \n 2.Credit Card\n");
int b= s.nextInt();
if (b==1)
{
g="cash";
bill();
}
if (b==2)
{
g="credit card";
bill();
}
}
//bill();
}
else
{
if(n==2)
{
System.out.println("\nPlease choose your method of payment: \n1.Cash \n 2.Credit Card\n");
int b= s.nextInt();
if(b==1)
{
g="cash";
bill();
}
if(b==2)
{
g= "credit card";
bill();
}
}//options if the customer is not a member
}
}
public void delivery() throws IOException
{

Scanner s=new Scanner(System.in);
System.out.println();
System.out.println();
System.out.println("Please enter your name:");
String name = s.next();
System.out.println("Please enter your city name:");
String city = s.next();
System.out.println("Please enter your mobile no:");
long phone =s.nextLong();
System.out.println(" Please enter your residential address: ");
String add=s.next();
System.out.println("Dear " +name+" living in "+city+ " ,your items will be delivered to you in 2 to 3 working days. \n We hope that you will shop again at our website. \n Thank you!");
}
public  void bill()throws IOException
       {
          if(c!=0)
          {

Scanner s=new Scanner(System.in);
              System.out.println();
              System.out.println();
              System.out.println();
              
              System.out.println("---------------------------------------------------------------");
              System.out.println("*                    Bill No.157392\tCASH BILL                          *");
                                                            
              System.out.println("*                           WEBSITE          *");
              
              System.out.println("*Sl     Particulars          				 Qty        Price      Amount          *");
              for(int i=0;i<c;i++)
              {
              System.out.println("*"+(i+1)+"   "+sel[i]+"     				 "+quantity[i]+"       "+price[i]+"      "+(quantity[i]*price[i])+"\t"+"         "+"*");
                  total=total+(quantity[i]*price[i]);
              }
              if (g.compareTo("cash")==0)
              {
                  System.out.println("*    status"+g                                                 +"*");
              System.out.println("*\tTotal:\t\t\t\t"+total                                           +"*");
               System.out.println("*Enter the amount paid:                                              *");
              amt=s.nextFloat();
	    if(amt<total)
	    {
		System.out.println("Insufficient amount, enter again");
		System.out.println("*Enter the amount paid:                                              *");
              amt=s.nextFloat();
	    }
		else
	 change=amt-total;
		
             
              System.out.println("*\tAmount:\t\t\t\t"+amt                                            +"*");
              System.out.println("*\tChange:\t\t\t"+change                                         			+"*");
              System.out.println("*\tThank You!Please shop with us again.                                             *");
              delivery();
              System.out.println("----------------------------------------------------------------------");
              System.out.println("----------------------------------------------------------------------");
              over();
          }
      
        else if(g.compareTo("credit card")==0)
        {
          System.out.println("*\tTotal:\t\t\t\t"+total                                           +"*");   
          System.out.println("*\tThank You!Please shop with us again.                                             *");
              delivery();
              System.out.println("----------------------------------------------------------------------");
              System.out.println("----------------------------------------------------------------------");
              over();
       }
    }
  }
  public void over()throws IOException
  {
      int u;
      for(u=0;u<=2;u++)
      break;
  }
    }
class Ecom_Demo
{
public static void main(String args[])throws IOException
    { 
      int check=0;
      ecom ob=new ecom();
     ob.display();
      ob.item();
      ob.info();
      ob.check();
      ob.input();
      ob.choice();
      ob.change();
	}           
      
    }