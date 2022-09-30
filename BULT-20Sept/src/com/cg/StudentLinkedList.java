package com.cg;

import java.util.*;
class StudentLinkedList
{
    int record;
    String name;
    int age;
    String dob;

    StudentLinkedList(int record, String name, int age,String dob){
        this.record=record;
        this.name=name;
        this.age=age;
        this.dob=dob;
    }
    public int getRecord(){
        return record;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getDob(){
        return dob;
    }
    public static void main(String[] args) 
    {
        LinkedList<StudentLinkedList> list=new LinkedList<StudentLinkedList>();
        list.add(new StudentLinkedList(1,"bindu",20,"20feb"));
        list.add(new StudentLinkedList(2,"kavya",21,"4mar"));
        list.add(new StudentLinkedList(3,"sandhya",22,"5apr"));
        
        Scanner input=new Scanner(System.in);
        System.out.println("traverse the list:");
        for(StudentLinkedList data:list){
            System.out.println(data.getRecord()+"\t"+data.getName()+"\t"+data.getAge()+"\t"+data.getDob());
        }
        System.out.println("Add element at first:");
        list.addFirst(new StudentLinkedList(0,"koni",22,"1apr"));
        for(StudentLinkedList data:list){
            System.out.println(data.getRecord()+"\t"+data.getName()+"\t"+data.getAge()+"\t"+data.getDob());
        }
        System.out.println("Add element at last:");
        list.addLast(new StudentLinkedList(4,"vinaya",22,"7july"));
        for(StudentLinkedList data:list){
            System.out.println(data.getRecord()+"\t"+data.getName()+"\t"+data.getAge()+"\t"+data.getDob());
        }
        System.out.print("Enter record no to display: ");
        int rec=input.nextInt();
        for(StudentLinkedList data:list){
            if(data.getRecord()==rec){
            System.out.println(data.getRecord()+"\t"+data.getName()+"\t"+data.getAge()+"\t"+data.getDob());
            }
        }
    }
}
