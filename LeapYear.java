public class LeapYear   
{  
  
// a method that checks whether the   
// year y is a leap year or not  
boolean isLeapYr(int y)  
{  
// if condition that handles  
// the century year  
if((y % 100) == 0)  
{  
    if((y % 400) == 0)  
    {  
        return true;  
    }  
    else  
    {  
        return false;  
    }  
  
}  
  
// if condition that handles the  
// non century year  
if((y % 4) == 0)  
{  
    return true;  
}  
  
return false;  
}  
  
// main method  
public static void main(String argvs[])  
{  
// creating an object of the class LeapYear  
LeapYear obj = new LeapYear();  
  
// input 1  
int year = 1996;  
  
if(obj.isLeapYr(year))  
{  
    System.out.println("The year " + year + " is a leap year.");  
}  
else  
{  
    System.out.println("The year " + year + " is not a leap year.");  
}  
  
System.out.println();  
  
// input 2  
year = 1999;  
  
if(obj.isLeapYr(year))  
{  
    System.out.println("The year " + year + " is a leap year.");  
}  
else  
{  
    System.out.println("The year " + year + " is not a leap year.");  
}  
  
System.out.println();  
  
// input 3  
year = 1700;  
  
if(obj.isLeapYr(year))  
{  
    System.out.println("The year " + year + " is a leap year.");  
}  
else  
{  
    System.out.println("The year " + year + " is not a leap year.");  
}  
  
System.out.println();  
  
// input 4  
year = 2000;  
  
if(obj.isLeapYr(year))  
{  
    System.out.println("The year " + year + " is a leap year.");  
}  
else  
{  
    System.out.println("The year " + year + " is not a leap year.");  
}  
  
  
  
  
}  
} 