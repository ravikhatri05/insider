package com.grow;

public class GrowwTest {

    public static void main (String arg[]){


        /**
         *
         * 10
         * 9
         * 8
         * 7
         * 6
         * 5
         * 4
         * 3
         * 2
         * 1
         *o(n)
         * up-    2
         * down-  1
         * start - 1
         * dest - 6
         * total - 10
         */

        /**
         *
         * up 1
         * down 2
         * start 6
         * dest 1
         */
        int up =1;
        int down = 2;
        int start= 6;
        int dest = 1;
        int total =10;

        String s ="\033[31mERROR  \033[0m";
        System.out.print("\033[31mERROR  \033[0m");
/*        if(dest >= start) {
            System.out.println("TOTAL STEPS:"+goingUpDir(start, total, dest, up, down));
        } else {
            System.out.println("TOTAL STEPS:"+goingDownDir(start, total, dest, up, down));
        }

*/





    }

    public static int goingUpDir(int start,int total,int dest,int up,int down){
        int step =0;
        for (int i = start; i<=total;i=i+up){
            step++;
            System.out.println(i);
            if(i==dest){
                break;
            }else if(i>dest && checkIfDestAccesibleDown(i,dest,down)){
                step=step+goingDown(i,dest,down);
                break;
            }
        }
        return step-1;
    }

    public static boolean checkIfDestAccesibleDown(int start, int dest,int down){
        for(int i=start-down;i>=1;i=i-down){
            if(i==dest){
                return true;
            }
            if(i<dest){
                return false;
            }
        }
        return false;
    }

    public static boolean checkIfDestAccesibleUp(int start, int dest,int up,int total){
        for(int i=start+up;i<=total;i=i+up){
            if(i==dest){
                return true;
            }
            if(i>dest){
                return false;
            }
        }
        return false;
    }

    public static int goingDown(int start, int dest,int down){
        int step=0;
        for(int i=start-down;i>=1;i=i-down){
            step++;
            System.out.println(i);
            if(i==dest){
                break;
            }
        }
        return step;
    }

    public static int goingUp(int start, int dest,int up,int total){
        int step=0;
        for(int i=start+up;i<=total;i=i+up){
            step++;
            System.out.println(i);
            if(i==dest){
                break;
            }
        }
        return step;
    }

    public static int goingDownDir(int start,int total,int dest,int up,int down){
        int step =0;
        for (int i = start-down; i>=1;i=i-down){
            step++;
            System.out.println(i);
            if(i==dest){
                break;
            }else if(i<dest && checkIfDestAccesibleUp(i,dest,up,total)){
                step=step+goingUp(i,dest,up,total);
                break;
            }
        }
        return step;
    }

}
