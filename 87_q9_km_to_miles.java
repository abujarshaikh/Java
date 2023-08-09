
/*Write a program that asks the user to enter a distance in kilometers and then prints out
how far that distance is in miles. There are 0.621371 miles in one kilometer.
Sample I/O:
How many kilometers?: 5.5
5.500 kilometers is equal to 3.418 miles*/
import java.io.*;

class miles {
    public static void main(String args[]) {
        double km, mile;
        km = 5.5;
        mile = km * 0.621371;
        System.out.println("How many kilometers?: 5.5");
        System.out.println(km + " Kilometers is equal to " + mile + "miles");
    }
}