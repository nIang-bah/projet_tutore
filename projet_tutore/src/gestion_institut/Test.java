package gestion_institut;


import java.util.*; 
public class Test{ 
public static void main(String[]args){ 
Date d=new Date(); 
Calendar c1=new GregorianCalendar(); 
Calendar c=new GregorianCalendar(2009,12,07); 
Date d2=((GregorianCalendar)c).getGregorianChange(); 
d2= new java.sql.Date(d.getTime()); 
System.out.println(d2.toString()+"\n"); 
} 
}