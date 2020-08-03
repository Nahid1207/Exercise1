package io.nahid;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.concurrent.Flow;

public class Room {
    int roomNo;
    String roomType;
    Double roomArea;
    Boolean ACMachine;

public void setData (int a, String b, double c, Boolean d){
    roomNo=a;
    roomType=b;
    roomArea=c;
    ACMachine=d;

}
public void displayData (){
    System.out.println("Room No is" + roomNo);
    System.out.println("Room type"+ roomType);
    System.out.println("room Area"+ roomArea);
    System.out.println("ACmachine need"+ ACMachine);

}


}
