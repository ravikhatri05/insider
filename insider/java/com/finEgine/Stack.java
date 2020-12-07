package com.finEgine;

import java.util.*;

public class Stack {
        Node top;
        class Node {
            Node next;
            Node prev;
            int data;

            public Node(int data) {
                this.data = data;
            }

        }
        void push (int data){
            Node n = new Node(data);
            if(top !=null) {
                top.next = n;
                n.prev=top;
            }
            top = n;
        }
        void pop(){
            if(top!=null) {
                top = top.prev;
                if(top!=null) {
                    top.next = null;
                }
            }else{
                System.out.println("NOTHING TO RUN");
            }
        }
        public static void main(String arg[]) {
           Stack stack = new Stack();
           stack.push(1);
            stack.push(2);

           System.out.println(stack);
            stack.pop();
            System.out.println(stack);
            List<String> arr = new ArrayList<String>();

        }

        public class Employee{
        public Double salary;

        public Double getSalary()
        {
            return salary;
        }
        }

        public class EmployeeComaprator implements  Comparator<Employee>{


            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        }

   /*     Student s-Id
    Cource c_id

            N*N
            Select count(*) from Student,Course where student.s_id = cource.s_id and student.s_id='';
            Select *,count(student_id) from Student,Course where student.s_id = cource.s_id group by student_id having count =(Select count(*) from Student,Course where student.s_id = cource.s_id and student.s_id='')

    */
    }
