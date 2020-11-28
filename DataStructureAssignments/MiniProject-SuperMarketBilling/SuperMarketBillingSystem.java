package SuperMarketBilling;
import java.util.*;
//===============================================BASIC DETAILS==================================================
class SuperMarket
{
    {
		System.out.println("\n");
        System.out.println("                      ********************************");
        System.out.println("                      *  SUPERMARKET BILLING SYSTEM  *");
        System.out.println("                      ********************************\n");
        System.out.println("PROJECT done by: RUSHIKESH JOSHI(200940581025) and SWAPNIL VALWE(200940581034)\n");
        System.out.println("       SUN SHINE SUPERMARKET");
        System.out.println("        Mumbai-Maharashtra\n");
    }
}
//===============================================PARENT CLASS===================================================
abstract class CustomerDetails
{
    Scanner sc= new Scanner(System.in);
    static String customerName;
    static long mobile;
    
    void customerName()
    {
    System.out.println("Enter Customer Full Name: ");
    customerName = sc.nextLine();
    System.out.println("");
    }
    void mobileNumber()
    {
    System.out.println("Enter Customer Mobile Number: ");
    mobile = sc.nextLong();
    System.out.println("");
    }
    
    abstract void display();
}

//===============================================CHILD CLASS====================================================
class LinkListHetro extends CustomerDetails
{
//-----------------------------------Node creation---------------------------------
    Node head;
    class Node
    {
        float data;
        String name;
        Node next;
        
        Node(String s,float d)
        {
            data = d;
            name=s;
            next = null;
        }
    }
    
//---------------------------insertion of values in Node---------------------------
    void insertAtEnd(String s,float d)
    {
        Node n= new Node(s,d);
        Node curr = head;
        if(head==null)
        {
            head=n;
        }
        else
        {
            while(curr.next != null)
            {
                curr=curr.next;
            }
            curr.next=n;
        }
       // System.out.println(n.data+" "+n.name);
    }
    
//-----------------Getting data of perticular position in node---------------------
    static float pdata;
    static String pname;
    void position(int pos)
    {
    Node curr=head;
	if(pos==1)
	{
		pdata = curr.data;
                pname = curr.name;
	}
	else
        {
            int i=1;
            while(i<pos)
            {
                curr=curr.next;
		i++;
            }
            pdata = curr.data;
            pname = curr.name;
        }
      // System.out.println(curr.name+" "+curr.data);
      System.out.println("Selected product is added to billing list...");
    }
    
//---------------Inserting data of purchased product into ArrayList----------------

    float total;
    static int count=0;
    float dis_Total;
    static List<Object> a = new ArrayList<Object>();
    void returnedData()
    {	
        a.add("\n"+pname+" "+pdata+"\n");
        // System.out.println(a);   //printing data of ArrayList
        total = total+pdata; 
        count++;
        //System.out.println("print: "+count);
    }
    
//------------------------method used to generate bill-----------------------------
    void display()//-------------Overridden method of parent class-----------------
    {
        System.out.println("\n");
        System.out.println("===============================================");
        System.out.println("***********************************************");
        System.out.println("          SUN SHINE SUPERMARKET");
        System.out.println("           Mumbai-Maharashtra\n");
        System.out.println("             PRODUCT BILL \n");
        System.out.println("        Customer Name: "+customerName);
        System.out.println("        Mobile Number: "+mobile+"\n");
        System.out.println("LIST OF PURCHASED ITEMS\n");
       
        System.out.println(a);

        System.out.println("\n");
        
        System.out.println("*Number of Products Purchased: "+count);
        System.out.println("*Total Amount = RS: "+total+"\n");
        dis_Total = total * 10/100;
		
		System.out.println("CONGRATULATIONS!!.....You got 10% Discount...");
		
        System.out.println("The applicable discount on the cart is Rs: "+dis_Total+"\n");
        System.out.println("*NET AMOUNT TO PAY = Rs: "+(total-dis_Total));
        
		System.out.println("\n");
        System.out.println("THANK YOU FOR SHOPPING WITH US......");
        System.out.println("VISIT AGAIN!!!");
        
        System.out.println("***********************************************");
        System.out.println("===============================================\n");
    }

//----------------------method to Display Menu on Console--------------------------
    void addProductMenu()
    {
        System.out.println("1.Colgate");
        System.out.println("2.Parachute");
        System.out.println("3.Haldiram's crunchex");
        System.out.println("4.Rin Ditergent Soap");
        System.out.println("5.Samrat Aata");
        System.out.println("6.Maggie Noodles");
        System.out.println("7.Coca-Cola");
        System.out.println("8.Parle-G Gold");
        System.out.println("9.Red Label Tea");
        System.out.println("10.Sunflower Edible Oil");
        System.out.println("11.Everest Masala");
        System.out.println("12.Nestle Kitkat");
        System.out.println("13.Active Popcorn");
        System.out.println("14.Britannia Good-day");
        System.out.println("15.Chocos Cereals");
        System.out.println("16.Dawaat Basmati Rice");
        System.out.println("17.Kurkure");
        System.out.println("18.Godrej Natural Hairdye");
        System.out.println("19.Bornvita");
        System.out.println("20.Pav-Bhaji Masala");
        System.out.println("21.List Completed");
    }
}

