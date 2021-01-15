package com.company;

public class CommandLineArguments {
    public static void main(String args[]) {
        System.out.println("Number Of Command Line Arguments Passed Are : " + args.length);
        for(int i=0;i< args.length;i++){
            System.out.println(args[i]);
            System.out.println("/n");
        }
    }
}