//===============================================DRIVER CLASS===================================================
public class SuperMarketBillingSystem
{
    public static void main(String args[])
    {
        
//-------------------------Data Insertion in LINK LIST-----------------------------
        
        LinkListHetro l = new LinkListHetro();
        l.insertAtEnd("COLGATE RS:",80.0F);
        l.insertAtEnd("PARACHUTE RS:",36.0F);
        l.insertAtEnd("HALDIRAM'S CRUNCHEX RS:",120.0F);
        l.insertAtEnd("RIN DITERGENT SOAP RS:",30.0F);
        l.insertAtEnd("SAMRAT AATA RS:",40.0F);
        l.insertAtEnd("MAGGIE NOODLES RS:",12.0F);
        l.insertAtEnd("COCA-COLA RS:",45.0F);
        l.insertAtEnd("PARLE-G GOLD RS:",10.0F);
        l.insertAtEnd("RED LABEL TEA RS:",108.0F);
        l.insertAtEnd("SUNFLOWER EDIBLE OIL RS:",98.0F);
        l.insertAtEnd("EVEREST MASALA RS:",43.0F);
        l.insertAtEnd("NESTLE KITKAT RS:",20.0F);
        l.insertAtEnd("ACTIVE POPCORN RS:",25.0F);
        l.insertAtEnd("BRITANNIA GOOD-DAY RS:",20.0F);
        l.insertAtEnd("CHOCOS CEREALS RS:",88.0F);
        l.insertAtEnd("DAAWAT BASMATI RICE RS:",69.0F);
        l.insertAtEnd("KURKURE RS:",10.0F);
        l.insertAtEnd("GODREJ NATURAL HAIRDYE RS:",19.0F);
        l.insertAtEnd("BORNVITA RS:",168.0F);
        l.insertAtEnd("PAVBHAJI MASALA RS:",30.0F);
        
        SuperMarket M= new SuperMarket();
        Scanner sc= new Scanner(System.in);
        CustomerDetails cd = new LinkListHetro();
        
//-----------------------------Display Menu on Console-----------------------------

        String choice[]={"1.Enter Name","2.Enter Mobile Number","3.Enter Products Purchased","4.Generate Bill","5.Exit","Enter Your Choice :"};
        //System.out.println("Enter Your Choice : ");
        int c;
        do
        {
            for (String s:choice)
              System.out.println(s);
              c=sc.nextInt();
                switch(c)
                    {
                        case 1:
                            cd.customerName();
                            break;
                        case 2:
                            cd.mobileNumber();
                            break;                        
                        case 3:
                            System.out.println("ENTER Product Purchased: ");
                            l.addProductMenu();
                           // String products[]={"1.Colgate Rs:","2.Parashoot Rs:","3.Haldirams crunchex Rs:","4.Rin Rs:","5.Samrat aata Rs:","6.Maggie Rs:","7.Coca Cola Rs:","8.Parle-G Gold Rs:","9.Red Lebal Rs:","10.Soyabean Oil Rs:","11.List Completed"};
                            int product;
                            boolean end = false;
                            
                                while(!end)
                                {
                                    System.out.println("ADD more products or if done press 21: ");
                                    product=sc.nextInt();
                                    
                                    switch(product)
                                    {
                                        case 1:
                                            l.position(1);
                                            l.returnedData();
                                            break;
                                        case 2:
                                            l.position(2);
                                            l.returnedData();
                                            break;
                                        case 3:
                                            l.position(3);
                                            l.returnedData();
                                            break;
                                        case 4:
                                            l.position(4);
                                            l.returnedData();
                                            break;
                                        case 5:
                                            l.position(5);
                                            l.returnedData();
                                            break;
                                        case 6:
                                            l.position(6);
                                            l.returnedData();
                                            break;
                                        case 7:
                                            l.position(7);
                                            l.returnedData();
                                            break;
                                        case 8:
                                            l.position(8);
                                            l.returnedData();
                                            break;
                                        case 9:
                                            l.position(9);
                                            l.returnedData();
                                            break;
                                        case 10:
                                            l.position(10);
                                            l.returnedData();  
                                            break;
                                        case 11:
                                            l.position(11);
                                            l.returnedData();  
                                            break;
                                        case 12:
                                            l.position(12);
                                            l.returnedData();  
                                            break;
                                        case 13:
                                            l.position(13);
                                            l.returnedData();  
                                            break;
                                        case 14:
                                            l.position(14);
                                            l.returnedData();  
                                            break;
                                        case 15:
                                            l.position(15);
                                            l.returnedData();  
                                            break;
                                        case 16:
                                            l.position(16);
                                            l.returnedData();  
                                            break;
                                        case 17:
                                            l.position(17);
                                            l.returnedData();  
                                            break;
                                        case 18:
                                            l.position(18);
                                            l.returnedData();  
                                            break;
                                        case 19:
                                            l.position(19);
                                            l.returnedData();  
                                            break;
                                        case 20:
                                            l.position(20);
                                            l.returnedData();  
                                            break;
                                        default:
                                            System.out.println("PRODUCT LIST COMPLETED !!!\n");
                                            end = true;
                                    }
                                } 
                            break;     
                        case 4:
                            l.display();    
                            break;
                        default:
                            System.out.println("PROCESS COMPLETED......");
                    }    
        }while(c != 5);
    }
}